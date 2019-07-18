package com.demo.strategyservice.util;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class StrategyFactory {

	@Autowired
	private ApplicationContext applicationContext;

	@SuppressWarnings("unchecked")
	public <T> T getStrategy(Class<T> strategyType, String value) {

		Map<String, Object> annotatedBeanClasses = applicationContext.getBeansWithAnnotation(StrategyService.class);
		return (T) annotatedBeanClasses.get(value.toUpperCase());
	}

}
