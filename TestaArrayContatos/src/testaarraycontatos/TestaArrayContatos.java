package testaarraycontatos;

public class TestaArrayContatos {

    public static void main(String[] args) {
        Contato [] agenda = new Contato[5];
        
        agenda[0] = new Contato("Maria","123456");
        agenda[1] = new Contato("Matheus","1233231");
        agenda[2] = new Contato("Luis","111212");
        agenda[3] = new Contato("Rodrigo","222323");
        agenda[4] = new Contato("Vivielly","123454");
        
        for(int i = 0; i < agenda.length; i++){
            System.out.println("Nome: " + agenda[i].getNome());
            System.out.println("Telefone: " + agenda[i].getTelefone());        
        }
    }
}
