package banco;

import modelos.conta;

public class Banco {

    public static void main(String[] args) {
        conta a = new conta("conta 1");
        conta b = new conta("conta 2");
        a.depositar(200);
        a.sacar(50);
        System.out.println(a.toString());
    }
}
