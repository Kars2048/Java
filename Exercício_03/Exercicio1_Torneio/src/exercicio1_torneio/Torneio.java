package exercicio1_torneio;

public class Torneio {
     private int idade;
    private String nome;

public Torneio(String n, int i){

    idade = i;
    nome = n;
}
// métodos de acesso - get
public String getNome(){
    return nome;

}
public int getIdade(){
    return idade;

}

public void setIdade(int i){
    idade = i;

}
public void setNome(String n){
    nome = n;

}

public String verificaCategoria(){
   if (idade >=5 && idade <=7 ){
   return "Infantil";
}else if(idade >= 8 && idade <=10){
  return "Juvenil";

}else if(idade >=11 && idade <=15 ){
  return "Adolescente";

}else if (idade >=16 && idade <= 30){

 return" Adulto";

}else if (idade >30){

 return"Senior";

}
   return " Erro na Categoria";
}
public void imprimeDados(){
    System.out.println("Sua idade é: " + idade);
    System.out.println("sua categoria é: " + verificaCategoria());
}
    
}
