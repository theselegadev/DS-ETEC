package boletim;

public class Boletim {
    public static void Ler(Nota obj, int bim, double nota){
        obj.setBimestre(bim);
        obj.setValorNota(nota);
    }
    
    public static double media(double n1, double n2, double n3, double n4){
        return (n1+n2+n3+n4)/4;
    }
    
    public static void main(String[] args) {
        Nota b1 = new Nota();
        Nota b2 = new Nota();
        Nota b3 = new Nota();
        Nota b4 = new Nota();
        
        Ler(b1,1,10);
        Ler(b2,2,10);
        Ler(b3,3,10);
        Ler(b4,4,10);
        
        System.out.println("A média: " + media(b1.getValorNota(),b2.getValorNota(),b3.getValorNota(),b4.getValorNota()));
    }
    
}
