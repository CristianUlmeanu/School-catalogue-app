package Persoane;

public class Profesor extends Persoana {
    private String grad;
    private int ani_experienta;

    public Profesor(String cnp, String nume, String prenume, int varsta, String grad, int ani_experienta) {
        super(cnp, nume, prenume, varsta);
        this.grad = grad;
        this.ani_experienta = ani_experienta;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public int getAni_experienta() {
        return ani_experienta;
    }

    public void setAni_experienta(int ani_experienta) {
        this.ani_experienta = ani_experienta;
    }

    @Override
    public String toString(){
        return "CNP: "+cnp+"\n Nume: "+nume+" "+prenume+"   Varsta: "+varsta+"\n Grad: "+grad+"; Ani de experienta:"+ani_experienta;
    }
}
