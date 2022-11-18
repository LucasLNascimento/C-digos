package _30_atividade;

public class RelatorioContas {

    public void exibirListagem(Conta[] contas) {
        System.out.println("=============================");
        System.out.println("Relatório de contas a pagar e receber");
        System.out.println("=============================");

        for (int i = 0; i < contas.length; i++){
            contas[i].exibirDetalhes();
        }

        System.out.println("*******************************");
    }
}
