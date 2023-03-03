package exercicioaula3_triangulo;

public class Triangulo {
    float base;
    float altura;
    
    public Triangulo(){};
    
    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    public float calculaArea(){
        return (this.base*this.altura)/2;
    }
    public void imprimeDados(){
        System.out.println("A area do Triângulo  é:  " + calculaArea());
    }
    
    
}
