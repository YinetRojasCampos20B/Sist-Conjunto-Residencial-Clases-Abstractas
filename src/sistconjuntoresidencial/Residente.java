/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistconjuntoresidencial;

/**
 *
 * @author uestudiantes
 * 
 * CLASE HIJA ABSTRACTA RESIDENTE
 * DE LA CLASE PERSONA
 * 
 * 
 */
public abstract class Residente extends Persona {
    
    // Atributos de la clase hija Residente, de la clase abstracta Persona
    
    private String torre;
    private String apartamento;
    
    // Método constructor para la clase hija Residente, de la clase abstracta Persona
    
    public Residente(String documento, String nombre, boolean activo, String torre, String apartamento) {
        super(documento, nombre, activo);
        this.torre = torre;
        this.apartamento = apartamento;
    }
    
    // Método para mostrar la vivienda del residente
    
    public void mostrarVivienda() {
        System.out.println("Tu vivienda es: ");
        System.out.println("Torre: "+torre);
        System.out.println("Apartamento: "+apartamento);
    }
    
    
    // Getters para la clase hija Residente, de la clase abstracta Persona
    
    // Torre

    public String getTorre() {
        return torre;
    }
    
    // Apartamento

    public String getApartamento() {
        return apartamento;
    }
    
   }

