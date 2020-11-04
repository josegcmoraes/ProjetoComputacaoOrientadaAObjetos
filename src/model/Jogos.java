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
public class Jogos extends Produto{
    private String genero;
    private String marca;
    private String faixaEtaria;
    private String idioma;
    private String plataforma;

    
    public String getGenero(){
        return genero;
    }
    public String getMarca(){
        return marca;
    }
    public String getFaixaEtaria(){
        return faixaEtaria;
    }
    public String getIdioma(){
        return idioma;
    }
    public String getPlataforma(){
        return plataforma;
    }    
    
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setFaixaEtaria(String faixaEtaria){
        this.faixaEtaria=faixaEtaria;
    }
    public void setIdioma(String idioma){
        this.idioma=idioma;
    }
    public void setPlataforma(String plataforma){
        this.plataforma=plataforma;
    }
    
    public void exibir2(Produto prod){
        Jogos p=(Jogos) prod;
        System.out.println("Genero:"+p.getGenero());
        System.out.println("Faixa Etaria:"+p.getFaixaEtaria());
        System.out.println("Idioma:"+p.getIdioma());
        System.out.println("Marca:"+p.getMarca());
        System.out.println("Plataforma:"+p.getPlataforma());
    }
    
        
}
