public class Main {
    public static void main(String[] args) {
        // objetos da classe
        ContaCorrente c1 = new ContaCorrente("Gabriel Teixeira", 1000);
        ContaPoupanca c2 = new ContaPoupanca("Ana Clara", 0);

        c1.transferir(250, c2);
    }
}