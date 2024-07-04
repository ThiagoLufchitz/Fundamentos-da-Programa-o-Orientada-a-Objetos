/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

public abstract class Financiamento {
    // Atributos privados
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Metodo Construtor da class
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // get do valor do imovel
    public double getValorImovel() {
        return valorImovel;
    }

    // get do prazo financiado
    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    // get da taxa de juros anual
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // Metodo para calcular o pagamento mensal
    public abstract double PagamentoMensal();
    // {
    // int prazoMensal = prazoFinanciamento;
    // double taxaMensal = taxaJurosAnual;
    // return (valorimovel / (prazoMensal * 12)) * (1 + (taxaMensal / 12 / 100));
    // }

    // Metodo para calcular o total a ser pago
    public double TotaldoPagamento() {
        return PagamentoMensal() * (prazoFinanciamento * 12);
    }

    public void ShowDadosImovel() {
        System.out.printf("Valor do Imóvel: R$ %.2f\n", valorImovel);
        System.out.printf("Prazo do Financiamento: %d anos\n", prazoFinanciamento);
        System.out.printf("Taxa de Juros Anual: %.2f %%\n", taxaJurosAnual);
        System.out.printf("Pagamento Mensal: R$ %.2f\n", PagamentoMensal());
        System.out.printf("Total do Pagamento: R$ %.2f\n", TotaldoPagamento());
    }

}
