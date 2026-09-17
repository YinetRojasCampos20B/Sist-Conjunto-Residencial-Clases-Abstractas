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
    
    // Métodos auxiliares de la clase Propietario

    // Implementación del método abstracto puedeIngresar() de la clase Persona

    public boolean puedeIngresar() {
        if (isActivo() == true) {
            mostrarResultadoAcceso();
            return true;
        } else {
            return false;
        }
    }

    // Sobreescritura del método mostrarInformacion

    @Override
    public void mostrarInformacion() {
        System.out.println("Propietario, estos son los datos de tu ingreso: ");
        super.mostrarInformacion();
        mostrarVivienda();
    }
    
    
}
