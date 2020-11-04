/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author josegcm
 */
public class Disco extends Produto{
    private String genero;
    private String gravadora;
    private int ano;
    private int duracao;

    public String getGenero(){
        return genero;
    }
    public String getGravadora(){
        return gravadora;
    }
    public int getAno(){
        return ano;
    }
    public int getDuracao(){
        return duracao;
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setGravadora(String gravadora){
        this.gravadora=gravadora;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public void setDuracao(int duracao){
        this.duracao=duracao;
    }
    
    
    public void exibir2(Produto prod){
        Disco p=(Disco) prod;
        System.out.println("Genero:"+p.getGenero());
        System.out.println("Gravadora:"+p.getGravadora());
        System.out.println("Ano de producao:"+p.getAno());
        System.out.println("Duracao:"+p.getDuracao());
    }
        
}
