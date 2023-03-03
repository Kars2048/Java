package exercicio_aula2;

public class Exercicio_aula2 {

  
    public static void main(String[] args) {
       Produto p = new Produto(); 
       Produto p2 = new Produto("i30","hyundai","222.222.22222",45f); 

       System.out.println();
       System.out.println(p2.marca);
       System.out.println( p2.fabricante);
       System.out.println(p2.cod_barras);
       System.out.println(p2.preco);
    }
    
}
