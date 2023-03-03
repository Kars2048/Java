package exercicioaula3_triangulo;

public class Exercicioaula3_triangulo {
    public static void main(String[] args) {
      Triangulo t1 = new Triangulo(5,6);
      Triangulo t2 = new Triangulo();
        
      t2.base = 8;
      t2.altura = 6;
    
      
      t1.imprimeDados();
       System.out.println("");
      
       t2.imprimeDados();
        System.out.println("");
    }
    
}
