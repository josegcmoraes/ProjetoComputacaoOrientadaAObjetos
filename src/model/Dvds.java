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
public class Dvds extends Disco{
    private String idioma;
    private String faixaEtaria;

    public String getIdioma(){
        return idioma;
    }
    public String getFaixaEtaria(){
        return faixaEtaria;
    }

    public void setIdioma(String idioma){
        this.idioma=idioma;
    }
    public void setFaixaEtaria(String faixaEtaria){
        this.faixaEtaria=faixaEtaria;
    }
    
    
    public void exibir3(Produto prod){
        Dvds p=(Dvds) prod;
        System.out.println("Idioma:"+p.getIdioma());
        System.out.println("Faixa etaria:"+p.getFaixaEtaria());
    }    
}
