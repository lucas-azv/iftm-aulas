public class Esfera {
    private Circulo base;

    public Esfera(double raio) {
        this.base = new Circulo(0, 0, raio);
    }

    public double area() {
        return 4 * base.area(); 
    }

    public double volume() {
        return (4.0 / 3.0) * base.area() * base.raio;
    }

    public String exibe() {
        return "     Dados da Esfera\n\nRAIO = " + base.raio;
    }
}
