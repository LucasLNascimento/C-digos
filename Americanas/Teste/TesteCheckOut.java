package Americanas.Teste;

import Americanas.Caixa.CheckOut;
import Americanas.Caixa.Compra;
import Americanas.Impressao.Impressora;
import Americanas.Impressao.Impressoras.ImpressoraEpson;
import Americanas.Pagamento.Cartao;
import Americanas.Pagamento.Operadora;
import Americanas.Pagamento.Operadoras.Cielo;
import Americanas.Pagamento.Operadoras.RedeCard;

public class TesteCheckOut {
    public static void main(String[] args) {
        Operadora cielo = new Cielo();
        Impressora epson = new ImpressoraEpson();
        Cartao cartao1 = new Cartao(123);
        Compra compra1 = new Compra("PC", 100.0d);

        CheckOut teste1 = new CheckOut(cielo, epson);
        teste1.fechaComprar(cartao1, compra1);

        Operadora redCard = new RedeCard();
        Impressora hp = new ImpressoraEpson();
        Cartao cartao2 = new Cartao(456);
        Compra compra2 = new Compra("Picanha", 200.0d);

        CheckOut teste2 = new CheckOut(redCard, hp);
        teste2.fechaComprar(cartao2, compra2);
    }
}