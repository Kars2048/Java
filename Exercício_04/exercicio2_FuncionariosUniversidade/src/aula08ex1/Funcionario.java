package aula08ex1;

public class Funcionario extends Pessoa {

   private int matricula;
   private String setor;

   public Funcionario(){};
   
   public int getMatricula(){
       return matricula;
   }
   public String getSetor(){
       return setor;
   }
   public void setMatricula(int m){
       matricula = m;
   }
   public void setSetor(String s){
       setor = s;
   }
   
  @Override public String mostraClasse(){

     return "sou um objeto do tipo Funcionario";
 }

}
