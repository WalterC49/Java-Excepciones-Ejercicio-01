/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_excepciones_01.excepciones;

/**
 *
 * @author Walter
 */
public class PersonaException extends Exception {

    /**
     * Creates a new instance of <code>PersonaExcepcion</code> without detail
     * message.
     */
    public PersonaException() {
    }

    /**
     * Constructs an instance of <code>PersonaExcepcion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PersonaException(String msg) {
        super(msg);
    }
}
