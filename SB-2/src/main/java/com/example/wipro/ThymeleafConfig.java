package com.example.wipro;

import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

public class ThymeleafConfig {
	
	@Bean 
	public SpringResourceTemplateResolver templateResolver1() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		//templateResolver.setCacheable(false);
		templateResolver.setPrefix("new1/");
		templateResolver.setSuffix(".htm");
		//setOrder required to mention the order of the view engines,when using multiple view engines
		//templateResolver.setOrder(1);
		templateResolver.setCheckExistence(true);
		return templateResolver;
	}
	
	@Bean
    public SpringResourceTemplateResolver templateResolver2() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();            
        templateResolver.setPrefix("classpath:/newDir2/");
        templateResolver.setSuffix(".htm");           
        return templateResolver;
    }
	@Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
        springTemplateEngine.addTemplateResolver(templateResolver1());
        springTemplateEngine.addTemplateResolver(templateResolver2());
        return springTemplateEngine;
    }
	
	@Bean
	    public ThymeleafViewResolver viewResolver() {
	        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
	        viewResolver.setTemplateEngine(templateEngine());
	        //viewResolver.setOrder(1);
	        return viewResolver;
	    }

}
