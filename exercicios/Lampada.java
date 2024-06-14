public class Lampada {
    private boolean ligada;
    @SuppressWarnings("unused")
    private String tipo;
    private int cor;

    public Lampada(String tipo, int cor) {
        this.ligada = false;
        this.tipo = tipo;
        this.cor = cor;
    }

    public void acende() {
        this.ligada = true;
    }

    public void apaga() {
        this.ligada = false;
    }

    public String estadoLampada() {
        String ret = "";
        if (this.ligada) {
            ret += "ligada";
        } else
            ret += "desligada";
        if (this.cor == 1) {
            ret += ", luz branca";
        } else if (this.cor == 2) {
            ret += ", luz verde";
        } else {
            ret += ", luz vermelha";
        }
        return ret;
    }

    public static class Casa {
        Lampada lampA;
        Lampada lampB;
        Lampada lampC;

        public static void main(String[] args) {
            int cor1 = 1;
            int cor2 = 2;
            int cor3 = 3;

            Casa minhCasa = new Casa();
            minhCasa.lampA = new Lampada("incandescente", cor3);
            minhCasa.lampB = new Lampada("LED", cor1);
            minhCasa.lampC = new Lampada("Fluorescente", cor2);

            minhCasa.lampA.acende();
            minhCasa.lampC.acende();
            System.out.println("Lamp1 " + minhCasa.lampB.estadoLampada());
            System.out.println("Lamp2 " + minhCasa.lampC.estadoLampada());
            System.out.println("Lamp3 " + minhCasa.lampA.estadoLampada());
        }
    }

}
