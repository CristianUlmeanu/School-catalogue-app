import java.util.Vector;

public class Profesor extends Persoana{
    private String grad;
    private Vector<String> publicatie;

    public Profesor(String cnp, String nume, String prenume, Integer varsta, String grad, Vector<String> publicatie) {
        super(cnp, nume, prenume, varsta);
        this.grad = grad;
        this.publicatie = publicatie;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public Vector<String> getPublicatie() {
        return publicatie;
    }

    public void setPublicatie(Vector<String> publicatie) {
        this.publicatie = publicatie;
    }
}
