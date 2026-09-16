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

    }

    // Implementación del método mostrarInformacion() de la clase abstracta Persona

    public void mostrarInformacion() {

    }

}
