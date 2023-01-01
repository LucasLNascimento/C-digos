package Americanas.Pagamento;

import Americanas.Caixa.Compra;

public interface Autorizavel{

    public void AutorizaCompra(Cartao cartao, Compra compra);
}