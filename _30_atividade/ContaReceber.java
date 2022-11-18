package _30_atividade;

public class ContaReceber extends Conta {

    private Cliente cliente;

    @Override
    public void exibirDetalhes() {
        System.out.println("Conta a Receber");
        System.out.println("========================");
        System.out.println("Fornecedor: " + this.getCliente().getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Data de Vencimento: " + this.getDataVencimento());
        System.out.println("Situação: " + this.getSituacaoConta());
        System.out.println("=========================");
    }

    public ContaReceber() {

    }

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento){
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void cancelar(){
        if (this.getValor() > 50000){
            System.out.println("Essa conta não pode ser cancelada: " + this.getDescricao() + ".");
        }else{
            super.cancelar();
        }
    }

    public void receber(){
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Não pode receber uma conta que já foi paga " + this.getDescricao() + ".");
        }else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.println("Não pode receber uma conta que está cancelada " + this.getDescricao() + getDescricao());
        }else{
            System.out.println("Receber conta " + this.getDescricao() + " no valor de " + this.getValor()
                    + " e vencimento em " + this.getDataVencimento() + " do cliente " + this.getCliente().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

