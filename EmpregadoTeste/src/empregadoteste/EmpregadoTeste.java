package empregadoteste;

import java.util.Scanner;

public class EmpregadoTeste {
    public static void Ler(Empregado obj, int num){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o codigo do " + num + " empregado:");
        obj.setCod(entrada.nextInt());
        System.out.println("Informe o nome do " + num + " empregado:");
        obj.setNome(entrada.next());
        System.out.println("Informe o sobrenome do " + num + " empregado:");
        obj.setSobrenome(entrada.next());
        System.out.println("Informe o salário mensal do " + num + " empregado:");
        obj.setSalariomensal(entrada.nextDouble());
    }
    public static void main(String[] args) {
        
        
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();
        
        Ler(empregado1,1);
        Ler(empregado2,2);
        
        empregado1.MostraSalarioAnual();
        empregado2.MostraSalarioAnual();
        
        System.out.println("O salário do " + empregado1.getNome() + " anual após 10% é: " + empregado1.SalarioAnualPercent());
        System.out.println("O salário do " + empregado2.getNome() + " anual após 10% é: " + empregado2.SalarioAnualPercent());        
        
    }
    
}
