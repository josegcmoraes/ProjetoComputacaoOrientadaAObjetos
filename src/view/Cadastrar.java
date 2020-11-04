/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Cds;
import model.Celular;
import model.Cliente;
import model.Disco;
import model.Dvds;
import model.Jogos;
import model.Livros;
import model.Produto;
import model.Vendas;

/**
 *
 * @author josegcm
 */
public class Cadastrar {
    Scanner ler=new Scanner (System.in);
    public Produto cadastrarProdutos(Produto novo, ArrayList<Produto> produtos,String categoria){
        //DADOS DE UM PRODUTO
        System.out.print("Categoria:");
        novo.setCategoria(categoria);
        System.out.println(novo.getCategoria());
        if(categoria.equals("Celular")){
           System.out.print("Marca:"); 
        }else{
           System.out.print("Titulo:"); 
        }
        novo.setNome(ler.nextLine());
       
        System.out.print("Descricao:");
        novo.setDescricao(ler.nextLine());
        System.out.print("Codigo:");
        novo.setCodigo((produtos.size())+1);
        System.out.println(novo.getCodigo());
        boolean continuar=true;
        do{
            try{
                System.out.print("Quantidade em Estoque:");
                novo.setQuantidadeEmEstoque(ler.nextInt());
                verificaNumeroNegativo(novo.getQuantidadeEmEstoque());
                System.out.print("Preco deste produto:");
                novo.setPreco(ler.nextDouble());
                verificaNumeroNegativo((int) novo.getPreco());
                continuar=false;
            }catch(InputMismatchException e1){
                ler.nextLine();
                System.err.println(e1+":Digite numeros em vez de letras");
            }catch(NumberFormatException e2){
                System.err.println(e2);
            }
        }while(continuar);
        ler.nextLine();
        return novo;
    }
        
    public Disco cadastrarDisco(Disco disco){
        //DADOS DE UM DISCO
        System.out.print("Genero:");
        disco.setGenero(ler.nextLine());
        System.out.print("Gravadora:");
        disco.setGravadora(ler.nextLine());
        boolean continuar=true;
        do{
            try{
                System.out.print("ano de producao:");
                disco.setAno(ler.nextInt());
                System.out.print("duracao:");
                disco.setDuracao(ler.nextInt());
                verificaNumeroNegativo(disco.getDuracao());
                continuar=false;
            }catch(InputMismatchException e1){
                ler.nextLine();
                System.err.println(e1+":Digite numeros em vez de letras");
            }catch(NumberFormatException e2){
                System.err.println(e2);
            }
        }while(continuar);

        ler.nextLine();
        return disco;
    }
         
    public void cadastrarCds(ArrayList<Produto> produtos){
        Cds cd=new Cds();
        //DADOS DE UM CD
        cd=(Cds) cadastrarProdutos(cd,produtos,"Cds");
        cd=(Cds) cadastrarDisco(cd);
        System.out.print("Cantores:");
        cd.setCantores(ler.nextLine());

        ler.nextLine();
        produtos.add(cd);
    } 
        
    public void cadastrarDvds(ArrayList<Produto> produtos){
        Dvds dvd=new Dvds();
        //DADOS DE UM DVD
        dvd=(Dvds) cadastrarProdutos(dvd,produtos,"Dvds");
        dvd=(Dvds) cadastrarDisco(dvd);
        System.out.print("Idioma:");
        dvd.setIdioma(ler.nextLine());
        System.out.print("faixa etaria:");
        dvd.setFaixaEtaria(ler.nextLine());

        ler.nextLine();
        produtos.add(dvd);
    }        
        
    public void cadastrarLivros(ArrayList<Produto> produtos){
        Livros livro=new Livros();
        //DADOS DE UM LIVRO
        livro=(Livros) cadastrarProdutos(livro,produtos,"Livros");
        System.out.print("Autor:");
        livro.setAutor(ler.nextLine());
        System.out.print("Genero:");
        livro.setGenero(ler.nextLine());
        System.out.print("Editora:");
        livro.setEditora(ler.nextLine());
        boolean continuar=true;
        do{
            try{
                System.out.print("Edicao:");
                livro.setEdicao(ler.nextInt());
                verificaNumeroNegativo(livro.getEdicao());
                System.out.print("Ano:");
                livro.setAno(ler.nextInt());
                System.out.print("Paginas:");
                livro.setPaginas(ler.nextInt());
                verificaNumeroNegativo(livro.getPaginas());
                continuar=false;
                }catch(InputMismatchException e1){
                    ler.nextLine();
                    System.err.println(e1+":Digite numeros em vez de letras");
                    System.out.println("Digite numeros em vez de letras");
                }catch(NumberFormatException e2){
                    System.err.println(e2);
                }
        }while(continuar);

        ler.nextLine();
        produtos.add(livro);
    }
        
    public void cadastrarJogos(ArrayList<Produto> produtos){
        Jogos jogo=new Jogos();       
        //DADOS DE UM JOGO
        jogo=(Jogos) cadastrarProdutos(jogo,produtos,"Jogos");
        System.out.print("Genero:");
        jogo.setGenero(ler.nextLine());
        System.out.print("Faixa Etaria:");
        jogo.setFaixaEtaria(ler.nextLine());
        System.out.print("Idioma:");
        jogo.setIdioma(ler.nextLine());
        System.out.print("Marca:");
        jogo.setMarca(ler.nextLine());
        System.out.print("Plataforma:");
        jogo.setPlataforma(ler.nextLine());

        ler.nextLine();
        produtos.add(jogo);
    }
        
    public void cadastrarCelular(ArrayList<Produto> produtos){
        Celular celular=new Celular();
        //DADOS DE UM CELULAR
        celular=(Celular) cadastrarProdutos(celular,produtos,"Celular");
        //ler.nextLine();
        System.out.print("Versao S.O. :");
        celular.setVersaoSO(ler.nextLine());
        boolean continuar=true;
        do{
            try{
                System.out.print("Tamanho da tela:");
                celular.setTamanhoTela(ler.nextDouble());
                verificaNumeroNegativo((int) celular.getTamanhoTela());
                System.out.print("Camera:");
                celular.setCamera(ler.nextInt());
                verificaNumeroNegativo(celular.getCamera());
                System.out.print("Bateria:");
                celular.setBateria(ler.nextInt());
                verificaNumeroNegativo(celular.getBateria());
                continuar=false;
            }catch(InputMismatchException e1){
                ler.nextLine();
                System.err.println(e1+":Digite numeros em vez de letras");
            }catch(NumberFormatException e2){
                System.err.println(e2);
            }
        }while(continuar);

        ler.nextLine();
        produtos.add(celular);
    }       
    //CADASTRAR CLIENTE.........................................................
    public void cadastrarCliente(ArrayList<Cliente> cliente) {
        Scanner ler=new Scanner(System.in);
        String l;
        Cliente c=new Cliente();
        System.out.println("________CADASTRAR CLIENTE_________");
        //try
            System.out.print("Nome:");
            c.setNome(ler.nextLine());
        
            boolean verificaExistencia;
            String cpf,email;
        boolean continua=true;
        do{    
           try{ 
                do{
                    verificaExistencia=true;
                    System.out.print("CPF:");
                    //c.setCpf(ler.nextLine());
                    cpf=ler.nextLine();
                    verificaCpfValido(cpf);
                    System.out.print("Codigo:");
                    c.setCodigo(cliente.size()+1);
                    System.out.println(c.getCodigo());
                    //ler.nextLine();;

                    System.out.print("E-mail:");
                    email=ler.nextLine();
 
                    for(int cli=0;cli<cliente.size();cli++){
                        if(email.equals(cliente.get(cli).getEmail())){//verifica se ja existe este email
                            System.out.println("Existe um cliente com este email");
                            verificaExistencia=false;
                        }
                        if(cpf.equals(cliente.get(cli).getCpf())){//verifica se ja existe este cpf
                            System.out.println("Existe um cliente com este cpf");
                            verificaExistencia=false;
                        }
                    }
                }while(verificaExistencia==false);

            c.setEmail(email);
            c.setCpf(cpf);
            continua=false;
           }catch(Exception e1){
               System.out.println(e1);
           }
        }while(continua);
        
            System.out.print("Endereco:");
            c.setEndereco(ler.nextLine());
            c.getListaendereco().add(c.getEndereco());
            do{
                System.out.println("1-adicionar outro endereco");
                System.out.println("0-voltar");
                System.out.print("Escolhe uma opcao:");
                l=ler.nextLine();
                switch(l){
                    case "1":
                        boolean existe=true;
                        System.out.print("Endereco:");
                        c.setEndereco(ler.nextLine());
                        for(int end=0;end<c.getListaendereco().size();end++){
                            if(c.getListaendereco().get(end).equals(c.getEndereco())){
                                existe=false;
                                System.out.println("Para este cliente já existe um endereco com este nome");
                            } 
                        }
                        if(existe==true){
                            c.setEndereco(c.getEndereco());
                            c.getListaendereco().add(c.getEndereco());
                        }
                    break;
                }
            }while(!(l.equals("0")));
        
       // }
        Collections.sort(c.getListaendereco());
        cliente.add(c);           
    }
    //CADASTRAR VENDAS..........................................................
    public void cadastrarVendas(ArrayList<Vendas> vendas,ArrayList<Produto> produtos,ArrayList<Cliente> cliente){
        System.out.println("__________CADASTRAR VENDA_________");
        if(!produtos.isEmpty()&&!cliente.isEmpty()){//verifica se a lista produto e cliente não esta vazia
            int escolheCodigoCliente=0;
            String opcaoProduto;
            boolean continuar = true;
            Vendas venda=new Vendas();
            
            do{
                ler.nextLine();
                System.out.println("==================================");
                for(int cl=0;cl<cliente.size();cl++){
                    System.out.println("Codigo:"+cliente.get(cl).getCodigo()+"\tNome:"+cliente.get(cl).getNome());
                }
                System.out.println("==================================");
                try{
                    System.out.print("Escolha o codigo de um cliente:");
                    escolheCodigoCliente=ler.nextInt();
                    continuar=false;
                }catch(InputMismatchException e1){
                    System.err.println(e1+":Digite numero nao letras");
                    ler.nextLine();
                }catch(Exception e2){
                    System.err.println(e2+":Ocorreu um erro");
                }

            }while(continuar||escolheCodigoCliente<=0||escolheCodigoCliente>cliente.size());

            
            venda=obterData(venda);
         
            venda.setCliente(obterCliente(venda,cliente,escolheCodigoCliente));
            venda.setStatus(venda.getStatus());
            int vendeuProduto=0;
            do{
                ler.nextLine();
                boolean continuar1=true;
                int quantidadeDesejada=0;
                int escolheCodigoProduto=0;
                System.out.println("1-escolha um produto");
                System.out.println("0-finalizar a venda");
                System.out.print("Escolhe uma opcao:");
                opcaoProduto=ler.nextLine();
                switch(opcaoProduto){
                    case "1":
                        do{
                            ler.nextLine();
                            System.out.println("==================================");
                            for(int pr=0;pr<produtos.size();pr++){
                                System.out.println("Codigo:"+produtos.get(pr).getCodigo()+"\tNome:"+produtos.get(pr).getNome()+"\tQuantidade em Estoque:"+produtos.get(pr).getQuantidadeEmEstoque());
                            }
                            System.out.println("==================================");
                            try{
                                System.out.print("Escolha o codigo de um produto:");
                                escolheCodigoProduto=ler.nextInt();
                                System.out.print("Quantidade de produto vendido:");
                                quantidadeDesejada=ler.nextInt();
                                ler.nextLine();
                              
                                
                                for(int pr=0;pr<produtos.size();pr++){
                                    if(produtos.get(pr).getCodigo()==escolheCodigoProduto){
                                        if(quantidadeDesejada<=produtos.get(pr).getQuantidadeEmEstoque()&&quantidadeDesejada>0){
                                            produtos.get(pr).setQuantidadeEmEstoque(produtos.get(pr).getQuantidadeEmEstoque()-quantidadeDesejada);

                                            vendeuProduto=vendeuProduto+1;
                                            Produto p=new Produto();
                                            p.setCategoria(produtos.get(pr).getCategoria());
                                            p.setCodigo(produtos.get(pr).getCodigo());
                                            p.setDescricao(produtos.get(pr).getDescricao());
                                            p.setNome(produtos.get(pr).getNome());
                                            p.setPreco(produtos.get(pr).getPreco());
                                            p.setQuantidadeVendida(quantidadeDesejada);
                                            venda.getProdutosVendidos().add(p);

                                        }
                                    }
                                }  
                               
                                continuar1=false;
                            }catch(InputMismatchException e1){
                                System.err.println(e1+":Digite numero nao letras");
                                ler.nextLine();
                            }catch(Exception e2){
                                System.err.println(e2+":Ocorreu um erro");
                            }
                        }while(continuar1||escolheCodigoProduto<=0||escolheCodigoProduto>cliente.size());
                        ler.nextLine();
                        
                    break;
                    case "0":
                        if(vendeuProduto!=0){
                            vendas.add(venda);
                            System.out.println("Venda realizada");
                        }else{
                            System.out.println("A venda nao foi realizada");
                        }
                    break;
                    default:
                        System.out.println("Digite 1 para vender produto");
                    break;
                }
            }while(!(opcaoProduto.equals("0")));
            

        }else{
            System.out.println("Você deve ter pelo menos um cliente e um produto cadastrado...");
        }
    }    
    
    public Cliente obterCliente(Vendas venda,ArrayList<Cliente> cliente,int escolheCodigoCliente){
        //adicionará o cliente cujo codigo foi escolhido para a venda
        for(int cl=0;cl<cliente.size();cl++){
            if(cliente.get(cl).getCodigo()==escolheCodigoCliente){
                //venda.setCliente(cliente.get(cl));
                venda.getCliente().setNome(cliente.get(cl).getNome());
                venda.getCliente().setCodigo(cliente.get(cl).getCodigo());
                venda.getCliente().setCpf(cliente.get(cl).getCpf());
                venda.getCliente().setEmail(cliente.get(cl).getEmail());
                for(int end=0;end<cliente.get(cl).getListaendereco().size();end++){
                    venda.getCliente().setEndereco(cliente.get(cl).getListaendereco().get(end));
                    venda.getCliente().getListaendereco().add(end,venda.getCliente().getEndereco());
                }

                String opcaoObterEndereco;
                boolean prosseguir=false;
                System.out.println("ENDERECOS");
                do{
                    for(int end=0;end<cliente.get(cl).getListaendereco().size();end++){
                        System.out.println(cliente.get(cl).getListaendereco().get(end));
                    }
                    System.out.print("Digite o endereco escolhido:");
                    opcaoObterEndereco=ler.nextLine();

                    for(int end=0;end<cliente.get(cl).getListaendereco().size();end++){
                        if(opcaoObterEndereco.equals(cliente.get(cl).getListaendereco().get(end))){
                            prosseguir=true;
                            venda.setEnderecoDaVenda(opcaoObterEndereco);
                        }

                    }
                
                }while(prosseguir==false);
            }
        }
        return venda.getCliente();
    }
    
    
    public Vendas obterData(Vendas venda){
        boolean continuar = true;
        System.out.println("Data da venda");
        do{
            try{
                System.out.print("Dia:");
                venda.setDia(ler.nextInt());
                System.out.print("Mes:");
                venda.setMes(ler.nextInt());
                System.out.print("Ano:");
                venda.setAno(ler.nextInt());
                ler.nextLine();
                if(continuar==true){
                    continuar=metodo(venda);
                }else{
                    continuar=false;
                }
            }catch(InputMismatchException e1){
                System.err.println(e1+":Digite Numeros nao letras");
                ler.nextLine();
            }catch(Exception e2){
                System.err.println(e2+":Ocorreu um erro");
            }
        }while(continuar);
        venda.constroiDataImprimir();
        venda.constroiDataOrdena();
        return venda;
    }
    public boolean metodo(Vendas venda){
        if(venda.getMes()<0||venda.getMes()>12||venda.getDia()<0||venda.getDia()>31){
            System.out.println("dia(1-31) mes(1-12)");
            return true;
        }
        if((venda.getMes()==4||venda.getMes()==6||venda.getMes()==9||venda.getMes()==11)&&venda.getDia()==31){
            System.out.println("Este mes nao pode ter o dia 31");
            return true;
        }
        if(venda.getMes()==2&&venda.getDia()>29){
            System.out.println("Este mes nao pode ter o dia 30 e 31");
            return true;
        }
        return false;
    }
    
    public static void verificaNumeroNegativo(int valor) throws NumberFormatException{
        if(valor<=0)throw new NumberFormatException("Digite numeros maior que 0");
    } 
    
    public static void verificaCpfValido(String cpf) throws Exception{
        //if(cpf.isEmpty())throw new Exception("O tamanho do cpf nao e este");
        if(cpf.length()!=14)throw new Exception("O tamanho do cpf deve ser 14");
    }
}
