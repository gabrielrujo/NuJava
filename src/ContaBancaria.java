// classe
public abstract class ContaBancaria {
// atributos da classe ContaBancaria
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
// metodo construtor
    public ContaBancaria(String Titular, double saldo) {
        this.titular = Titular;
        this.saldo = saldo;
    }
// metodo depositar
    public double depositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }
// metodo sacar
    public double sacar(double valor){
        if (saldo < valor){
            System.out.println("Saldo insuficiente");
            return 0;
        } else {
            this.saldo = saldo - valor;
            System.out.println("Sacou: " + valor);
            System.out.println("Saldo atual: " + this.saldo);
            return saldo;
        }
    }
// metodo transferir
    public void transferir(double valor, ContaBancaria contaDestino) {
        if  (saldo < valor){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo = saldo - valor;
            contaDestino.depositar(valor);
            System.out.println("Depositou: " +  valor);
            System.out.println("Saldo atual: " + saldo);
        }
    }

}
