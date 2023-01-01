package Americanas.Impressao.Impressoras;

import Americanas.Caixa.Compra;
import Americanas.Impressao.Impressora;

public class ImpressoraEpson implements Impressora{


    @Override
    public void marcaImpressora() {
        System.out.println("==================EPSON=================");
    }

}