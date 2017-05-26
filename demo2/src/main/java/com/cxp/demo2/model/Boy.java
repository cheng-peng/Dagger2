package com.cxp.demo2.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * 文 件 名: Boy
 * 创 建 人: CXP
 * 创建日期: 2017-05-22 17:34
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Boy {

    //姓名
    private String name;

    @Inject
    public Boy(String name) {
        this.name = name;
        Log.e("CXP","执行构造");
    }

    public String sayHello(){
        return name+"，你是个男孩！~";
    }
}
