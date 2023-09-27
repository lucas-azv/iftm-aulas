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

        int somaInt = Adicao1.addInt(d1.getA(), d1.getB());
        String texto = Adicao1.exibeInt(somaInt);

        System.out.println(texto);

        scanner.close();
    }

}
/*
 * ler dois numeros inteiros, somar e exibir resultados
 * a leitura sera feita para que ocorra a instanciação da classe Dados1. A soma
 * e exibição serao feitas por meio da instanciação da classe adicao1
 */