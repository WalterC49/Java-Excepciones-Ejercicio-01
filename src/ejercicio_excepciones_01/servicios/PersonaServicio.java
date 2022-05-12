/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_excepciones_01.servicios;

import ejercicio_excepciones_01.entidades.Persona;
import ejercicio_excepciones_01.excepciones.PersonaException;
import static java.lang.Math.pow;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Walter
 */
public class PersonaServicio {
    public Scanner leer = new Scanner(System.in);
    
    public void CrearPersona(Persona[] p1,int i){
        System.out.println("\n"+(i+1)+" º persona:");
        System.out.print("Ingrese el nombre: ");
        p1[i].setNombre(leer.nextLine());
        System.out.print("Ingrese la edad: ");
        p1[i].setEdad(leer.nextInt());
        do{
            System.out.print("Ingrese el sexo(H- hombre,M- mujer,O- otro): ");
            p1[i].setSexo(toUpperCase(leer.next()));
            if(!(p1[i].getSexo().equals("H")||p1[i].getSexo().equals("M")||p1[i].getSexo().equals("O"))){
                System.out.println("Opción no valida.");
            }
        }while(!(p1[i].getSexo().equals("H")||p1[i].getSexo().equals("M")||p1[i].getSexo().equals("O")));
        System.out.print("Ingrese el peso(Kg): ");
        p1[i].setPeso(leer.nextDouble());
        System.out.print("Ingrese la altura(mts): ");
        p1[i].setAltura(leer.nextDouble());
    }
    
    public int CalcularMC(Persona[] p1,int i){
        
        if(p1[i].getPeso()/pow(p1[i].getAltura(),2)<20){
            return -1;
        }else if(p1[i].getPeso()/pow(p1[i].getAltura(),2)>=20||p1[i].getPeso()/pow(p1[i].getAltura(),2)<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean EsMayorDeEdad(Persona p1)throws PersonaException{
        try {
            if(p1==null){
                throw new PersonaException("No se instancio el objeto persona.");
            }
            
            if(p1.getAltura()<=0){
                throw new PersonaException("No se inicio el atributo altura");
            }
            
            if (p1.getEdad()<=0) {
                throw new PersonaException("No se inicio el atributo edad.");
            }
            
            if(p1.getNombre().isEmpty()){
                throw new PersonaException("No se inicio el atributo nombre.");
            }
            
            if(p1.getPeso()<=0){
                throw new PersonaException("No se inicio el atributo peso.");
            }
            
            if(p1.getSexo().isEmpty()){
                throw new PersonaException("No se inicio el atributo sexo.");
            }
            
            return p1.getEdad()>=18;
            
        } catch (PersonaException e) {
            throw e;
        }catch(Exception e){
           e.printStackTrace();
           throw new PersonaException("Error de sistema.");
        } finally {
            //ESTOY PROBANDO COSAS
            System.out.println("Saliendo de EsMayorDeEdad.");
        }
    }
    
//    public boolean EsMayorDeEdad(Persona[] p1,int i){
//        return p1[i].getEdad()>=18;
//    }
}
