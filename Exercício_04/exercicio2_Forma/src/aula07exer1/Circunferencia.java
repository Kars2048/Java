package aula07exer1;

public class Circunferencia extends Forma {
   //Atributos
   private float raio;
   
    //construtores
   public Circunferencia(){

}
   public Circunferencia(float raio){
       this.raio = raio;
   
   }
// Métodos de Acesso
    public void setRaio(float raio){
        raio = raio;
    }

public float getRaio(){

   return raio;
}


public float perimetro(){

   return (float)(2* Math.PI) * raio;
}
public float area(){
    return (float) Math.PI * raio;
}

public void mostra(){
    System.out.println("A circunferencia é: ");
    System.out.println("Raio: "+raio);
    System.out.println("Area: "+area());
    System.out.println("Perimetro: "+perimetro());
}  



    
}
