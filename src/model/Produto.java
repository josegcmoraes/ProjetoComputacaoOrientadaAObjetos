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
public class Produto {
    private String nome;
    private String categoria;
    private String descricao;
    private int codigo;
    private int quantidadeEmEstoque;
    private int quantidadeVendida;
    private double preco;
    
    //GETTERS
    public String getNome(){
        return nome;
    }
    public String getCategoria(){
        return categoria;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getCodigo(){
        return codigo;
    }
    public int getQuantidadeEmEstoque(){    
        return quantidadeEmEstoque;
    }
    public int getQuantidadeVendida(){
        return quantidadeVendida;
    }
    public double getPreco(){
        return preco;
    }

    //SETTERS
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque){
        this.quantidadeEmEstoque=quantidadeEmEstoque;
    }
    public void setQuantidadeVendida(int quantidadeVendida){
        this.quantidadeVendida=quantidadeVendida;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    
   public void exibir1(Produto prod){
       
    System.out.println("==================================");
    System.out.println("Titulo:"+prod.getNome());
    System.out.println("Categoria:"+prod.getCategoria());
    System.out.println("Codigo:"+prod.getCodigo());
    System.out.println("Quantide em Estoque:"+prod.getQuantidadeEmEstoque());
    System.out.println("Preco deste produto:"+prod.getPreco());
    System.out.println("Descricao:"+prod.getDescricao());
   }
    
       
}
