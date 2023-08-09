import javax.swing.JOptionPane;

public class matematica {
    public static void menu(){
     int opcao;
     do{
         String opcaoStr = JOptionPane.showInputDialog(null,
             "Escolha uma opção:\n" +
             "1. Aritmética \n" +
             "2. Primos \n" +
             "3. Fatorial \n" +
             "4. Perfeito \n" +
             "5. Sair \n"
             ,1
            );
            opcao = Integer.parseInt(opcaoStr);

            switch(opcao){
                case 1: opAritmetica();
                break;
                case 2: opPrimos();
                break;
                case 3: opFatorial();
                break;
                case 4: opPerfeito();
                break;
                case 5: JOptionPane.showMessageDialog(null, "Saindo do programa.");;
                break;
                default: JOptionPane.showMessageDialog(null, "Selecione uma opção válida");
            }

        }while(opcao != 5);      
}
 public static void opAritmetica(){
    int n1 = lerNumero("Digite o primeiro número: ");
    char operador = lerOperador();
    int n2;
    do {
        n2 = lerNumero("Digite o segundo número:");
        if (operador == '/' && n2 == 0) {
            JOptionPane.showMessageDialog(null, "O segundo número não pode ser 0 para a operação de divisão.");
        }
    } while (operador == '/' && n2 == 0);

    int resultado = 0;
    switch(operador){
        case '+': resultado = n1+n2;
        break;
        case '-': resultado = n1-n2;
        break;
        case '*': resultado = n1*n2;
        break;
        case '/': resultado = n1/n2;
        break;
        default:
        JOptionPane.showMessageDialog(null, "Operador inválido.");
        return;
    }
    exibirResultado("Resultado da operação: " + n1 + " " + operador + " " + n2 + " = " + resultado);
}
 }
 public static void opPrimos(){
    int numero = lerNumero("Digite um número");
    boolean ehPrimo = true;

    if(numero<=1){
        ehPrimo = false;
    } else{
        for(int i = 2; i < Math.sqrt(numero); i++){
            if(numero%i == 0){
                ehPrimo = false;
                break;
            }
        }
    }
}
public static void opFatorial(){
     
}
public static void opPerfeito(){  
}

public static void main(String[] args){
    menu();
}
}
