package aula08ex1;

public abstract class Pessoa {

  private String nome;

public Pessoa(){}

public String getNome(){
return nome;
}
public void setNome(String n){
   nome = n;
}

public abstract String mostraClasse();


    
}
