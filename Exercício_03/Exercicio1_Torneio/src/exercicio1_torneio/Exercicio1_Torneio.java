package exercicio1_torneio;

public class Exercicio1_Torneio {
    public static void main(String[] args) {
        Torneio t1 = new Torneio("Pri",36);
        Torneio t2 = new Torneio("Luiz",35);

       
        System.out.println(t1.getNome());
        
          t1.imprimeDados();
          System.out.println();
        
        
        
        System.out.println(t2.getNome());
        
          t2.imprimeDados();
          System.out.println();


    }
       
    
    
}
