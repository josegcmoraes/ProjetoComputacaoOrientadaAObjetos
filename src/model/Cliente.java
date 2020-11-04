/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author josegcm
 */
public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private String endereco;
    private int codigo;
    ArrayList<String> listaendereco=new ArrayList<String>();

    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getEndereco(){
        return endereco;
    }
    public int getCodigo(){
        return codigo;
    }

    public ArrayList<String> getListaendereco(){
        return listaendereco;
    }
    

    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public void setListaendereco(ArrayList<String> listaendereco){
        this.listaendereco=listaendereco;
    }
    

    public void exibir(){
        exibir1();
        exibir2();
    }
    public void exibir1(){
        //Exibe os dados de um Cliente
        System.out.println("==================================");
        System.out.println("Nome:"+getNome());
        System.out.println("Cpf:"+getCpf());
        System.out.println("Codigo:"+getCodigo());
        System.out.println("E-mail:"+getEmail());
    }
    public void exibir2(){
        //Imprime a lista de enderecos do cliente
        for(int le=0;le<listaendereco.size();le++){
            System.out.println("Endereco:"+listaendereco.get(le));
        }
    }    
}
