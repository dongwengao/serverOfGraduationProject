package com.dwg.gp.service;

import com.dwg.gp.bean.Deliver;
import com.dwg.gp.dao.DeliverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliverService {

    @Autowired
    DeliverMapper deliverMapper;

    public void updateDeliverForDispatched(int id) {
        deliverMapper.updateDeliverStateForDispatched(id);
    }

    public void updateDeliverForStarted(int id) {
        deliverMapper.updateDeliverStateForStarted(id);
    }
}
