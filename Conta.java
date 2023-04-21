public class Conta{
    private String nome;
    private String cpf;
    private Double saldo;

    public Conta(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0.0);
    }
    private void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    private void setNome(String name){
        this.nome = name;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf(String Cpf){
        this.cpf = Cpf;
    }
    public String getCpf(){
        return cpf;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void deposito(Double valor) {
        this.saldo =saldo + valor;
    }
    private void subtracaoDeDinheiro(Double valor){
        this.saldo = saldo - valor;
    }
    public void transferencia(Conta cliente01, Conta cliente02, Double valorEnviado) {
        if (valorEnviado > cliente01.getSaldo()) {
            System.out.println("Prezado, " + cliente01.getNome() + ", o valor de transferencia é menor do que o saldo em conta." +
                    "\nSaldo atual: " + cliente01.getSaldo());
            System.out.println("Transferencia nao realizada.");
            if (valorEnviado <= cliente01.getSaldo()) {

                cliente01.subtracaoDeDinheiro(valorEnviado);
                cliente02.deposito(valorEnviado);
                System.out.println("Transação feita com sucesso.\n" + cliente01.getNome() + " enviou " + valorEnviado + "R$ para " + cliente02.getNome() + "\n");
            }
        }
    }

    public void imprimeDados(){
        System.out.println("\nNome do cliente: "+ getNome() + "\nCPF: "+getCpf()+"\nSaldo do cliente: "+getSaldo());
    }
}


