package org.sky.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"org.sky.controller", "org.sky.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
