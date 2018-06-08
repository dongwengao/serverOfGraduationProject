package com.dwg.gp.service;

import com.dwg.gp.bean.Merchandise;
import com.dwg.gp.dao.MerchandiseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchandiseService {

    @Autowired
    MerchandiseMapper merchandiseMapper;

    public void addAMerchandiseAndGetId(Merchandise merchandise){
        merchandiseMapper.insertForId(merchandise);
    }

    public void updateMerchandise(Merchandise merchandise) {
        merchandiseMapper.updateByMerchandise(merchandise);
    }

    public List<Merchandise> getAllMerchandiseForendPoint(int shouldendpoint) {
        return merchandiseMapper.selectAllByShoudendPointId(shouldendpoint);
    }

    public void sureArrive(int id) {
        merchandiseMapper.updateByMerchandiseForState(id);
    }

    public List<Merchandise> getAllMerchandise() {
        return merchandiseMapper.selectAll();
    }

    public List<Merchandise> getNeedDispatchMerchandise() {
        return merchandiseMapper.selectAllNeedDispatche();
    }

    public List<Merchandise> getMerchandiseByPid(int id) {
        return merchandiseMapper.selectMerchandiseByPId(id);
    }

    public void updateMerchandiseForDispatched(int id) {
        merchandiseMapper.updateDispatchedState(id);
    }

    public Merchandise getMerchandiseById(int id) {
        return merchandiseMapper.selectByPrimaryKey(id);
    }

    public void addQRCode(int merchandiseId, byte[] bytes) {
        merchandiseMapper.updateForQrCode(merchandiseId,bytes);
    }

    public void sureDeliverByMerchandiseId(int id) {
        merchandiseMapper.updateByMerchandiseIdForDeliver(id);
    }
}
