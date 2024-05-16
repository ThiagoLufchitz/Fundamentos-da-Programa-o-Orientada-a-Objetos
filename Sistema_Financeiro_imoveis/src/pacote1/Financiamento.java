package pacote1;

public class Financiamento {

    private double valorimovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorimovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorimovel = valorimovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double PagamentoMensal(double valorimovel, int prazoFinanciamento, double taxaJurosAnual) {
        return (valorimovel / (prazoFinanciamento * 12)) * (1 + (taxaJurosAnual / 12));
    }

    public double TotaldoPagamento(double PagamentoMensal, int prazoFinanciamento) {
        return PagamentoMensal * (prazoFinanciamento * 12);
    }

}
