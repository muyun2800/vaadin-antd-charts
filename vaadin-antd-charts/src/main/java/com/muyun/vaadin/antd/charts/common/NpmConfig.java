package com.muyun.vaadin.antd.charts.common;

import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.react.ReactAdapterComponent;

/**
 * 配置本项目所依赖的 npm 包
 *
 * @author muyun
 **/
@NpmPackage.Container({
        @NpmPackage(value = "@ant-design/charts", version = "2.6.5"),
        // @NpmPackage(value = "@ant-design/icons", version = "5.6.1"),
        //  @NpmPackage(value = "antd-style", version = "3.7.1"),
        // @NpmPackage(value = "@babel/standalone", version = "7.26.10"),
        // @NpmPackage(value = "react-fast-marquee", version = "1.6.5"),
        // @NpmPackage(value = "html-react-parser", version = "5.2.3"),
})
public class NpmConfig extends ReactAdapterComponent {


}
