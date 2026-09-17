package sistconjuntoresidencial;

public class Inquilino extends Residente {

    // Atributos propios de la clase Inquilino

    private boolean contratoVigente;

    // Constructor de la clase Cliente

    public Inquilino(String documento, String nombre, boolean activo, String torre, String apartamento, boolean contratoVigente) {
        super(documento, nombre, activo, torre, apartamento);
        this.contratoVigente = contratoVigente;
    }

    // Getters y setter de la clase concreta Inquilino

    public boolean getContratoVigente() {
        return contratoVigente;
    }

    public void setContratoVigente(boolean contratoVigente) {

        this.contratoVigente = contratoVigente;
    }

    // Implementación del método puedeIngresar() en la clase Inquilino de la clase abstracta Persona

    public boolean puedeIngresar() {
        if (contratoVigente == true) {
            return true;
        } else {
            return false;
        }
    }

    // Sobreescritura del método mostrarInformacion() de la clase abstracta Persona

    @Override

    public void mostrarInformacion() {
        System.out.println("Inquilino, estos son los datos de tu ingreso: ");
        super.mostrarInformacion();
        mostrarVivienda();
        if (contratoVigente == true) {
            System.out.println("Estado del contrato: Vigente");
        } else {
            System.out.println("Estado del contrato: Expirado");
        }
    }

}
