class EGrau2 {
    public double a, b, c;

    public EGrau2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return b*b - 4*a*c;
    }

    public double calculaX1() {
        double delta = delta();
        return (-b + Math.sqrt(delta)) / (2*a);
    }

    public double calculaX2() {
        double delta = delta();
        return (-b - Math.sqrt(delta)) / (2*a);
    }

    public String exibeRaizes() {
        double delta = delta();
        if (delta < 0) {
            return "Não é possível calcular raízes reais.";
        } else {
            double x1 = calculaX1();
            double x2 = calculaX2();
            return "Raízes: x1 = " + x1 + ", x2 = " + x2;
        }
    }
}
