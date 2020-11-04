/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Cliente;
import model.Produto;
import model.Vendas;

/**
 *
 * @author josegcm
 */
public class Menu {
    Scanner ler=new Scanner (System.in);
    public void menu(){
        String i;
        boolean continuar=true;
        ArrayList<Produto> produtos=new ArrayList<Produto>();
        ArrayList<Cliente> cliente=new ArrayList<Cliente>();
        ArrayList<Vendas> vendas=new ArrayList<Vendas>();
        Cadastrar cadastrar=new Cadastrar();
        Alterar alterar=new Alterar();
        Listar listar=new Listar();
        do{  
            System.out.println("_______________MENU_______________"); 
            System.out.println("1-Cadastrar produtos");
            System.out.println("2-Cadastrar clientes");
            System.out.println("3-Cadastrar vendas");
            System.out.println("4-Alterar estoque");
            System.out.println("5-Alterar dados  de clientes");
            System.out.println("6-Alterar status de vendas");
            System.out.println("7-Listar produtos");
            System.out.println("8-Listar clientes");
            System.out.println("9-Listar vendas");
            System.out.println("0-Sair");
            System.out.print("digite a opcao escolhida:");
            i=ler.nextLine();
            switch(i){
                case "1":
                    menuProduto(produtos,cadastrar);
                break;
                case "2":
                    cadastrar.cadastrarCliente(cliente);
                break;
                case "3":
                    cadastrar.cadastrarVendas(vendas,produtos,cliente);
                break;
                case "4":
                    alterar.alterarEstoque(produtos);       
                break;
                case "5":
                    alterar.alterarDadosCliente(cliente);
                break;
                case "6":
                    alterar.alterarStatusVendas(vendas);
                break;
                case "7":
                    listar.listarProdutos(produtos);
                break;
                case "8":
                    listar.listarClientes(cliente);
                break;
                case "9":
                    String escolheVenda;
                    System.out.println("1-Data de inicio de venda");
                    System.out.println("2-Data de fim de venda");
                    escolheVenda=ler.nextLine();
                    listar.listarVendas(vendas,escolheVenda);
                break;
                default:
                    if(!(i.equals("0"))){
                        System.out.println("digite de 1 a 9");
                    }
                break;
            }
        }while(!(i.equals("0")));
    }

    public void menuProduto(ArrayList<Produto> produtos,Cadastrar cadastrar){
        String j;
        do{
            System.out.println("________CADASTRAR PRODUTOS________");
            System.out.println("1-cadastrar CDS");
            System.out.println("2-cadastrar DVDS");
            System.out.println("3-cadastrar LIVROS");
            System.out.println("4-cadastrar JOGOS");
            System.out.println("5-cadastrar CELULAR");
            System.out.println("0-voltar");
            System.out.print("Escolhe uma categoria:");
            j=ler.nextLine();
            switch(j){
                case "1"://FAZ O CADASTRO DE UM CD
                    System.out.println("cadastrar CDS");
                    cadastrar.cadastrarCds(produtos);
                break;
                case "2"://FAZ O CADASTRO DE UM DVD
                    System.out.println("cadastrar DVDS");
                    cadastrar.cadastrarDvds(produtos);
                break;
                case "3"://FAZ O CADASTRO DE UM LIVRO
                    System.out.println("cadastrar LIVROS");
                    cadastrar.cadastrarLivros(produtos);
                break;
                case "4"://FAZ O CADASTRO DE UM JOGO
                    System.out.println("cadastrar JOGOS");
                    cadastrar.cadastrarJogos(produtos);
                break;
                case "5"://FAZ O CADASTRO DE UM CELULAR
                    System.out.println("cadastrar CELULAR");
                    cadastrar.cadastrarCelular(produtos);
                break;
                default:
                    if(!(j.equals("0"))){
                        System.out.println("digite de 1 a 5");
                    }
                break;
            }
        }while(!(j.equals("0")));
    }   
}
