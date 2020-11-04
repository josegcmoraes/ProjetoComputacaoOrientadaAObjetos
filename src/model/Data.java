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
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String dataImprimir;
    private String dataOrdena;

    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public String getDataImprimir(){
        return dataImprimir;
    }
    public String getDataOrdena(){
        return dataOrdena;
    }

    public void setDia(int dia){
        this.dia=dia;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public void setDataImprimir(String dataImprimir){
        this.dataImprimir=dataImprimir;
    }
    public void setDataOrdena(String dataOrdena){
        this.dataOrdena=dataOrdena;
    }

    public void constroiDataImprimir(){
        String msg;
        msg=getDia()+"/"+getMes()+"/"+getAno();
        setDataImprimir(msg);
    }
    public void constroiDataOrdena(){
        String msg ="";
        if(getMes()>9&&getDia()>9){
            msg=getAno()+"/"+getMes()+"/"+getDia();
        }else{
            if(getMes()<10&&getDia()>9){
               msg=getAno()+"/0"+getMes()+"/"+getDia(); 
            }else{
                if(getMes()<10&&getDia()<10){
                    msg=getAno()+"/0"+getMes()+"/0"+getDia(); 
                }else{
                    if(getMes()>9&&getDia()<10){
                        msg=getAno()+"/"+getMes()+"/0"+getDia(); 
                    }
                }
            }
        }
        
        setDataOrdena(msg);
    }    
}
