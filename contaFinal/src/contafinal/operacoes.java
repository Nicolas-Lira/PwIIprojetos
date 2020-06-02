package contafinal;

import javax.swing.JOptionPane;

public class operacoes {
    public int numConta;
    public int agencia;
    public String nome;
    public String senha;
    private double saldo;
    private boolean logado = false;

    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public int getAgencia(){
        return agencia;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha (String senha){
        this.senha = senha;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public boolean getLogado(){
        return logado;
    }
    public void setLogado(boolean logado){
        this.logado = logado;
    }
    public boolean logar(int agencia, int numConta, String senha){
        if (agencia == 1234 && numConta == 1 && "abc123".equals(senha)){
            this.logado = true;
            atual(this.logado);
        }
        else{
            JOptionPane.showMessageDialog(null, "dados errados!");
            this.logado = false;
        }
        return this.logado;
    }
    public void atual(boolean logado){
        if (logado == true){
            int opcao= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 1 para executar um depósito, "
                + "\n2 para executar um saque, \n3 para verificar seu saldo atual ou "
                + "\n4 para sair do sistema"));
        
            switch (opcao){

                case 1:
                    depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para o depósito: ")),this.logado);
                    break;

                case 2:
                    sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para o saque: ")),this.logado);
                    break;

                case 3:
                    consultarSaldo(this.logado);
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "Obrigado pela consideração!\nTenha um ótimo dia!");

                default :
                    JOptionPane.showMessageDialog(null,"Insira outro número");
                    break; 
            }
        }
    }
    public void sacar(double valor, boolean logado){
        this.saldo = this.saldo - valor;
        String opcao;
        opcao = JOptionPane.showInputDialog(null, "Deseja realizar outra ação?\n"
                + "Caso sim escreva S\n"
                + "Caso não escreva N");
        switch (opcao){
            case "S":
                atual(this.logado);
                break;
            case "N":
                JOptionPane.showMessageDialog(null, "Obrigado pela atenção!\nVolte outra hora!");
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "tente outa vez");
                atual(this.logado);
                break;
        }
    }
    public void depositar (double valor, boolean logado){
        this.saldo = this.saldo + valor;
        String opcao;
        opcao = JOptionPane.showInputDialog(null, "Deseja realizar outra ação?\n"
                + "Caso sim escreva S\n"
                + "Caso não escreva N");
        switch (opcao){
            case "S":
                atual(this.logado);
                break;
            case "N":
                JOptionPane.showMessageDialog(null, "Obrigado pela atenção!\nVolte outra hora!");
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "tente outa vez");
                atual(this.logado);
                break;
        }
    }
    public void consultarSaldo (boolean logado){
        JOptionPane.showMessageDialog(null, "O valor atual disponível na sua conta é: "+ getSaldo()+" reais");
        String opcao;
        opcao = JOptionPane.showInputDialog(null, "Deseja realizar outra ação?\n"
                + "Caso sim escreva S\n"
                + "Caso não escreva N");
        switch (opcao){
            case "S":
                atual(this.logado);
                break;
            case "N":
                JOptionPane.showMessageDialog(null, "Obrigado pela atenção!\nVolte outra hora!");
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "tente outa vez");
                atual(this.logado);
                break;
        }
    }
}
