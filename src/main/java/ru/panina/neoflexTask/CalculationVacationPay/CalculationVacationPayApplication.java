package ru.panina.neoflexTask.CalculationVacationPay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculationVacationPayApplication {
	public static void main(String[] args) {
		SpringApplication.run(CalculationVacationPayApplication.class, args);
	}
	@GetMapping
	public String calculate (){
		return "Hello new app";
	}

}
