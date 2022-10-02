/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author alian
 */
public class Validacion_RUT {
    
    String RUT;

    public Validacion_RUT(String RUT) {
        this.RUT = RUT;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }
    
    //Metodo
    
    public boolean Validacion_Concreta(){
        
        Boolean lDevuelve = false;
         int Ult= this.RUT.length();
         int Largo = this.RUT.length() -3;
         int Constante = 2;
         int Suma = 0;
         int Digito = 0;
        
             for (int i= Largo; i >=0; i--){
             
             Suma= Suma + Integer.parseInt(this.RUT.substring(i,i+1)) * Constante;
             Constante = Constante + 1 ;
             if (Constante == 8){
                 Constante =2; }
         }
         String Ultimo = this.RUT.substring(Ult-1).toUpperCase();
         Digito =11 - (Suma % 11);
         if (Digito==10 && Ultimo.equals("K")){
             lDevuelve=true;
   } else 
        { 
            if(Digito == 11 && Ultimo.equals("0")){
               lDevuelve=true;    
            } 
            else
            {    
               
                if (Digito == Integer.parseInt(Ultimo)){
            
                 lDevuelve=true;
           
        }
         
        
       
        }     
     
}
         return lDevuelve;
    }
}

