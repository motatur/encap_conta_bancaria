public class ContaBancaria {

    private String titular;
    private int saldo;
    private int limite;

    public ContaBancaria(String titular, int limite) {
        this.titular = titular;
        this.limite = limite;
        this.saldo = 0;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getLimite() {
        return this.limite;
    }

    public void depositar(int valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(int valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else if (valor <= this.saldo + this.limite) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado!");
        } else {
            System.out.println("Saldo e limite insuficientes!");
        }
    }
}