public class ContaBancaria {
    private String Titular;
    private double saldo;

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String Titular, double saldo) {
        this.Titular = Titular;
        this.saldo = saldo;
    }

    public double depositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }

    public double sacar(double valor){
        if (saldo < valor){
            System.out.println("Saldo insuficiente");
            return 0;
        } else {
            this.saldo = saldo - valor;
            System.out.println("Sacou: " + valor);
            System.out.println("Saldo atual: ");
            return saldo;
        }
    }

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
