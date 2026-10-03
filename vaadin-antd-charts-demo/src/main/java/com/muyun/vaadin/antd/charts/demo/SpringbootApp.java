package com.muyun.vaadin.antd.charts.demo;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.theme.NoTheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Push
@SpringBootApplication(scanBasePackages = {"com.muyun"})
@NoTheme
public class SpringbootApp implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApp.class, args);
    }


}
