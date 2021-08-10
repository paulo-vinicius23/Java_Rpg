package com.Projeto.Demon;
public abstract class Humanoide {
	private String nome;
	private int energia;
	private int experiencia;
	private String classe;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getExperiencia(){
        return this.experiencia;
    }
    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }
    public int getEnergia(){
        return this.energia;
    }
    public void setEnergia(int energia){
        this.energia = energia;
    }
    public String getClasse(){
        return this.classe;
    }
    public void setClasse(String classe){
        this.classe = classe;
    }
    public void print(){
    	System.out.println("Nome: " + this.nome);
		System.out.println("Classe: " + this.classe);
		System.out.println("Energia: " + this.energia);
		System.out.println("Experiencia: " + this.experiencia);
		System.out.println();
    }
}
