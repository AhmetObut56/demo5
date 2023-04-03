package com.obut.mvc.limit.services.Controller;
//BURASI APİ DİR restapi
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.obut.mvc.limit.services.bean.Limits;
import com.obut.mvc.limit.services.config.configüration;

@RestController //dış dünyaya açmak için

public class LimitsController {
	
	@Autowired
	private configüration config;//buradaki diğer taraftaki class ın ismi
	@GetMapping("/LİMİTS")//Get metodu olduğu için url tanımlamak için 
	public Limits retrieveLimits() {//Limits leri alan bean döndürmek için
	//return new Limits(1,1000);//import ederek çözdü burayı
	return new Limits(config.getMin(),config.getMax());
	
}
	
	

}
