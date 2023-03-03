package exercicioaula3_data;

import javax.swing.*;
public class Data {
    int dia;
    int mes;
    int ano;
    
    public Data(){};
    public Data(int dia, int mes, int ano){
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
      
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    public void  cadastraDados(){ 
     int dia = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o dia: "));
     int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o mes: "));
     int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o ano: "));
     setAno(ano);
     setDia(dia);
     setMes(mes);
    }
    public void imprimeDados(){
        String msg = "A data é ";
        msg += "\nDia: "+getDia()+"\nMes: "+getMes()+"\nAno: "+getAno();
       
        
        JOptionPane.showMessageDialog(null,msg);
     
        
    }
    
}

