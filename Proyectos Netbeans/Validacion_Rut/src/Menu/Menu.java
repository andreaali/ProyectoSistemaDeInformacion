/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Clases.Validacion_RUT;
import java.util.Scanner;

/**
 *
 * @author alian
 */
public class Menu {
    
     public static void main(String[] args) {
     
         Scanner Leer = new Scanner(System.in);
         String rut;
         Validacion_RUT Validacion ;
         
         System.out.println("Menu");
         System.out.println("");
         System.out.print("Ingrese el RUT a Validar: ");
         rut = Leer.nextLine();
         Validacion = new Validacion_RUT(rut);
         
         if(Validacion.Validacion_Concreta() == true){
             
             System.out.println("El rut Es Valido");
             
         }else{
             
             System.out.println("El rut es Invalido");
             
         }
         
    }
}
