package com.cxp.demo2.model;


import com.cxp.demo2.di.component.DaggerBoyComponent;
import com.cxp.demo2.di.module.BoyModule;
import com.cxp.demo2.di.qualifier.QualifierA;
import com.cxp.demo2.di.qualifier.QualifierB;

import javax.inject.Inject;

/**
 * 文 件 名: User
 * 创 建 人: CXP
 * 创建日期: 2017-05-22 17:28
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class User {

    @QualifierA
    @Inject
    Boy mBoyA;

    @QualifierB
    @Inject
    Boy mBoyB;

    @Inject
    public User() {
        DaggerBoyComponent.builder()
                .boyModule(new BoyModule())
                .build()
                .inject(this);
    }

    public Boy getBoyA() {
        return this.mBoyA;
    }

    public Boy getBoyB() {
        return this.mBoyB;
    }

}
