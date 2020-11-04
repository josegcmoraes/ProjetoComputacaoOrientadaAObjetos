/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteCompara;
import controller.ProdutoCompara;
import controller.VendaComparaCrescente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Cliente;
import model.Produto;
import model.Vendas;

/**
 *
 * @author josegcm
 */
public class Alterar {
    Scanner ler=new Scanner(System.in);
    public void alterarEstoque(ArrayList<Produto> produtos){
        System.out.println("__________ALTERAR ESTOQUE_________");
        if(!produtos.isEmpty()){
            Collections.sort(produtos, new ProdutoCompara());
            boolean continua=true;
            int quantidade;
            do{    
                try{
                    System.out.println("Caso nao saiba o codigo entre na opcao 7 do menu:");
                    System.out.print("Digite o codigo do produto:");
                    int codigo=ler.nextInt();
                    for(int pr=0;pr<produtos.size();pr++){
                        Produto prod=produtos.get(pr);
                        if(codigo==prod.getCodigo()){
                            System.out.print("Antigo estoque:"+prod.getQuantidadeEmEstoque()+"\n"+"Novo   estoque:");
                            quantidade=ler.nextInt();
                            if(quantidade>0){
                                prod.setQuantidadeEmEstoque(quantidade);
                            }
                        }
                    }   
                    continua=false;
                }catch(InputMismatchException e1){
                    ler.nextLine();
                    System.err.println(e1+":Digite numeros em vez de letras");
                }
            }while(continua);

        }else{
            System.out.println("Lista vazia");
        }    
    }
        
    public void alterarDadosCliente(ArrayList<Cliente> cliente){
        System.out.println("______ALTERAR DADOS CLIENTE_______");
        if(!cliente.isEmpty()){
            Collections.sort(cliente, new ClienteCompara());
            boolean continua=true;
            do{    
                try{
                    System.out.println("Caso nao saiba o codigo entre na opcao 8 do menu:");
                    System.out.print("Digite o codigo do cliente:");
                    int codigo=ler.nextInt();
                    for(int cl=0;cl<cliente.size();cl++){
                        Cliente c=cliente.get(cl);
                        if(codigo==c.getCodigo()){
                            ler.nextLine();
                            System.out.print("Antigo Nome:"+c.getNome()+"\n"+"Novo   Nome:");
                            c.setNome(ler.nextLine());
                            System.out.print("Antigo CPF:"+c.getCpf()+"\n"+ "Novo   CPF:");
                            c.setCpf(ler.nextLine());
                            System.out.print("Antigo E-mail:"+c.getEmail()+"\n"+"Novo   E-mail:");
                            c.setEmail(ler.nextLine());
                            for(int end=0;end<c.getListaendereco().size();end++){
                                boolean existe=true;
                                System.out.print("Antigo Endereco:"+c.getListaendereco().get(end)+"\n"+"Novo   Endereco:");
                                c.setEndereco(ler.nextLine());
                                for(int end1=0;end1<c.getListaendereco().size();end1++){
                                    if(c.getListaendereco().get(end1).equals(c.getEndereco())){
                                        existe=false;
                                        System.out.println("O endereco nao foi modificado pois ele e igual ou causaria duplicacao");
                                    } 
                                }
                                if(existe==true){
                                    c.getListaendereco().remove(end);
                                    c.getListaendereco().add(end,c.getEndereco());
                                }
                            }
                            Collections.sort(c.getListaendereco());
                        }
                    }
                    continua=false;
                }catch(InputMismatchException e1){
                    ler.nextLine();
                    System.err.println(e1+":Digite numeros em vez de letras");
                }
            }while(continua);
        }else{
            System.out.println("Lista vazia");
        }
    }
    
    public void alterarStatusVendas(ArrayList<Vendas> venda){
        System.out.println("______ALTERAR STATUS VENDA________");
        if(!venda.isEmpty()){
            boolean verifica=false;
            Collections.sort(venda, new VendaComparaCrescente());
            for(int ve=0;ve<venda.size();ve++){
                System.out.println(venda.get(ve).getDataOrdena());
            }
            System.out.println("__________________________________");
            System.out.print("Digite uma das datas:");
            String data=ler.nextLine();
            for(int ve=0;ve<venda.size();ve++){
                Vendas v=venda.get(ve);
                if(v.getDataOrdena().equals(data)){
                    if(v.getStatus().equals("pendente")){
                        v.setStatus("andamento");
                        System.out.println("Status alterado de pendente para andamento");
                    }else{
                        if(v.getStatus().equals("andamento")){
                            v.setStatus("entregue");
                            System.out.println("Status alterado de andamento para entregue");
                        }else{
                            System.out.println("Status entregue nao e modificado");
                        }
                    }
                    verifica=true;
                }
            }   
            if(verifica==false){
                System.out.println("Data nao consta na lista de vendas");  
            }
        }else{
            System.out.println("Lista vazia");
        }
    }    
}
