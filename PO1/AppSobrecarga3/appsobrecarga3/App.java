package appsobrecarga3;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.menu();
    }

    public FigurasGeometricas le(int tipo) {
        if (tipo == 1) {
            double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado"));

            FigurasGeometricas quadrado = new FigurasGeometricas(lado);
        } else if (tipo == 2) {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo"));

            FigurasGeometricas triangulo = new FigurasGeometricas(base, altura);
        } else if (tipo == 3) {
            double xc = Double.parseDouble(JOptionPane.showInputDialog("Digite a abscissa XC do círculo"));
            double yc = Double.parseDouble(JOptionPane.showInputDialog("Digite a ordenada YC do círculo"));
            double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio do círculo"));

            FigurasGeometricas circulo = new FigurasGeometricas(xc,yc,raio);
        }

        return null;
    }

    public void menu() {
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("    M  E  N  U      P  R  I  N  C  I  P  A  L\n\n1- Quadrado\n2- Triângulo\n3- Círculo\n4- SAIR\n\nDigite a opção: "));
            switch (op) {
                case 1:
                do{
                    op = Integer.parseInt(JOptionPane.showInputDialog("    M  E  N  U\n\n1- Calcular área\n2- Exibir dados\n3- Voltar\n\nDigite a opção: "));
                    switch (op) {
                    case 1:
                    FigurasGeometricas quadrado = le(1);
                    FigurasGeometricas
                    break;

                    case 2:
 
                    }
                } while(op != 3);
                    break;

                case 2:
                    FigurasGeometricas triangulo = le(2);

                    break;

                case 3:
                    FigurasGeometricas circulo = le(3);

                    break;
            }
        } while (op != 4);
    }
}
