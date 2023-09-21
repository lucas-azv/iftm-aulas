public class Cone {
    private Circulo base;
    private double altura;

    public Cone(double raio, double altura) {
        this.base = new Circulo(0, 0, raio);
        this.altura = altura;
    }

    public double area() {
        double areaBase = base.area();
        double areaLateral = base.comprimento() * geratriz();
        return areaBase + areaLateral;
    }

    public double volume() {
        return (1.0 / 3.0) * base.area() * altura;
    }

    public String exibe() {
        return "     Dados do Cone\n\nRAIO = " + base.raio + "\nALTURA = " + altura;
    }

    private double geratriz() {
        return Math.sqrt(Math.pow(base.raio, 2) + Math.pow(altura, 2));
    }
}
