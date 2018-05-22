package com.dwg.gp.service;

import com.dwg.gp.bean.Dispatch;
import com.dwg.gp.dao.DispatchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispatchService {

    @Autowired
    DispatchMapper dispatchMapper;

    public int addADispatch(Dispatch dispatch) {
        dispatchMapper.insert(dispatch);
        return dispatch.getId();
    }

    public List<Dispatch> getAllDispatches(){
        return dispatchMapper.selectAllDispatch();
    }

    public List<Dispatch> getDriverHistoryDispatch(int id) {
        return dispatchMapper.selectDriverDispatch(id);
    }

    public void sureDispatchArrived(int id) {
        dispatchMapper.updateAddendDateByMId(id);
    }

    public Dispatch getDispatchByDId(int id) {
        return dispatchMapper.selectByPrimaryKey(id);
    }

    public void markStartDate(int id) {
        dispatchMapper.updateStartDate(id);
    }
}
