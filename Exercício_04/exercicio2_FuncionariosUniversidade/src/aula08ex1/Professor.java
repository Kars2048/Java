package aula08ex1;

public class Professor extends Pessoa {
    private int matricula;
    private String campus;

   public Professor(){};
   
   public int getMatricula(){
    return matricula;   
   }
   public String getCamus(){
       return campus;
   }
   public void setMatricula(int m){
       matricula = m;
   }
   public void setCampus(String c){
       campus = c;
   }
   
 public String mostraClasse(){

   return "Sou um objeto do tipo Professor";
 }

    
}
