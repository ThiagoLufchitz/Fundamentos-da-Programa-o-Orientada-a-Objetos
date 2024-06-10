/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

public abstract class Financiamento {
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

    // Metodo para calcular o pagamento mensal
    public abstract double PagamentoMensal();
    // {
    // int prazoMensal = prazoFinanciamento;
    // double taxaMensal = taxaJurosAnual;
    // return (valorimovel / (prazoMensal * 12)) * (1 + (taxaMensal / 12 / 100));
    // }

    public static class Casa extends Financiamento {
        public Casa(double valorimovel, int prazoMensal, double taxaJurosAnual) {
            super(valorimovel, prazoMensal, taxaJurosAnual);
        }

        @Override
        public double PagamentoMensal() {
            double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
            int meses = getPrazoFinanciamento() * 12;
            System.out.printf("Taxa Mensal : %.2f\n", taxaMensal);
            System.out.printf("Meses : %d\n", getPrazoFinanciamento());
            double pagamentoMensal = (getValorimovel() / meses) * (1 + taxaMensal) + 80;
            System.out.printf("Valor Parcial: %.2f\n", pagamentoMensal);
            return pagamentoMensal;
        }
    }

    // public static class Apartamento extends Financiamento {
    // public Apartamento(double valorimovel, int prazoMensal, double
    // taxaJurosAnual) {
    // super(valorimovel, prazoMensal, taxaJurosAnual);
    // }

    // @Override
    // public double PagamentoMensal() {
    // double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
    // int meses = getPrazoFinanciamento() * 12;
    // System.out.printf("Taxa Mensal : %.2f\n", taxaMensal);
    // System.out.printf("Meses : %d\n", getPrazoFinanciamento());
    // double valorcima = getValorimovel() * Math.pow(1 + taxaMensal, meses);
    // double valorbaixo = Math.pow(1 + taxaMensal, meses - 1.0);
    // System.out.printf("Valor Parcial: %.2f\n", valorcima / valorbaixo);
    // return valorcima / valorbaixo;
    // }
    // }

    // public static class Terreno extends Financiamento {
    // public Terreno(double valorimovel, int prazoMensal, double taxaJurosAnual) {
    // super(valorimovel, prazoMensal, taxaJurosAnual);
    // }

    // @Override
    // public double PagamentoMensal() {
    // double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
    // int meses = getPrazoFinanciamento() * 12;
    // System.out.printf("Taxa Mensal : %.2f\n", taxaMensal);
    // System.out.printf("Meses : %d\n", getPrazoFinanciamento());
    // double pagamentoMensal = ((getValorimovel() / meses) * taxaMensal) * 1.02;
    // System.out.printf("Valor Parcial: %.2f\n", pagamentoMensal);
    // return pagamentoMensal;
    // }

    // }

    // Metodo para calcular o total a ser pago
    public double TotaldoPagamento() {
        return PagamentoMensal() * (prazoFinanciamento * 12);
    }

    public void ShowDadosImovel() {
        System.out.printf("Valor do Imóvel: R$ %.2f\n", valorimovel);
        System.out.printf("Prazo do Financiamento: %d anos\n", prazoFinanciamento);
        System.out.printf("Taxa de Juros Anual: %.2f\nn", taxaJurosAnual);
        System.out.printf("Pagamento Mensal: R$ %.2f\n", PagamentoMensal());
        System.out.printf("Total do Pagamento: R$ %.2f\n", TotaldoPagamento());
    }

}
