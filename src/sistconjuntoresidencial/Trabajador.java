package sistconjuntoresidencial;

public class Trabajador extends Persona {

    // Atributos propios de la clase hija Trabajador

    private String cargo;
    private boolean permisoIngreso;

    // Getters y setters de la clase concreta Trabajador

    // Cargo

    public String getCargo() {
        return cargo;
    }

    // Permiso de ingreso

    public boolean isPermisoIngreso() {
        return permisoIngreso;
    }

    public void setPermisoIngreso(boolean permisoIngreso) {
        this.permisoIngreso = permisoIngreso;
    }

    // Implementación del método puedeIngresar() de la clase Trabajador de la clase abstracta Persona

    public boolean puedeIngresar() {
        return true;
    }

    // Implementación del método mostrarInformacion() de la clase Trabajador de la clase abstracta Persona

    public void mostrarInformacion() {

    }
}
