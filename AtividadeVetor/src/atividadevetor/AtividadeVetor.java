package atividadevetor;
import java.util.Scanner;

public class AtividadeVetor {

    public static void exibir(String arg, int [] array){
        for(int i = 0; i<array.length; i++){
            System.out.println(arg+"["+i+"]="+array[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o comprimento do array: ");
        
        int tam = entrada.nextInt();
        int numPar = 0, numImpar = 0;
        int[] numeros = new int[tam];
        
        for(int i = 0; i<numeros.length; i++){
            System.out.println("Informe o valor da posição " + i);
            numeros[i] = entrada.nextInt();
            
            if(numeros[i] % 2 == 0){
                numPar++;
            }else{
                numImpar++;
            }
        }
        
        System.out.println("Números de pares: " + numPar);
        System.out.println("Números de impares: " + numImpar);
        
        int [] pares = new int [numPar];
        int [] impares = new int[numImpar];
        
        numPar = 0;
        numImpar = 0;
        
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] % 2 == 0){
                pares[numPar] = numeros[i];
                numPar++;
            }else{
                impares[numImpar] = numeros[i];
                numImpar++;
            }
        }
        
        exibir("pares",pares);
        exibir("impares",impares);
    }
}
