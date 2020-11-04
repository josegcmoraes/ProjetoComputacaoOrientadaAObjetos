/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Comparator;
import model.Vendas;

/**
 *
 * @author josegcm
 */
public class VendaComparaCrescente implements Comparator<Vendas>{
    
    @Override
    public int compare(Vendas venda1,Vendas venda2) {
        return venda1.getDataOrdena().compareTo(venda2.getDataOrdena());
    }
}
