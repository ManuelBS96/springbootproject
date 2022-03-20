package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentImplement;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	public ComponentDependency componente;
	//public ComponentImplement comp;

	public FundamentosApplication(@Qualifier("componentTres") ComponentDependency componentDependency) {
	this.componente = componentDependency;
	}
   /*public FundamentosApplication(ComponentImplement comp) {
		this.comp = comp;
   }*/
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
		//System.out.println("Hola Mundo usando Spring Boot");
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Mundo usando Spring Boot");
		this.componente.Saludar();
	}
}
