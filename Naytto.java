package suomi101;

import javax.swing.JOptionPane;


public class Naytto {

    // tieto kontrollerista, jolle näyttö lähettää pyynnöt
    private Kontrolleri kontrolleri;

    // metodi luo näytön, joka näytetään aluksi käyttäjälle
    public void aloitusNaytto() {
        String valintaStr;      // käyttäjän valinta merkkijonona
        int valinta;            // valinta numerona

        // näytetään käyttäjälle päävalikko
        valintaStr = JOptionPane.showInputDialog(null,
                "Valitse toiminto (1 tai 2) seuraavista: \n"
                + "1: lopetus \n"
                + "2: lottokone \n"
                + "Mitä haluat tehdä?");

        // muutetaan käyttäjän vastaus numeroksi
        valinta = Integer.parseInt(valintaStr);

        // siirrytään käyttäjän haluamaan toimintoon
        switch (valinta) {
            
            case 1:
                lopetus();
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Tämä on lottokone. Jatka painamalla OK.");
                String[] args = null;
                Lottery.main(args);
                break;

            default:
                // näytetään valikko uudestaan, jos ei kunnollinen valinta
                aloitusNaytto();
        }

    }

    // näytön toimintoja
    public void naytaViesti(String viesti) {
        // Parametrina näytettävä viesti
        JOptionPane.showMessageDialog(null, viesti);
    }
    //LOPETUS
    public void lopetus() {
        System.exit(0);
    }

    public void rekisteroiOhjain(Kontrolleri ohjain) {
        // näyttö saa tiedon kontrollerista, jolle se välittää pyyntöjä
        this.kontrolleri = ohjain;
    }

}
