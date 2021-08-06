package com.Projeto.Demon;
public class Monstros {
	private int energia;
	private String classe;
	
	public int getEnergia(){
		return energia;
	}
	public void setEnergia(int energia){
		this.energia = energia;
	}
	public String getClasse(){
		return classe;
	}
	public void setClasse(String classe){
		this.classe = classe;
	}
	public void print(){
		System.out.println("Classe: " + this.classe);
		System.out.println("Energia: " + this.energia);
		System.out.println();
    }
}
