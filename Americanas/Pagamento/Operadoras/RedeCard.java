package Americanas.Pagamento.Operadoras;

import Americanas.Caixa.Compra;
import Americanas.Pagamento.Autorizavel;
import Americanas.Pagamento.Cartao;
import Americanas.Pagamento.Operadora;

public class RedeCard implements Operadora, Autorizavel {

    @Override
    public void AutorizarCartao(Cartao cartão, Compra compra) {
        if (cartão.getCvv() == 456){
            cartão.setLimite(200.0);
            System.out.println("Cartão Autorizado");
            AutorizaCompra(cartão, compra);
        }else{
            System.out.println("Cartão não autorizado");
        }
    }

    @Override
    public void AutorizaCompra(Cartao cartao, Compra compra) {
        System.out.println("\n----------AUTORIZAÇÂO DE COMPRA-----------------");

        if (compra.getValor() <= cartao.getLimite()){
            System.out.println("Compra autorizada");
        }else {
            System.out.println("Compra recusada! o valor foi excedido");
        }
    }
}