package ohtu;

public class Sovelluslogiikka {

    private int tulos;
    private int tulosMuistiin;

    public void plus(int luku) {
        this.tulosMuistiin = tulos;
        tulos += luku;
    }

    public void miinus(int luku) {
        this.tulosMuistiin = tulos;
        tulos -= luku;
    }

    public void nollaa() {
        this.tulosMuistiin = tulos;
        tulos = 0;
    }

    public int tulos() {
        return tulos;
    }

    public void undo() {
        tulos = this.tulosMuistiin;
    }
}
