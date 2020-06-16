package contaluz;

import javax.swing.JOptionPane;

public class operacoes {
    public int codCliente;
    public double energia;
    public double taxaTusd;
    public double taxaTe;
    
    public int getCodCliente(){
        return codCliente;
    }
    public void setCodCliente(int codCliente){
        this.codCliente = codCliente;
    }
    public double getEnergia(){
        return energia;
    }
    public void setEnergia(double energia){
        this.energia = energia;
    }
    public double getTaxaTusd(){
        return taxaTusd;
    }
    public void setTaxaTusd(double taxaTusd){
        this.taxaTusd = taxaTusd;
    }
    public double getTaxaTe(){
        return taxaTe;
    }
    public void setTaxaTe(double taxaTe){
        this.taxaTe = taxaTe;
    }
    public double TaxaSemBandeira(double taxaTusd, double taxaTe, double energia){
        taxaTusd = 0.30 * energia;
        taxaTe = 0.29 * energia;
        double taxaIcms = (taxaTusd + taxaTe)*0.25;
        double taxaSemBandeira = taxaTusd + taxaTe + taxaIcms;
        return taxaSemBandeira;
    }
    public void TotalPago(double taxaSemBandeira, double energia){
        double total;
        if(energia<=100){
            total=taxaSemBandeira;
            JOptionPane.showMessageDialog(null, "Você está em bandeira verde, o valor total a ser pago é: "+total);
            
        }
        if(energia>100 && energia<=150){
            total=taxaSemBandeira+energia*0.01343;
            JOptionPane.showMessageDialog(null, "Você está em bandeira amarela, o valor total a ser pago é: "+total);
            
        }
        if(energia>150 && energia<=200){
            total=taxaSemBandeira+energia*0.04169;
            JOptionPane.showMessageDialog(null, "Você está em bandeira vermelha, o valor total a ser pago é: "+total);
           
        }
        if(energia>200){
            total=taxaSemBandeira+energia*0.06243;
            JOptionPane.showMessageDialog(null, "Você está em bandeira vermelha de segundo patamar, o valor total a ser pago é: "+total);
            
        }
    }
}
