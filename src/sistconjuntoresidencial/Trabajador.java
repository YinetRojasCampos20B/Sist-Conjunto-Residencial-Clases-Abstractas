package sistconjuntoresidencial;

public class Trabajador extends Persona {

    // Atributos propios de la clase hija Trabajador

    private String cargo;
    private boolean permisoIngreso;

    // Constructor que recibe todos los atributos de la clase Trabajador

    public Trabajador(String documento, String nombre, boolean activo, String cargo, boolean permisoIngreso) {
        super(documento, nombre, activo);
        this.cargo = cargo;
        this.permisoIngreso = permisoIngreso;
    }


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
        if (permisoIngreso == true) {
            return true;
        } else {
            return false;
        }
    }

    // Sobreescribiendo el método mostrarInformacion() de la clase Trabajador de la clase abstracta Persona

    @Override

    public void mostrarInformacion() {
        System.out.println("Trabajador, estos son tus datos de ingreso: ");
        super.mostrarInformacion();
        System.out.println("Cargo: "+cargo);
        if (permisoIngreso == true) {
            System.out.println("Cuenta con permiso de ingreso: Si");
        } else {
            System.out.println("Cuenta con permiso de ingreso: No");
        }
    }
}
