package org.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.WebRequest;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

import java.util.Map;

/**
 * @author : archer
 * @date : Created in 2023/4/24 12:04
 * @description :
 */
@Configuration
public class ErrorConfig {
//    @Bean
//    public ErrorAttributes errorAttributes() {
//        return new DefaultErrorAttributes() {
//            @Override
//            public Map<String, Object> getErrorAttributes(WebRequest requestAttributes, boolean includeStackTrace) {
//                Map<String, Object> errorAttributes = super.getErrorAttributes(requestAttributes, includeStackTrace);
//                errorAttributes.remove("timestamp");
//                errorAttributes.remove("path");
//                errorAttributes.remove("status");
//                errorAttributes.remove("error");
//                errorAttributes.remove("message");
//                return errorAttributes;
//            }
//        };
//    }
}
