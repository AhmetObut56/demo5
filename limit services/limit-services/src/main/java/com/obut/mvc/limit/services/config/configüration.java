package com.obut.mvc.limit.services.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties("limit-service")//s büyüklüğüne ve - ye dikkat etmek lazım
@Component
public class configüration {
	//değerlerin eşleştiğinden emin olmak için arka tarafla iletişim kurmak için annotatin ekledi
	
	
	private int min;
	public int getMin() {
		return min;
		
		
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	private int max;
	
	
	

}
