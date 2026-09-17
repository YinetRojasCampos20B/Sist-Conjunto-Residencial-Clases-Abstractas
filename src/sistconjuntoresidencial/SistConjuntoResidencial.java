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

        int optIngreso;
        switch (opcion) {

            case 1:
                System.out.println("¡Bienvenido, "+p1.getNombre()+"!");
                p1.mostrarInformacion();
                imprimirMenuIngreso();
                optIngreso = entrada.nextInt();
                gestionarIngreso(p1, optIngreso);
                break;
            case 2:
                System.out.println("¡Bienvenido, "+inq1.getNombre()+"!");
                inq1.mostrarInformacion();
                imprimirMenuIngreso();
                optIngreso = entrada.nextInt();
                gestionarIngreso(inq1, optIngreso);
                break;
            case 3:
                System.out.println("¡Bienvenido, "+prov1.getNombre()+"!");
                prov1.mostrarInformacion();
                imprimirMenuIngreso();
                optIngreso = entrada.nextInt();
                gestionarIngreso(prov1, optIngreso);
                break;
            case 4:
                System.out.println("¡Bienvenido, "+t1.getNombre()+"!");
                t1.mostrarInformacion();
                imprimirMenuIngreso();
                optIngreso = entrada.nextInt();
                gestionarIngreso(t1, optIngreso);
                break;
        }
    }

    // Métodos complementarios de la clase principal

    // Método para imprimir el menú de ingreso

    public static void imprimirMenuIngreso() {
        System.out.println("¿Desea ingresar al conjunto?");
        System.out.println("1) Si");
        System.out.println("2) No");
    }

    // Método para gestionar el ingreso de cada uno de los usuarios al conjunto residencial

    public static void gestionarIngreso(Persona persona, int optIngreso) {
        if (optIngreso == 1) {
            persona.puedeIngresar();
            if (persona.puedeIngresar() == false) {
                System.out.println("¡No puedes ingresar al conjunto, tu usuario se encuentra inactivo!");
                System.out.println("Gracias por probar el programa");
            }
        } else {
            System.out.println("Gracias por probar el programa");
        }
    }
}
