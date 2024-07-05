package modelos;

public class conta {
    float saldo;
    String conta;

    public conta (String conta){
        saldo = 0;
                this.conta = conta;
    }
    public void depositar (float deposito) {
        saldo += deposito;
    }
    public void sacar (float sacar) {

        if(sacar > saldo) {
            System.out.println("Erro");
        }
        else {
            saldo -= sacar;
        }
    }
    public String toString () {
        return "Saldo"+saldo;
    }
}
