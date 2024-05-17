/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

public class Financiamento {
    // Atributos privados
    private double valorimovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // get do valor do imovel
    public double getValorimovel() {
        return valorimovel;
    }

    // set do valor do imovel
    public void setValorimovel(double valorimovel) {
        this.valorimovel = valorimovel;
    }

    // get do prazo financiado
    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    // set do prazo finaniciado
    public void setPrazoFinanciamento(int prazoFinanciamento) {
        this.prazoFinanciamento = prazoFinanciamento;
    }

    // get da taxa de juros anual
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // set da taxa de juros anual
    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Metodo Construtor da class
    public Financiamento(double valorimovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorimovel = valorimovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Metodo para calcular o pagamento mensal
    public double PagamentoMensal(double valorimovel, int prazoFinanciamento, double taxaJurosAnual) {
        return (valorimovel / (prazoFinanciamento * 12)) * (1 + (taxaJurosAnual / 12));
    }

    // Metodo para calcular o total a ser pago
    public double TotaldoPagamento(double PagamentoMensal, int prazoFinanciamento) {
        return PagamentoMensal * (prazoFinanciamento * 12);
    }

}
