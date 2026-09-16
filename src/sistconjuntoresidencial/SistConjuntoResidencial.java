/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistconjuntoresidencial;

/**
 *
 * @author uestudiantes
 */
public class SistConjuntoResidencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Instanciación de objetos de la clase Propietario

        Propietario p1 = new Propietario("1239237093", "Maria Carla Boscono", false, "T13", "A201");

        // Instanciación de objetos de la clase concreta Inquilino

        Inquilino inq1 = new Inquilino("1101234567", "Emma Mary Tiglao Francisco", true, "T19", "A504", true);

        // Instanciación de objetos de la clase real Proveedor

        Proveedor prov1 = new Proveedor("1234567890", "Paulina Vega Dieppa", true, "Motordynamons Colombia S.A.S", true);

        // Instanciación de objetos de la clase real Trabajador

        Trabajador t1 = new Trabajador("123579887", "Lindsey Deanne Lohan", false, "Auxiliar de servicios generales", true);

    }
    
}
