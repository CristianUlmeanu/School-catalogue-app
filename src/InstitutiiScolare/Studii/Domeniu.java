package InstitutiiScolare.Studii;

public class Domeniu {
    protected String nume_domeniu;
    protected int ani_studii;

    public Domeniu(String nume_domeniu, int ani_studii) {
        this.nume_domeniu = nume_domeniu;
        this.ani_studii = ani_studii;
    }

    public Domeniu() {

    }

    public String getNume_domeniu() {
        return nume_domeniu;
    }

    public void setNume_domeniu(String nume_domeniu) {
        this.nume_domeniu = nume_domeniu;
    }

    public int getAni_studii() {
        return ani_studii;
    }

    public void setAni_studii(int ani_studii) {
        this.ani_studii = ani_studii;
    }

    @Override
    public String toString(){
        return "Nume domeniu: "+nume_domeniu+"\n Numar de ani pentru a completa domeniul: "+ani_studii;
    }

}
