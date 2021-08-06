package com.Projeto.Demon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class DemonApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemonApplication.class, args);
		
		System.out.println();
		Ladino lad = new Ladino(10, 20, "Leo");
		Mago mag = new Mago(10, 30, "Meg");
		Paladino pala = new Paladino(20, 10, "Paula");
		Guerreiro gu = new Guerreiro(30, 5, "Gugu");
		Enguia eng = new Enguia(20);
		Cerbero cerb = new Cerbero(50);

		lad.print(); mag.print(); pala.print();
		gu.print(); eng.print(); cerb.print();
	}
}
