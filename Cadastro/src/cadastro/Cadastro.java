package cadastro;
import java.util.Scanner;

public class Cadastro {
    
    public static void Ler(Pessoa arg, int num){
        
        Scanner e = new Scanner(System.in);
        
        System.out.println("Informe o codigo da pessoa " + num);
        arg.setCodigo(e.nextInt());
        
        System.out.println("Informe o nome da pessoa " + num);
        arg.setNome(e.next());
        
        System.out.println("Informe a idade da pessoa " + num);
        arg.setIdade(e.nextInt()); 
    }

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();        
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        
        Ler(pessoa1,1);
        Ler(pessoa2,2);
        Ler(pessoa3,3);
        
        if(pessoa1.getIdade() > pessoa2.getIdade() && pessoa1.getIdade() > pessoa3.getIdade()){
            System.out.println("A pessoa com a maior idade é: " + pessoa1.getNome() + " com " + pessoa1.getIdade() + " anos");
        }else if(pessoa2.getIdade() > pessoa1.getIdade() && pessoa2.getIdade() > pessoa3.getIdade()){
            System.out.println("A pessoa com a maior idade é: " + pessoa2.getNome() + " com " + pessoa2.getIdade() + " anos");
        }else if(pessoa3.getIdade() > pessoa1.getIdade() && pessoa3.getIdade() > pessoa2.getIdade()){
            System.out.println("A pessoa com a maior idade é: " + pessoa3.getNome() + " com " + pessoa3.getIdade() + " anos");
        }else{
            System.out.println("As pessoas tem idade igual!");
        }    
    }
    
}
