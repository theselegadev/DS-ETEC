package exemplovetor;
import java.util.Scanner;

public class ExemploVetor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[5];
        
        for(int i = 0; i<vetor.length; i++){
            System.out.println("Digite: ");
            vetor[i] = entrada.nextInt();
        }
        
        for(int i = 0;i< vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
    
}
