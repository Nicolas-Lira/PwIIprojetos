package estacionamento;

import javax.swing.JOptionPane;



public class operacoes {
    public String codCarro;
    public int hrEntrada;
    public int minEntrada;
    public int hrSaida;
    public int minSaida;
    public double conta;
    
    public String getCodCarro(){
        return codCarro;
    }
    public void setCodCarro(String codCarro){
        this.codCarro = codCarro;
    }
    public int getHrEntrada(){
        return hrEntrada;
    }
    public void setHrEntrada(int hrEntrada){
        this.hrEntrada = hrEntrada;
    }
    public int getMinEntrada(){
        return minEntrada;
    }
    public void setMinEntrada(int minEntrada){
        this.minEntrada = minEntrada;
    }
    public int getHrSaida(){
        return hrSaida;
    }
    public void setHrSaida(int hrSaida){
        this.hrSaida = hrSaida;
    }
    public int getMinSaida(){
        return minSaida;
    }
    public void setMinSaida(int minSaida){
        this.minSaida = minSaida;
    }
    public double getConta(){
        return conta;
    }
    public void setConta(double conta){
        this.conta = conta;
    }
    public double tempo(int hrEntrada, int minEntrada, int hrSaida, int minSaida){
        int totalEntrada;
        totalEntrada = (hrEntrada * 60) + minEntrada;
        int totalSaida;
        totalSaida = (hrSaida * 60) + minSaida;
        double totalMin;
        double horas;
        totalMin = totalSaida - totalEntrada;
        horas = totalMin/60;
        return horas;
    }
    public void pagamento(double horas, String codCarro){ 
        int total;
            total= (int)(Math.ceil(horas) * 4);           
            JOptionPane.showMessageDialog(null, "O total a ser pago pelo dono do carro de código "+codCarro+" é: "+total+" reais");      
    }
}