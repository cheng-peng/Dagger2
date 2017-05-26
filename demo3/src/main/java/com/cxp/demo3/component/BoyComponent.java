package com.cxp.demo3.component;


import com.cxp.demo3.model.User;
import com.cxp.demo3.module.BoyModule;
import com.cxp.demo3.scope.UserScope;

import dagger.Component;

/**
 * 文 件 名: BoyComponent
 * 创 建 人: CXP
 * 创建日期: 2017-05-22 17:48
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
@UserScope
@Component(modules = {BoyModule.class})
public interface BoyComponent {
    void inject(User user);
}
