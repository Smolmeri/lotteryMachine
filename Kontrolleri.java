package suomi101;

public class Kontrolleri {       
    // kapseloidut ominaisuudet (V, M)
    private Naytto naytto;
    public Pankkitili malli;
    //private Lottery lotto;
    
    public Kontrolleri() {
        // Nyt kontrollerin (C) konstruktori (eli tämä metodi) 
        // luo muut tarvittavat komponentit ja pyytää sitten 
        // näyttöä esittämään aloitusnäytön.
        
        // luodaan sovelluksen tarvitsemat muut komponentit: M, V.
        naytto = new Naytto();                  
        
        // välitetään näytölle tieto sovelluksen kontrollerista eli
        // tämä komponentti itse (this).
        naytto.rekisteroiOhjain(this); 
        
        // pyydetään näyttöä esittämään aloitusnäyttö
        naytto.aloitusNaytto();
                        
    }  
    // Koko sovelluksen käynnistäminen
    public static void main(String[] args) {
        // luodaan uusi kontrolleri-olio, joka valmistelee nyt sovelluksen
        new Kontrolleri();
        
    }
}
