package com.cxp.demo3.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 文 件 名: UserScope
 * 创 建 人: CXP
 * 创建日期: 2017-05-22 18:31
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {
}
