package com.cxp.demo3.component;


import com.cxp.demo3.MainActivity;
import com.cxp.demo3.module.UserModule;

import dagger.Component;

/**
 * 文 件 名: UserComponent
 * 创 建 人: CXP
 * 创建日期: 2017-05-22 17:36
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
@Component(modules = {UserModule.class})
public interface UserComponent {
    void inject(MainActivity activity);
}
