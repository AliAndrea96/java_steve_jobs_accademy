package geometria;

class Triangolo extends Forma {
    private double base;
    private double altezza;
    private double lato1;
    private double lato2;
    private double lato3;

    public Triangolo(double base, double altezza, double lato1, double lato2, double lato3) {
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public double calcolaArea() {
        return 0.5 * base * altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }
}