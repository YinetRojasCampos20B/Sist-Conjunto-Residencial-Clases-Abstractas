/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistconjuntoresidencial;

import java.util.Scanner;

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

        /*
        * PROGRAMA DE PRUEBA PRINCIPAL
        */

        System.out.println("¡Bienvenidos al sistema de ingreso a conjuntos residenciales!");
        System.out.println("Selecciona tu rol y usuario: ");
        System.out.println("1) Propietario: "+p1.getNombre());
        System.out.println("2) Inquilino: "+inq1.getNombre());
        System.out.println("3) Proveedor: "+prov1.getNombre());
        System.out.println("4) Trabajador: "+t1.getNombre());

        Scanner entrada = new Scanner(System.in);

        int opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("¡Bienvenido, "+p1.getNombre()+"!");
                p1.mostrarInformacion();

                break;
            case 2:
                System.out.println("¡Bienvenido, "+inq1.getNombre()+"!");
                inq1.mostrarInformacion();
                break;
            case 3:
                System.out.println("¡Bienvenido, "+prov1.getNombre()+"!");
                prov1.mostrarInformacion();
                break;
            case 4:
                System.out.println("¡Bienvenido, "+t1.getNombre()+"!");
                t1.mostrarInformacion();
                break;
        }
    }
    
}
