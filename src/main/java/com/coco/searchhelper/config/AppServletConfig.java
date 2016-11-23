package com.coco.searchhelper.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configurable
@ComponentScan("com.coco.searchhelper")
@EnableWebMvc
public class AppServletConfig {

}
