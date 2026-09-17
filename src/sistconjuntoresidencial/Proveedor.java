package sistconjuntoresidencial;

public class Proveedor extends Persona {
    // Atributos propios de la clase concreta Proveedor

    public String empresa;
    public boolean visitaAutorizada;

    // Constructor de la clase hija Proveedor de la clase abstracta madre Persona

    public Proveedor(String documento, String nombre, boolean activo, String empresa, boolean visitaAutorizada) {
        super(documento, nombre, activo);
        this.empresa = empresa;
        this.visitaAutorizada = visitaAutorizada;
    }


    // Getters y setters de la clase concreta Proveedor

    public String getEmpresa() {
        return empresa;
    }

    public boolean isVisitaAutorizada() {
        return visitaAutorizada;
    }

    public void setVisitaAutorizada(boolean visitaAutorizada) {
        this.visitaAutorizada = visitaAutorizada;
    }

    // Implementación del método puedeIngresar() de la clase Trabajador de la clase abstracta Persona

    public boolean puedeIngresar() {
        if (visitaAutorizada == true) {
            return true;
        } else {
            return false;
        }
    }

    // Sobreescritura del método mostrarInformacion() de la clase Proveedor de la clase abstracta Persona

    @Override
    public void mostrarInformacion() {
        System.out.println("Proveedor, estos son los datos de tu ingreso: ");
        super.mostrarInformacion();
        System.out.println("Empresa: "+empresa);
        if (visitaAutorizada == true) {
            System.out.println("Visita autorizada: Si");
        } else {
            System.out.println("Visita autorizada: No");
        }


    }

}
