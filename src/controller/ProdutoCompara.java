/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Comparator;
import model.Produto;

/**
 *
 * @author josegcm
 */
public class ProdutoCompara implements Comparator<Produto>{
    
    @Override
    public int compare(Produto produto1,Produto produto2) {
        return produto1.getNome().compareTo(produto2.getNome());
    } 
}
