package Americanas.Pagamento;

import Americanas.Caixa.Compra;
public interface Operadora {

    public void AutorizarCartao(Cartao cartão, Compra compra);
}