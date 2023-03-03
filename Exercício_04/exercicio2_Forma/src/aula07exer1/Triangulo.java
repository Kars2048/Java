package aula07exer1;

public class Triangulo extends Forma {
    
    protected float base;
    protected float altura;
    
     public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
    
    @Override
    public float area() {
      return (float) base * altura;
    }

    @Override
    public void mostra() {
        System.out.println("Area do tringulo é: "+area());
    }
    
}
