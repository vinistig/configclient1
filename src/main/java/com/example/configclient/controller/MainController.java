package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationProperties;

@RefreshScope
@RestController
public class MainController {
    // @Value("${text.copyright: Default Copyright}")
    // private String copyright;

    // @Value("${spring.datasource.driver-class-name}")
    // private String driverClassName;

    // @Value("${spring.datasource.url}")
    // private String url;

    // @Value("${spring.datasource.username}")
    // private String userName;

    // @Value("${spring.datasource.password}")
    // private String password;

    @Value("${color}")
    private String color;

    @Value("${fruit}")
    private String fruit;

    @Value("${hobbie}")
    private String hobbie;

    @Value("${vehicle}")
    private String vehicle;

    @Value("${sport}")
    private String sport;
    // @Value("${test.property}")
    // private String testProperty;

    // @Value("${test.local.property}")
    // private String localTestProperty;

    // @Autowired
    // private DataSource dataSource;

    @RequestMapping("/")
    @ResponseBody
    public String showConfig() {
        // String configInfo = "Copy Right: " + copyright //
        // + "<br/>spring.datasource.driver-class-name=" + driverClassName //
        // + "<br/>spring.datasource.url=" + url //
        // + "<br/>spring.datasource.username=" + userName //
        // + "<br/>spring.datasource.password=" + password;
        String configInfo = color + " " + fruit + " " + hobbie + " " + vehicle + " " + sport;
        return configInfo;
    }
}