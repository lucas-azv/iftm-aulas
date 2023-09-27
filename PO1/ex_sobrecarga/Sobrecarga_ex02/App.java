import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int a = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        int b = scanner.nextInt();

        Dados1 d1 = new Dados1();
        d1.setA(a);
        d1.setB(b);

        System.out.println("Digite o primeiro numero:");
        float c = scanner.nextFloat();

        System.out.println("Digite o segundo numero:");
        float d = scanner.nextFloat();

        Dados1 d2 = new Dados1();
        d2.setC(c);
        d2.setD(d);

        float somaFloat = Adicao2.add(d2.getC(), d2.getD());
        String texto = Adicao2.exibe(somaFloat);

        System.out.println(texto);

        scanner.close();
    }

}
