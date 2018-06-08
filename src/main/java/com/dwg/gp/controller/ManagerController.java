package com.dwg.gp.controller;

import com.dwg.gp.bean.*;
import com.dwg.gp.bean.Package;
import com.dwg.gp.service.*;
import com.dwg.gp.utils.Base64ImageUtil;
import com.dwg.gp.utils.QRCodeUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/manager1")
public class ManagerController {

    @Autowired
    EmployeeInfoService employeeInfoService;

    @Autowired
    MerchandiseService merchandiseService;

    @Autowired
    ManagerService managerService;

    @Autowired
    PackageService packageService;

    @Autowired
    DispatchService dispatchService;

    @Autowired
    PointService pointService;

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/addmerchandise")
    public String addMerchandise(@RequestParam("id") int id, HttpServletRequest request, Model model) throws Exception {
        Employee employee = employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee", employee);
        model.addAttribute("img", Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "manager/manager_addmerchandise";
    }

    @RequestMapping("/excel")
    public String Excel(@RequestParam("id") int id, HttpServletRequest request, Model model) throws Exception {
        Employee employee = employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee", employee);
        model.addAttribute("img", Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "manager/manager_excel";
    }

    @RequestMapping("/examInputMerchandise")
    public String examInputMerchandise(@RequestParam("id") int id, HttpServletRequest request, Model model) throws Exception {
        Employee employee = employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee", employee);
        model.addAttribute("img", Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "manager/manager_examInputmerchandise";
    }

    @RequestMapping("/getLocationInfo")
    public String GetLocationInfo(HttpServletRequest request, @RequestParam("id") int id, Model model) throws Exception {
        Employee employee = employeeInfoService.getEmployeeForCostar(id);
        Point point = pointService.getPointByManagerId(id);
        model.addAttribute("employee", employee);
        model.addAttribute("img", Base64ImageUtil.byteArr2String(employee.getPhoto()));
        model.addAttribute("point", point);
        return "manager/manager_location";
    }

    @RequestMapping("/suremerchandise")
    @ResponseBody
    public Msg sureMerchandise(@RequestParam("id") int id, HttpServletRequest request, Model model) throws Exception {
       //更新货车司机信息
        merchandiseService.sureDeliverByMerchandiseId(id);
        merchandiseService.sureArrive(id);
        dispatchService.sureDispatchArrived(id);
        return Msg.success().add("success", "success");
    }

    @RequestMapping("/suremerchandisepack")
    @ResponseBody
    public Msg sureMerchandisePack(@RequestParam("id") int id, HttpServletRequest request, Model model) throws Exception {
        packageService.surePackArrived(id);
        return Msg.success().add("success", "success");
    }

    @RequestMapping("/getallinput")
    @ResponseBody
    public Msg getAllInput(HttpServletRequest request, @RequestParam("id") int id) {
        Manager manager = managerService.getManagerById(id);
        int shouldendpoint = manager.getPoint().getId();
        List<Merchandise> merchandises = merchandiseService.getAllMerchandiseForendPoint(shouldendpoint);
        return Msg.success().add("merchandises", merchandises);
    }

    @RequestMapping("/addmerchandiseforid")
    @ResponseBody
    public Msg addMerchandiseForId(HttpServletRequest request) {
        Merchandise m = new Merchandise();
        merchandiseService.addAMerchandiseAndGetId(m);
        return Msg.success().add("mid", m.getId());
    }

    @RequestMapping("/getpacksbymid")
    @ResponseBody
    public Msg getPacksByMid(HttpServletRequest request, @RequestParam("mid") int mid) {
        return Msg.success().add("packs", packageService.getpacksByMid(mid));
    }

    @RequestMapping("/getpointId")
    @ResponseBody
    public Msg getPointId(HttpServletRequest request, @RequestParam("id") int id) {
        Manager manager = managerService.getManagerById(id);
        return Msg.success().add("pointId", manager.getPointId());
    }

    @RequestMapping("/updatetheMerchandise")
    @ResponseBody
    public Msg updateTheMerchandise(HttpServletRequest request, Merchandise merchandise) {
        merchandiseService.updateMerchandise(merchandise);
        //add a quick response image
        int merchandiseId = merchandise.getId();
        byte[] bytes = QRCodeUtil.getQrcodeImg(merchandiseId + "");
        merchandiseService.addQRCode(merchandiseId, bytes);
        return Msg.success().add("success", "添加成功");
    }

    @RequestMapping("/doexcel")
    @ResponseBody
    public Msg doExcel(HttpServletRequest request, @RequestParam(value = "file") MultipartFile file) {
        if (!file.isEmpty()) {
//                String filePath=request.getSession().getServletContext().getRealPath("/")+file.getOriginalFilename();
            Merchandise m = new Merchandise();
            merchandiseService.addAMerchandiseAndGetId(m);
            int mid = m.getId();
            Map map = new HashMap();
            Integer volumn;
            Integer weight;
            String startPointStr;
            String endPointStr;
            try {
                XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());

                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                    XSSFSheet sheet = workbook.getSheetAt(i);
                    if (sheet == null) {
                        continue;
                    }
                    for (int j = 1; j <= sheet.getLastRowNum() - 2; j++) {
                        XSSFRow row = sheet.getRow(j);
                        map.put(row.getCell(0).getStringCellValue(), (int)row.getCell(1).getNumericCellValue());
                    }

                    XSSFRow row = sheet.getRow(sheet.getLastRowNum());
                    volumn = (int)row.getCell(0).getNumericCellValue();
                    weight = (int)row.getCell(1).getNumericCellValue();
                    startPointStr = row.getCell(2).getStringCellValue();
                    endPointStr = row.getCell(3).getStringCellValue();

                    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
                    Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
                    while (iterator.hasNext()) {
                        Map.Entry<String, Integer> en = iterator.next();
                        String key = en.getKey();
                        Integer value = en.getValue();

                        int goodsId = goodsService.getGoodsByName(key);
                        Package p = new Package();
                        p.setGoodsId(goodsId);
                        p.setNum(value);
                        p.setMerchandiseId(mid);
                        packageService.packageSaved(p);
                    }
                    Merchandise merchandise = new Merchandise();
//            volumn weight startpoint  endpoint #{mid}
                    Point startpoint=pointService.getPointByName(startPointStr);
                    Point endpoint=pointService.getPointByName(endPointStr);

                    merchandise.setId(mid);
                    merchandise.setEndpoint(endpoint.getId());
                    merchandise.setStartpoint(startpoint.getId());
                    merchandise.setVolumn((double)volumn);
                    merchandise.setWeight((double)weight);
                    merchandiseService.updateMerchandise(merchandise);

                    byte[] bytes = QRCodeUtil.getQrcodeImg(mid + "");
                    merchandiseService.addQRCode(mid, bytes);

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Msg.success().add("success", "添加成功");
    }

}
