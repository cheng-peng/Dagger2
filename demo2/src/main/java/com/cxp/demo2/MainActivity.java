package com.cxp.demo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.cxp.demo2.di.component.DaggerUserComponent;
import com.cxp.demo2.model.User;
import com.cxp.demo2.di.module.UserModule;

import javax.inject.Inject;

/**
 * @Inject 定义在变量和构造上  变量对应的构造
 * @Module @Provides  @Component(modules = {BoyModule.class})  用来实现实例化的依赖
 * @Qualifier  @Retention(RetentionPolicy.RUNTIME) 自定义注解 当有两个实体要实例化的时候 要用这些
 * @Scope @Retention(RetentionPolicy.RUNTIME)  自定义注解 多次调用同一个类，只执行一遍构造
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    User user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerUserComponent.builder()
                .userModule(new UserModule())
                .build()
                .inject(this);

        Log.e("CXPA", user.getBoyA().sayHello());
        Log.e("CXPB", user.getBoyB().sayHello());
    }
}
