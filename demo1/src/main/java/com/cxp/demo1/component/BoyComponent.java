package com.cxp.demo1.component;

import com.cxp.demo1.model.User;
import com.cxp.demo1.module.BoyModule;

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
@Component(modules = {BoyModule.class})
public interface BoyComponent {
    void inject(User user);
}
