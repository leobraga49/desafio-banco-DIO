public class Main {
    public static void main(String[] args) {
        var cliente = new Cliente();
        cliente.setNome("Leonardo");

        var cc = new ContaCorrente(cliente);
        var cp = new ContaPoupanca(cliente);

        cc.depositar(1000);
        cc.transferir(500,cp);

        cp.sacar(400);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
