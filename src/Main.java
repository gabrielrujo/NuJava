public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Gabriel Teixeira", 1000);
        ContaBancaria c2 = new ContaBancaria("Fernanda Kipper", 0);

        c1.transferir(250, c2);
    }
}