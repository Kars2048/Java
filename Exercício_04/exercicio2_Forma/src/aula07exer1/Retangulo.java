package aula07exer1;

public class Retangulo extends Triangulo {
    public Retangulo() {
    }

    public Retangulo(float base, float altura) {
        super(base, altura);
    }

    public float area() {
        return getAltura() * getBase();
    }

    public float perimetro() {
        return (getBase() * getAltura()) * 2;
    }

    public void mostra() {
        System.out.println("O Retangulo tem a: " +
                "\nBase: " + getBase()
                + "\nAltura: " + getAltura()
                + "\nÁrea: " + area()
                + "\nPerimetro: " + perimetro());
    }
    
}
