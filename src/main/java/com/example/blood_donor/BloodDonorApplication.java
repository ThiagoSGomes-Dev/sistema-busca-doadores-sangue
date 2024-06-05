package com.example.blood_donor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BloodDonorApplication {

	public static void main(String[] args) {
		try {
			// Adiciona um atraso de 3 segundos
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		SpringApplication.run(BloodDonorApplication.class, args);
	}
}
