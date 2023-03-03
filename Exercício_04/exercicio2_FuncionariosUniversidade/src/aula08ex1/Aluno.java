package aula08ex1;

public class Aluno extends Pessoa{

   private String rgm;

   public Aluno(){};

 public String getRgm(){
  return rgm;   
 }

 public void setRgm(String r){
   rgm = r;
 }
   
 public String mostraClasse(){

   return "Sou um objeto do tipo Aluno";
 }

    
}
