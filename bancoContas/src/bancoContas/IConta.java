package bancoContas;

public interface IConta {

     void sacar(double valor);

     void depositar(double valor);

     void taxaTransferencia(double valor);

     void pix (double valor, Conta conta);


     void transferir(double valor, Conta contaDestino);

     void imprimirExtrato();

}
