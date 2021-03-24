public class Persoana {

    protected String cnp;
    protected String nume;
    protected String prenume;
    protected Integer varsta;
    public Persoana(String cnp, String nume, String prenume, Integer varsta) {
        this.cnp = cnp;
        this.nume= nume;
        this.prenume=prenume;
        this.varsta=varsta;
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

    public Integer getVarsta() {
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

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

}
