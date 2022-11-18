package _30_atividade;

public abstract class Conta{

    private String descricao;
    private Double valor;
    private String dataVencimento;
    protected SituacaoConta situacaoConta;

    public Conta(){
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public abstract void exibirDetalhes();

    public void cancelar(){
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Não pode cancelar uma conta já foi paga " + this.getDescricao() + ".");
        }else if (SituacaoConta.CANCELADA.equals(this.situacaoConta)){
            System.out.println("Não pode cancelar uma conta já foi cancelada " + this.getDescricao() + ".");
        }else {
            System.out.println("Cancelada conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }
}