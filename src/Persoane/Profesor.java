package Persoane;

public class Profesor extends Persoana {
    private String grad;
    private int aniExperienta;

    public Profesor(String cnp, String nume, String prenume, int varsta, String grad, int AniExperienta) {
        super(cnp, nume, prenume, varsta);
        this.grad = grad;
        this.aniExperienta = AniExperienta;
    }

    public Profesor() {
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public void setAniExperienta(int AniExperienta) {
        this.aniExperienta = AniExperienta;
    }

    @Override
    public String toString(){
        return "CNP: "+cnp+"\n Nume: "+nume+" "+prenume+"   Varsta: "+varsta+"\n Grad: "+grad+"; Ani de experienta:"+ aniExperienta;
    }
}
