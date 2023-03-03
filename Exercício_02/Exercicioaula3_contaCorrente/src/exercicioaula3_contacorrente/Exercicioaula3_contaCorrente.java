package exercicioaula3_contacorrente;
import javax.swing.JOptionPane;

public class Exercicioaula3_contaCorrente {

    public static void main(String[] args) {
        float valor;
        ContaCorrente c1 = new ContaCorrente();
        c1.cadastraDados();

       
           JOptionPane.showMessageDialog(null, c1.imprimeDados());
        valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor a sacar"));
        c1.sacar(valor);

 

        valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor a depositar"));
        c1.depositar(valor);
        
         JOptionPane.showMessageDialog(null,""+ c1.imprimeDados());
    }
       
}
    

