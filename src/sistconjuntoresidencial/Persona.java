/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistconjuntoresidencial;

/**
 *
 * @author uestudiantes
 * 
 * CLASE ABSTRACTA PERSONA
 */
public abstract class Persona {
    
    // Atributos de la clase abstracta Persona
    
    private String documento;
    private String nombre;
    private boolean activo;
    
    // Método constructor de la clase abstracta Persona (para ser llamado por super en las clases concretas). NO PUEDE INSTANCIAR OBJETOS DIRECTAMENTE DE ESTA CLASE
    
    public Persona(String documento, String nombre, boolean activo) {
        this.documento = documento;
        this.nombre = nombre;
        this.activo = activo;
    }
    
    // Getters y setters de la superclase abstracta Persona
    
    // Documento

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    // Nombre

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Está activo

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Métodos auxiliares de la clase abstracta Persona


    // Método para mostrar la información de un objeto de clase Persona

    public void mostrarInformacion() {
        System.out.println("Documento: "+documento);
        System.out.println("Nombre: "+nombre);
        if (activo == true) {
            System.out.println("Se encuentra activo en el sistema: Si");
        } else {
            System.out.println("Se encuentra activo en el sistema: No");
        }
    }
    
    // Método para mostrar el resultado del acceso
    
    public void mostrarResultadoAcceso() {
        System.out.println("¡Acceso autorizado!");
    } 


    // Métodos de contrato para implementar en las clases hijas de la clase Persona
    
    
    // Método abstracto para verificar si la persona puede ingresar al conjunto
    
    public abstract boolean puedeIngresar();
    
    

    
}
