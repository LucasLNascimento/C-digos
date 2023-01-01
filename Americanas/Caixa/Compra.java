package Americanas.Caixa;

import Americanas.Impressao.Impressora;
import Americanas.Impressao.Imprimivel;

public class Compra implements Imprimivel {

    protected String nome;
    protected Double valor;

    public Compra(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void comprovante(Compra compra, Impressora impressora) {
        System.out.println("\n----------COMPROVANTE------------");
        System.out.println("Nome do produto: " + compra.getNome()
                + "\n valor: R$ " + compra.getValor());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}