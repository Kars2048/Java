package aula08ex1;

import javax.swing.JOptionPane;


public class Aula08ex1 {

 
    public static void main(String[] args) {
    
        Pessoa p = null;

     while(true){
    
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite uma opção: "

        +"\n1-aluno"
        +"\n2-Professor"
        +"\n3-Funcionario"
        +"\n4-Sair"
      ));

      switch (tipo){
         case 1:
            p = new Aluno();
            break;
         case 2:
            p = new Professor();
            break;
         case 3:
            p = new Funcionario();
            break;
         case 4:
            System.out.println("Saindo da aplicação...");
            System.exit(0);
         default:
             System.out.println("opção inválida");
             System.exit(0);          
 
       }
       System.out.println(p.mostraClasse());


     }
    
        
    }
    
}
