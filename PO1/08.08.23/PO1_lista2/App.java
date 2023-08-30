import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Informe o coeficiente A (diferente de zero): ");
            double a = scanner.nextDouble();
            if (a == 0) {
                System.out.println("O coeficiente A deve ser diferente de zero.");
                continue;
            }

            System.out.println("Informe o coeficiente B: ");
            double b = scanner.nextDouble();

            System.out.println("Informe o coeficiente C: ");
            double c = scanner.nextDouble();

            EGrau2 equacao = new EGrau2(a, b, c);
            String raizes = equacao.exibeRaizes();
            System.out.println(raizes);

            System.out.println("Deseja resolver uma nova equação do segundo grau? (S/N)");
            String resposta = scanner.next().toUpperCase();
            if (!resposta.equals("S")) {
                break;
            }
        }

        System.out.println("Programa finalizado.");
    }
}
