package empregadoteste;

public class Empregado {
    int cod;
    String nome;
    String sobrenome;
    double salariomensal;

    public Empregado() {
        
    }
    
    public  void MostraSalarioAnual(){
        System.out.println("O salário anual é: " + this.salariomensal * 12);
    }
    
    public double SalarioAnualPercent (){
        return ((this.salariomensal * 12) * 0.1) + (this.salariomensal * 12);
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalariomensal() {
        return salariomensal;
    }

    public void setSalariomensal(double salariomensal) {
        this.salariomensal = salariomensal;
    }
    
}
