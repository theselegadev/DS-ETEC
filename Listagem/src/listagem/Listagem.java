package listagem;

import java.util.Scanner;

public class Listagem {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] valores = new int[4];
        
        for(int i =0; i<valores.length; i++){
            System.out.println("Informe o " + i + " valor:");
            valores[i] = entrada.nextInt();
        }
        
        for(int i = 0; i < valores.length; i++){
            System.out.println("lista["+i+"]=" + valores[i]);
        }
    }
    
}
