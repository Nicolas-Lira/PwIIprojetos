package estacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {

    public static void main(String[] args) {
        
        operacoes dados = new operacoes();
        // para o funcionamento do exercício, a hora de saída deve possuir um valor maior do que a hora de entrada.
        dados.setCodCarro(JOptionPane.showInputDialog("Escreva o código do carro: "));
        dados.setHrEntrada(Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de entrada do veículo: ")));
        dados.setMinEntrada(Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto da entrada do veículo: ")));
        dados.setHrSaida(Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de saída do veículo: ")));
        dados.setMinSaida(Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto da saída do veículo: ")));
        
        dados.pagamento(dados.tempo(dados.getHrEntrada(), dados.getMinEntrada(), dados.getHrSaida(), dados.getMinSaida()),dados.getCodCarro());
    }
    
}
