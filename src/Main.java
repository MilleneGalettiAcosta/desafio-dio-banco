public class Main {
    public static void main(String[] args) {

        Cliente user = new Cliente();
        user.setNome("Millene");

        Conta cc = new ContaCorrente(user);
        cc.depositar(100);


        Conta poupanca = new ContaPoupança(user);
        cc.transferir(poupanca, 100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
