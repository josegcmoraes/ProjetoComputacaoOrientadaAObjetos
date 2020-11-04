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
public class Cds extends Disco{
    private String cantores;

    public String getCantores(){
        return cantores;
    }

    public void setCantores(String cantores){
        this.cantores=cantores;
    }
    
    
    public void exibir3(Produto prod){
        Cds p=(Cds) prod;
        System.out.println("Cantores:"+p.getCantores());
    }    
}
