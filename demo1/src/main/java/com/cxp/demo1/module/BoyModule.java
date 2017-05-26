package com.cxp.demo1.module;


import com.cxp.demo1.model.Boy;

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

    @Provides
    Boy provideBoy(){
        return new Boy("小黑");
    }

}
