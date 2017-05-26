package com.cxp.demo3.model;


import com.cxp.demo3.component.DaggerBoyComponent;
import com.cxp.demo3.module.BoyModule;

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

    @Inject
    Boy mBoyA;

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
