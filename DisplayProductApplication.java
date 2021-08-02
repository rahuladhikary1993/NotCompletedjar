package com.DisplayProduct.DisplayProduct;

import java.util.ArrayList;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class DisplayProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayProductApplication.class, args);
		
		//@GetMapping("/Createproduct")
		ArrayList product1 = new ArrayList<>();
		product1.add("Prod1");
		product1.add("shirt");
		product1.add("EACH");
		
		ArrayList product2 = new ArrayList<>();
		product2.add("Prod2");
		product2.add("Trouser");
		product2.add("EACH");
		
		ArrayList product3 = new ArrayList<>();
		product3.add("Prod3");
		product3.add("tie");
		product3.add("EACH");
		
		System.out.println(product1);
	}

}
