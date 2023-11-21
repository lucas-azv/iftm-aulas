public class App {
    public static void main(String[] args) throws Exception {
        int [] num = {4,8,5,16,32,21,64,128,62,80,90};
        int [] den = {2,0,4,8,0,2,4};
        int resultado=0;

    for(int i = 0; i < num.length; i++)
       try{
         if(num[i] % den[i] != 0){
            resultado = num[i]/den[i];
            System.out.println(resultado);
        }
       } catch(Exception error){
        System.err.println("\n");
       }
    }
}

/*
 * Faça um programa em java que inicializa dois vetores
 * int [] num = {4,8,5,16,32,21,64,128,62,80,90};
 * int [] den = {2,0,4,8,0,2,4};
 * o programa devera dividir os elementos do vetor num pelos elementos do vetor den
 * poderá ocorrer mais de uma exceção
*/