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
public class Livros extends Produto{
    private String autor;
    private String genero;
    private String editora;
    private int edicao;
    private int ano;
    private int paginas;

    public String getAutor(){
        return autor;
    }
    public String getGenero(){
        return genero;
    }
    public String getEditora(){
        return editora;
    }
    public int getEdicao(){
        return edicao;
    }
    public int getAno(){
        return ano;
    }
    public int getPaginas(){
        return paginas;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setEditora(String editora){
        this.editora=editora;
    }
    public void setEdicao(int edicao){
        this.edicao=edicao;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public void setPaginas(int paginas){
        this.paginas=paginas;
    }
    
    public void exibir2(Produto prod){
        Livros p=(Livros) prod;
        System.out.println("Autor(a):"+p.getAutor());
        System.out.println("Genero:"+p.getGenero());
        System.out.println("Editora:"+p.getEditora());
        System.out.println("Edicao:"+p.getEdicao());
        System.out.println("Ano:"+p.getAno());
        System.out.println("Paginas:"+p.getPaginas());
   }
    
    
       
}
