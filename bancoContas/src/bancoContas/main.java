package bancoContas;

public class main {
    public static void main(String[] args) {

        //Conta Sanny
        Cliente sanny = new Cliente();
        sanny.setNome("Sanny Helen");
        Conta cc = new ContaCorrente(sanny);
        Conta poupanca = new ContaPoupanca(sanny);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        //Conta Isac
        Cliente isac = new Cliente();
        isac.setNome("Isac Lima");
        Conta cc2 = new ContaCorrente(isac);


        //Operações:

        cc.transferir(300, poupanca);
        poupanca.depositar(594);
        cc2.depositar(700);
        cc2.depositar(20);
        cc.depositar(400);
        cc.imprimirExtrato();
        cc2.imprimirExtrato();

        cc.pix(90, cc2);

        cc.imprimirExtrato();
        cc2.imprimirExtrato();


    }
}
