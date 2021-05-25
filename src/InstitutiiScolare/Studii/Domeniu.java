package InstitutiiScolare.Studii;

public class Domeniu {
    protected String numeDomeniu;
    protected int aniStudii;

    public Domeniu(String NumeDomeniu, int AniStudii) {
        this.numeDomeniu = NumeDomeniu;
        this.aniStudii = AniStudii;
    }

    public Domeniu() {

    }

    public String getNumeDomeniu() {
        return numeDomeniu;
    }

    public void setNumeDomeniu(String NumeDomeniu) {
        this.numeDomeniu = NumeDomeniu;
    }

    public int getAniStudii() {
        return aniStudii;
    }

    public void setAniStudii(int AniStudii) {
        this.aniStudii = AniStudii;
    }

    @Override
    public String toString(){
        return "Nume domeniu: "+ numeDomeniu +"\n Numar de ani pentru a completa domeniul: "+ aniStudii;
    }

}
