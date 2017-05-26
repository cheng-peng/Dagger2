package com.cxp.demo3.module;


import com.cxp.demo3.model.Boy;
import com.cxp.demo3.scope.UserScope;

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

    @UserScope
    @Provides
    Boy provideBoy(){
        return new Boy("小黑");
    }


}
