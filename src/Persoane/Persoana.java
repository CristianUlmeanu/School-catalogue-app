package Persoane;

public class Persoana {

    protected String cnp;
    protected String nume;
    protected String prenume;
    protected int varsta;
    public Persoana(String cnp, String nume, String prenume, int varsta) {
        this.cnp = cnp;
        this.nume= nume;
        this.prenume=prenume;
        this.varsta=varsta;
    }

    public Persoana() {

    }

    public String getCnp() {
        return cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString(){
        return "CNP: "+cnp+"\n Nume: "+nume+" "+prenume+"   Varsta: "+varsta;
    }
}
