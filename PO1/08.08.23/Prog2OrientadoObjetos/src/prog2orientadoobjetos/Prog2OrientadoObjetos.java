import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Prog2OrientadoObjetos {

    public static double leCoordenada(int tipo) {
        if (tipo == 1)
            return Double.parseDouble(JOptionPane.showInputDialog("Digite a abscissa XC do CENTRO: "));
        return Double.parseDouble(JOptionPane.showInputDialog("Digite a ordenada YC do CENTRO: "));
    }

    public static double leRaio() {
        return Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do RAIO: "));
    }

    public static double leAltura() {
        return Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da ALTURA: "));
    }

    public static void exibeTexto(String texto) {
        JOptionPane.showMessageDialog(null, texto, "SAÍDA", 1);
    }

    public static void main(String[] args) {
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("    M  E  N  U      P  R  I  N  C  I  P  A  L\n\n1- Círculo\n2- Cilindro\n3- Cone\n4- Esfera\n5- SAIR\n\nDigite a opção: "));
            switch (op) {
                case 1:
                    double xc, yc, raio;
                    xc = leCoordenada(1);
                    yc = leCoordenada(2);
                    raio = leRaio();
                    Circulo circ = new Circulo(xc, yc, raio);
                    do {
                        op = Integer.parseInt(JOptionPane.showInputDialog("             M  E  N  U\n\n1- Dados do Círculo\n2- Área do Círculo\n3- Comprimento do Circulo\n4-VOLTAR\nDigite a opção: "));
                        switch (op) {
                            case 1:
                                exibeTexto(circ.exibe());
                                break;
                            case 2:
                                double area = circ.area();
                                String valorFormatado = new DecimalFormat("0.00").format(area);
                                String texto = "A área do círculo é: " + valorFormatado;
                                exibeTexto(texto);
                                break;
                            case 3:
                                double comprimento = circ.comprimento();
                                valorFormatado = new DecimalFormat("0.00").format(comprimento);
                                texto = "O comprimento do círculo é: " + valorFormatado;
                                exibeTexto(texto);
                        }
                    } while (op != 4);
                    break;
                case 2:
                    double altura;
                    raio = leRaio();
                    altura = leAltura();
                    Cilindro cil = new Cilindro(altura);
                    do {
                        op = Integer.parseInt(JOptionPane.showInputDialog("             M  E  N  U\n\n1- Dados do Cilindro\n2- Área do Cilindro\n3-Volume do Cilindro\n4-VOLTAR\n\nDigite a opção: "));
                        switch (op) {
                            case 1:
                                exibeTexto(cil.exibe(raio));
                                break;
                            case 2:
                                Circulo circBase = new Circulo(0, 0, raio);
                                double area = cil.area(circBase.area(), circBase.comprimento());
                                String valorFormatado = new DecimalFormat("0.00").format(area);
                                String texto = "A área do cilindro é: " + valorFormatado;
                                exibeTexto(texto);
                                break;
                            case 3:
                                Circulo circBaseVolume = new Circulo(0, 0, raio);
                                double volume = cil.volume(circBaseVolume.area());
                                valorFormatado = new DecimalFormat("0.00").format(volume);
                                texto = "O volume do cilindro é: " + valorFormatado;
                                exibeTexto(texto);
                        }
                    } while (op != 4);
                    break;
                case 3:
                    double coneRaio, coneAltura;
                    coneRaio = leRaio();
                    coneAltura = leAltura();
                    Cone cone = new Cone(coneRaio, coneAltura);
                    do {
                        op = Integer.parseInt(JOptionPane.showInputDialog("             M  E  N  U\n\n1- Dados do Cone\n2- Área do Cone\n3- Volume do Cone\n4-VOLTAR\n\nDigite a opção: "));
                        switch (op) {
                            case 1:
                                exibeTexto(cone.exibe());
                                break;
                            case 2:
                                double area = cone.area();
                                String valorFormatado = new DecimalFormat("0.00").format(area);
                                String texto = "A área do cone é: " + valorFormatado;
                                exibeTexto(texto);
                                break;
                            case 3:
                                double volume = cone.volume();
                                valorFormatado = new DecimalFormat("0.00").format(volume);
                                texto = "O volume do cone é: " + valorFormatado;
                                exibeTexto(texto);
                        }
                    } while (op != 4);
                    break;
                case 4:
                    double esferaRaio = leRaio();
                    Esfera esfera = new Esfera(esferaRaio);
                    do {
                        op = Integer.parseInt(JOptionPane.showInputDialog("             M  E  N  U\n\n1- Dados da Esfera\n2- Área da Esfera\n3- Volume da Esfera\n4-VOLTAR\n\nDigite a opção: "));
                        switch (op) {
                            case 1:
                                exibeTexto(esfera.exibe());
                                break;
                            case 2:
                                double areaEsfera = esfera.area();
                                String valorFormatado = new DecimalFormat("0.00").format(areaEsfera);
                                String texto = "A área da esfera é: " + valorFormatado;
                                exibeTexto(texto);
                                break;
                            case 3:
                                double volumeEsfera = esfera.volume();
                                valorFormatado = new DecimalFormat("0.00").format(volumeEsfera);
                                texto = "O volume da esfera é: " + valorFormatado;
                                exibeTexto(texto);
                        }
                    } while (op != 4);
                    break;
                case 5:
                    break;
            }
        } while (op != 5);
    }
}
