/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Comparator;
import model.Cliente;

/**
 *
 * @author josegcm
 */
public class ClienteCompara implements Comparator<Cliente>{
    
    @Override
    public int compare(Cliente cliente1,Cliente cliente2) {
        return cliente1.getNome().compareTo(cliente2.getNome());
    } 
}
