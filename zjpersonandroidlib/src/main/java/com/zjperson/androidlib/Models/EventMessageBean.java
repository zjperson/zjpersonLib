package com.zjperson.androidlib.Models;

import com.zjperson.androidlib.Base.BaseModels.BaseModel;

import java.io.Serializable;
/**
* created by zjperson
* 事件订阅实体类 构建消息实体
* Email zjperson@gmail.com
*/
public class EventMessageBean<T> extends BaseModel implements Serializable {

    private static final long serialVersionUID = 1L;

    public String id;
    public int type;
    public T data;//多种类型数据，一般是List集合，比如获取所有员工列表

}
