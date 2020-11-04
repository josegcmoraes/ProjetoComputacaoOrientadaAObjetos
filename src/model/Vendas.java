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
public class Vendas extends Data{

    private Cliente cliente=new Cliente();
    private String enderecoDaVenda;
    private String status;//pendente andamento entregue
    ArrayList<Produto> produtosVendidos=new ArrayList<Produto>();
    
    
    public Vendas() {
        this.status="pendente";
    }


    public Cliente getCliente() {
        return cliente;
    }
    public String getEnderecoDaVenda() {
        return enderecoDaVenda;
    }
    public String getStatus(){
        return status;
    }
    public ArrayList<Produto> getProdutosVendidos(){
        return produtosVendidos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setEnderecoDaVenda(String enderecoDaVenda) {
        this.enderecoDaVenda = enderecoDaVenda;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public void setProdutosVendidos(ArrayList<Produto> produtosVendidos){
        this.produtosVendidos=produtosVendidos;
    }

    public void exibir1(){
        System.out.println("====================================================================");
        System.out.println("Data:"+getDataImprimir());
        System.out.println("Status:"+getStatus());
        System.out.println("__________________________________");
        System.out.println("CLIENTE");
        System.out.println("Nome:"+getCliente().getNome());
        System.out.println("Cpf:"+getCliente().getCpf());
        System.out.println("Codigo:"+getCliente().getCodigo());
        System.out.println("E-mail:"+getCliente().getEmail());
        System.out.println("Endereco da entrega:"+getEnderecoDaVenda());
        System.out.println("__________________________________");
        for(int pr=0;pr<produtosVendidos.size();pr++){
            System.out.println("PRODUTOS");
            System.out.println("Titulo:"+getProdutosVendidos().get(pr).getNome());
            System.out.println("Categoria:"+getProdutosVendidos().get(pr).getCategoria());
            System.out.println("Codigo:"+getProdutosVendidos().get(pr).getCodigo());
            System.out.println("Preco deste produto:"+getProdutosVendidos().get(pr).getPreco());
            System.out.println("Descricao:"+getProdutosVendidos().get(pr).getDescricao());
            System.out.println("Quantidade de produto vendido:"+getProdutosVendidos().get(pr).getQuantidadeVendida());
            System.out.println("__________________________________");
        }
    }    
}
