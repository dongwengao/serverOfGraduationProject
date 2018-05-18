package com.dwg.gp.bean;

public class Dispatcher {
    private Integer dispatcherId;

    @Override
    public String toString() {
        return "Dispatcher{" +
                "dispatcherId=" + dispatcherId +
                '}';
    }

    public Integer getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Integer dispatcherId) {
        this.dispatcherId = dispatcherId;
    }
}