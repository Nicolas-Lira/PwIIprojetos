package contafinal;

import javax.swing.JOptionPane;

public class ContaFinal {

    public static void main(String[] args) {
    
        operacoes dados = new operacoes();
        
        dados.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de sua agência: ")));
        dados.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta: ")));
        dados.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));
        
        dados.logar(dados.getAgencia(), dados.getNumConta(), dados.getSenha());
        
    }
    
}
