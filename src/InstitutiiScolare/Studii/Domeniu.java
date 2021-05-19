package InstitutiiScolare.Studii;

public class Domeniu {
    protected String NumeDomeniu;
    protected int AniStudii;

    public Domeniu(String NumeDomeniu, int AniStudii) {
        this.NumeDomeniu = NumeDomeniu;
        this.AniStudii = AniStudii;
    }

    public Domeniu() {

    }

    public String getNumeDomeniu() {
        return NumeDomeniu;
    }

    public void setNumeDomeniu(String NumeDomeniu) {
        this.NumeDomeniu = NumeDomeniu;
    }

    public int getAniStudii() {
        return AniStudii;
    }

    public void setAniStudii(int AniStudii) {
        this.AniStudii = AniStudii;
    }

    @Override
    public String toString(){
        return "Nume domeniu: "+NumeDomeniu+"\n Numar de ani pentru a completa domeniul: "+AniStudii;
    }

}
