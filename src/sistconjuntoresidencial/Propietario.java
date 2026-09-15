/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistconjuntoresidencial;

/**
 *
 * @author uestudiantes
 */
public class Propietario extends Residente {
    
    // Método constructor de la clase hija Propietario
    
    public Propietario (String documento, String nombre, boolean activo, String torre, String apartamento) {
        super(documento, nombre, activo, torre, apartamento);
    } 
    
    // Implementación del método abstracto puedeIngresar() de la clase Persona
    
    public boolean puedeIngresar() {
        System.out.println();
    }
    
    // Métodos auxiliares de la clase Propietario
    
    // Método para validar si tiene permisos de gestión de trámites en administración
    
    public void mostrarInformacion() {

    }
    
    
    
}
