package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author susisusi
 */
public class Summa implements Komento {

    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        int arvo = 0;

        try {
            arvo = Integer.parseInt(this.syotekentta.getText());
        } catch (Exception e) {
        }

        this.sovellus.plus(arvo);
        syotaTulos();
    }

    private void syotaTulos() {
        this.syotekentta.setText("");
        this.tuloskentta.setText("" + this.sovellus.tulos());
    }

    @Override
    public void peru() {
        this.sovellus.undo();
        syotaTulos();
    }

}
