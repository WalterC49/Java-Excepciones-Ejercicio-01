/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de
invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
*/
package ejercicio_excepciones_01;

import ejercicio_excepciones_01.entidades.Persona;
import ejercicio_excepciones_01.excepciones.PersonaException;
import ejercicio_excepciones_01.servicios.PersonaServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_Excepciones_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa crea un objeto persona y trata una excepción que se da en el metodo EsMayorDeEdad.");
        PersonaServicio personaservicio = new PersonaServicio();

        Persona persona = null;
//        persona= new Persona("", 28, "H", 60, 170);
//        persona= new Persona("Walter", 0, "H", 60, 170);
//        persona= new Persona("Walter", 28, "", 60, 170);
//        persona= new Persona("Walter", 28, "H", 0, 170);
//        persona= new Persona("Walter", 28, "H", 60, 0);
        
        try {
            if(personaservicio.EsMayorDeEdad(persona)){
                System.out.println(persona);
                System.out.println("Es mayor de edad.");
            }else{
                System.out.println(persona);
                System.out.println("No es mayor de edad.");
            }
            
        } catch (PersonaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Saliendo del programa.");
        }
        
        //CODIGO ORIGINAL
//        int[] edad = {0, 0};
//        int[] peso = {0, 0, 0};
//        //Declarando vector de objeto
//        Persona[] p2 = new Persona[4];
//        PersonaServicio pS = new PersonaServicio();
//
//        System.out.println("Este programa recibe los datos de 4 personas y luego"
//                + " calcula si esta en su peso ideal y si es mayor de edad o no.");
//
//        for (int i = 0; i < 4; i++) {
//            //Instanciando Vector de objeto
//            p2[i]= new Persona();
//            pS.CrearPersona(p2, i);
//            pS.leer.nextLine();
//        }
//        
//        for (int i = 0; i < 4; i++) {
//            System.out.println("\nLa "+(i + 1) + "º persona:");
//            switch (pS.CalcularMC(p2, i)) {
//                case -1:
//                    peso[0]++;
//                    System.out.println("Está debajo de su peso ideal.");
//                    break;
//                case 0:
//                    peso[1]++;
//                    System.out.println("Está en su peso ideal.");
//                    break;
//                case 1:
//                    peso[2]++;
//                    System.out.println("Tiene sobrepeso.");
//                    break;
//            }
//            if (pS.EsMayorDeEdad(p2, i)) {
//                edad[0]++;
//                System.out.println("Es mayor de edad.");
//            } else {
//                edad[1]++;
//                System.out.println("No es mayor de edad.");
//            }
//        }
//
//        System.out.println("\nDe las 4 personas:"
//                + "\nEl " + (peso[0] * 25) + "% están debajo de su pero ideal."
//                + "\nEl " + (peso[1] * 25) + "% están en su peso ideal."
//                + "\nEl " + (peso[2] * 25) + "% tienen sobrepeso."
//                + "\nEl " + (edad[0] * 25) + "% es mayor de edad."
//                + "\nEl " + (edad[1] * 25) + "% es menor de edad.");
    }
    
}
