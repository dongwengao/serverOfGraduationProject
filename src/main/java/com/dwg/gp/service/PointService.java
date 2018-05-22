package com.dwg.gp.service;
import com.dwg.gp.bean.Point;
import com.dwg.gp.dao.PointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {

    @Autowired
    PointMapper pointMapper;

    public List<Point> getAllPoints() {
        return pointMapper.selectAllPoint();
    }

    public List<Point> getAllShouldDispatchPoints() {
        return pointMapper.selectAllPointNeedDispatch();
    }

    public Point getPointById(int id) {
        return pointMapper.selectByPrimaryKey(id);
    }

    public Point getPointByManagerId(int id) {
        return pointMapper.selectPointByManagerId(id);
    }
}
