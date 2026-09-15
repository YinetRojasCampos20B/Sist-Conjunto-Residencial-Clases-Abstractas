package sistconjuntoresidencial;

public class Proveedor extends Persona {
    // Atributos propios de la clase concreta Proveedor

    public String empresa;
    public boolean visitaAutorizada;

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
        return true;
    }

    // Implementación del método mostrarInformacion() de la clase Trabajador de la clase abstracta Persona

    public void mostrarInformacion() {

    }

}
