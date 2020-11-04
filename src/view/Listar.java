/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteCompara;
import controller.ProdutoCompara;
import controller.VendaComparaCrescente;
import controller.VendaComparaDecrescente;
import java.util.ArrayList;
import java.util.Collections;
import model.Cds;
import model.Celular;
import model.Cliente;
import model.Dvds;
import model.Jogos;
import model.Livros;
import model.Produto;
import model.Vendas;

/**
 *
 * @author josegcm
 */
public class Listar {
    public void listarProdutos(ArrayList<Produto> produtos){
        System.out.println("___________LISTAR PRODUTO_________");
        if(!produtos.isEmpty()){
            Collections.sort(produtos, new ProdutoCompara());
            for(int pr=0;pr<produtos.size();pr++){
                Produto prod=produtos.get(pr);
                if(produtos.get(pr) instanceof Cds){
                    Cds p=(Cds) prod;
                    p.exibir1(prod);
                    p.exibir2(prod);
                    p.exibir3(prod);
                }
                if(produtos.get(pr) instanceof Dvds){
                    Dvds p=(Dvds) prod;
                    p.exibir1(prod);
                    p.exibir2(prod);
                    p.exibir3(prod);
                }
                if(produtos.get(pr) instanceof Livros){
                    Livros p=(Livros) prod;
                    p.exibir1(prod);
                    p.exibir2(prod);
                }
                if(produtos.get(pr) instanceof Jogos){
                    Jogos p=(Jogos) prod;
                    p.exibir1(prod);
                    p.exibir2(prod);
                }
                if(produtos.get(pr) instanceof Celular){
                    Celular p=(Celular) prod;
                    p.exibir(prod);
                }
                System.out.println("==================================");
            }
        }else{
            System.out.println("Lista vazia");
        }
    }
    public void listarClientes(ArrayList<Cliente> cliente){
        System.out.println("___________LISTAR CLIENTE_________");
        if(!cliente.isEmpty()){
            Collections.sort(cliente, new ClienteCompara());
                for(int cl=0;cl<cliente.size();cl++){
                    cliente.get(cl).exibir();//Exibe os dados do cliente cl
                }
            System.out.println("==================================");
        }else{
            System.out.println("Lista vazia");
        }
    }    
    public void listarVendas(ArrayList<Vendas> vendas,String escolheVenda){
        System.out.println("___________LISTAR VENDAS__________");
        if(!vendas.isEmpty()){
            if(escolheVenda.equals("1")){
                Collections.sort(vendas, new VendaComparaCrescente());
                for(int ve=0;ve<vendas.size();ve++){
                    //vendas.get(ve).exibir(vendas.get(ve));
                    vendas.get(ve).exibir1();
                }
                System.out.println("====================================================================");
            }else{
                if(escolheVenda.equals("2")){
                    Collections.sort(vendas, new VendaComparaDecrescente());
                    for(int ve=0;ve<vendas.size();ve++){
                        //vendas.get(ve).exibir(vendas.get(ve));
                        vendas.get(ve).exibir1();
                    }
                    System.out.println("====================================================================");
                }else{
                    System.out.println("Voce nao escolheu opcao de ver a lista");
                }   
            }
            
            
        }else{
            System.out.println("Lista vazia");
        }
    }    
}
