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
public class Celular extends Produto{
    private String versaoSO;
    private double tamanhoTela;
    private int camera;
    private int bateria;

    public String getVersaoSO(){
        return versaoSO;
    }
    public double getTamanhoTela(){
        return tamanhoTela;
    }
    public int getCamera(){
        return camera;
    }
    public int getBateria(){
        return bateria;
    }

    public void setVersaoSO(String versaoSO){
        this.versaoSO=versaoSO;
    }
    public void setTamanhoTela(double tamanhoTela){
        this.tamanhoTela=tamanhoTela;
    }
    public void setCamera(int camera){
        this.camera=camera;
    }
    public void setBateria(int bateria){
        this.bateria=bateria;
    }
  
   
    public void exibir(Produto prod){
        Celular p=(Celular) prod;
        System.out.println("==================================");
        System.out.println("Marca:"+prod.getNome());
        System.out.println("Categoria:"+prod.getCategoria());
        System.out.println("Codigo:"+prod.getCodigo());
        System.out.println("Quantide em Estoque:"+prod.getQuantidadeEmEstoque());
        System.out.println("Descricao:"+prod.getDescricao());
    
        System.out.println("Versao S.O. :"+p.getVersaoSO());
        System.out.println("Tamanho da tela:"+p.getTamanhoTela());
        System.out.println("Camera:"+p.getCamera());
        System.out.println("Bateria:"+p.getBateria());
    }
    
    
}
