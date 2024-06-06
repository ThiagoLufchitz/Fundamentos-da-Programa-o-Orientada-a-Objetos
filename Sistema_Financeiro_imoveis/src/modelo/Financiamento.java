/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

public class Financiamento {
    // Atributos privados
    private double valorimovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Metodo Construtor da class
    public Financiamento(double valorimovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorimovel = valorimovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // get do valor do imovel
    public double getValorimovel() {
        return valorimovel;
    }

    // get do prazo financiado
    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    // get da taxa de juros anual
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // // set do valor do imovel
    // public void setValorimovel(double valorimovel) {
    // this.valorimovel = valorimovel;
    // }

    // // set do prazo finaniciado
    // public void setPrazoFinanciamento(int prazoFinanciamento) {
    // this.prazoFinanciamento = prazoFinanciamento;
    // }

    // // set da taxa de juros anual
    // public void setTaxaJurosAnual(double taxaJurosAnual) {
    // this.taxaJurosAnual = taxaJurosAnual;
    // }

    // Metodo para calcular o pagamento mensal
    public double PagamentoMensal() {
        int prazoMensal = prazoFinanciamento;
        double taxaMensal = taxaJurosAnual;
        return (valorimovel / (prazoMensal * 12)) * (1 + (taxaMensal / 12 / 100));
    }

    // Metodo para calcular o total a ser pago
    public double TotaldoPagamento() {
        return PagamentoMensal() * (prazoFinanciamento * 12);
    }

    public void ShowDadosImovel() {
        System.out.printf("Valor do Imóvel: R$ %.2f%n", valorimovel);
        System.out.printf("Prazo do Financiamento: %d anos%n", prazoFinanciamento);
        System.out.printf("Taxa de Juros Anual: %.2f%%%n", taxaJurosAnual);
        System.out.printf("Pagamento Mensal: R$ %.2f%n", PagamentoMensal());
        System.out.printf("Total do Pagamento: R$ %.2f%n", TotaldoPagamento());
    }

}
