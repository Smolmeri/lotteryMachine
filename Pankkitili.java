package suomi101;



public class Pankkitili {   
    // kapseloidut ominaisuudet
    private double saldo;

    // konstruktori, joka vaatii alkusaldon
    public Pankkitili(double saldo) {
        this.saldo = saldo;
    }

    // palauttaa tilin saldon
    public double getSaldo() {
        return saldo;
    }

    public void kolmeOikein() {
        // kolme oikein 10€
        this.saldo += 50;
    }
    
    public void neljaOikein() {
        // kolme oikein 10€
        this.saldo += 150;
    }
    public void viisiOikein() {
        // kolme oikein 10€
        this.saldo += 450;
    }
    public void kuusiOikein() {
        // kolme oikein 10€
        this.saldo += 10000;
    }
    public void seitsemanOikein() {
        // kolme oikein 10€
        this.saldo += 11111111;
    }
    public void vahennys(){
        this.saldo -= 2.5;
    }
    
}