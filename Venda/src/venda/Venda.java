package venda;

public class Venda {
    
    public static double Somar(double num1, double num2, double num3, double num4, double num5){
        return num1 + num2 + num3 + num4 + num5;
    }
    
    public static void Ler(Produto obj, int num, String desc, double preco){
        obj.setNumero(num);
        obj.setDesc(desc);
        obj.setPreco(preco);
    }
    
    public static void main(String[] args) {
        Produto item1 = new Produto();
        Produto item2 = new Produto();
        Produto item3 = new Produto();
        Produto item4 = new Produto();
        Produto item5 = new Produto();
        
        Ler(item1,1,"Pastel",12.90);
        Ler(item2,2,"Cachorro quente",20.90);
        Ler(item3,3,"Sopa",5.00);
        Ler(item4,4,"Refrigerante",3.50);
        Ler(item5,5,"Água",2.90);
        
        System.out.println("Soma: " + Somar(item1.getPreco(),item2.getPreco(),item3.getPreco(),item4.getPreco(),item5.getPreco()));
    }
    
}
