package com.cxp.demo2.di.module;


import com.cxp.demo2.model.Boy;
import com.cxp.demo2.di.qualifier.QualifierA;
import com.cxp.demo2.di.qualifier.QualifierB;

import dagger.Module;
import dagger.Provides;

/**
 * 文 件 名: BoyModule
 * 创 建 人: CXP
 * 创建日期: 2017-05-22 17:47
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
@Module
public class BoyModule {

    @QualifierA
    @Provides
    Boy provideBoyA(){
        return new Boy("小黑");
    }

    @QualifierB
    @Provides
    Boy provideBoyB(){
        return new Boy("小白");
    }

}
