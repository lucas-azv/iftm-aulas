package appsobrecarga3;
import javax.swing.JOptionPane;

public class FigurasGeometricas {
    private double xc, yc, raio, base, altura, lado;

    public FigurasGeometricas(double lado){
        this.lado = lado;
    }
    public FigurasGeometricas(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public FigurasGeometricas(double xc, double yc, double raio){
        this.xc = xc;
        this.yc = yc;
        this.raio = raio;
    }

    public double AreaQuadrado(){
        double areaQ = Math.pow(lado,2);
        return areaQ;
    }
    public double areaCirculo(){
        double areaC = 2 * Math.PI * Math.pow(raio,2);
        return areaC;
    }
    public double areaTriangulo(){
        double areaT = (base * altura)/2;
        return areaT;
    }

    public String exibeQuadrado(){
        return "QUADRADO\n\nLado: " + lado;
    }
    public String exibeCirculo(){
        return "CÍRCULO\n\nXC: " + xc + "\nYC: " + yc + "\nRaio: " + raio;
    }
    public String exibeTriangulo(){
        return "TRIÂNGULO\n\nBase: " + base + "\nAltura: " + altura;
    }
}
