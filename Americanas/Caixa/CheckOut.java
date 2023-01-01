package Americanas.Caixa;

import Americanas.Impressao.Impressora;
import Americanas.Pagamento.Cartao;
import Americanas.Pagamento.Operadora;


public class CheckOut {
    private Operadora operadora;
    private Impressora impressora;

    public CheckOut(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fechaComprar(Cartao cartao, Compra compra){
        this.operadora.AutorizarCartao(cartao, compra);
        compra.comprovante(compra, this.impressora);
    }
}