package com.learn.hotbook.domain;

import java.util.Date;

public class Source {

    private int id;
    private String name;//来源名称
    private int state;//状态
    public static final int STATE_USING = 1;//正在使用
    public static final int STATE_UNUSE = 0;//未使用
    private Date createTime;//创建时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
