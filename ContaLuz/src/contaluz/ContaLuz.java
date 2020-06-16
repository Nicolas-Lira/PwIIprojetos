package contaluz;

import javax.swing.JOptionPane;

public class ContaLuz {

    public static void main(String[] args) {
        operacoes dados = new operacoes();
        dados.setCodCliente(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente: ")));
        dados.setEnergia(Integer.parseInt(JOptionPane.showInputDialog("O total de energia gasto foi de: "+"kw/h")));
        
        dados.TotalPago(dados.TaxaSemBandeira(dados.getTaxaTusd(), dados.getTaxaTe(), dados.getEnergia()), dados.getEnergia());
    }
    
    
}
