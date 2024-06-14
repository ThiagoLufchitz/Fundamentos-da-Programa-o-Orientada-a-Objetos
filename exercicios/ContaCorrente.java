
public class ContaCorrente {
    private int numero;
    private double saldo;
    private double aplicacao;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public class ExcecaoSaldolnsuficienteAplicacao extends Exception {
        public ExcecaoSaldolnsuficienteAplicacao(String mensagem) {
            super(mensagem);

        }

        public ExcecaoSaldolnsuficienteAplicacao() {
            super();
        }
    }

    public void retirar(double valor) throws ExcecaoSaldoInsuficienteSaque {
        if (saldo < valor)
            throw new ExcecaoSaldoInsuficienteSaque(
                    "\nProblema - C/C: " + numero + "Saldo R$ " + saldo + " insuficiente para saque de R$: " + valor);
        saldo = saldo - valor;
    }

    public void aplicar(double valor) throws ExcecaoSaldolnsuficienteAplicacao {
        if (saldo < valor)
            throw new ExcecaoSaldolnsuficienteAplicacao(
                    "PROBLEMA C/C: " + numero + ", Saldo R$ " + saldo + " insuficiente para aplicacao de R$: " + valor);
        saldo = saldo - valor;
        aplicacao = aplicacao - valor;
    }

    @Override
    public String toString() {
        return "ContaCorrente [Cta: " + numero + ", Saldo R$ " + saldo + ",aplicacao = R$ " + aplicacao + "]";
    }

    public class ExcecaoSaldoInsuficienteSaque extends Exception {
        public ExcecaoSaldoInsuficienteSaque(String mensagem) {
            super(mensagem);
        }

        public ExcecaoSaldoInsuficienteSaque() {
            super();
        }
    }

    public static class Banco {
        public static void main(String[] args) {
            ContaCorrente ccl = new ContaCorrente(20, 200);
            ContaCorrente cc2 = new ContaCorrente(10, 100);
            try {
                ccl.retirar(40);
                ccl.aplicar(500);
                cc2.retirar(20);
                cc2.aplicar(500);
            } catch (ExcecaoSaldoInsuficienteSaque e) {
                System.out.println(e.getMessage());
            } catch (ExcecaoSaldolnsuficienteAplicacao e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println(ccl.toString());
                System.out.println(cc2.toString());
            }
        }
    }
}