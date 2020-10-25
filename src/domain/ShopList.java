package domain;

public class ShopList {
    private String naam;
    private double prijs;
    private int hoeveelheid;
    public ShopList(String naam, double prijs,int hoeveelheid){
        setHoeveelheid(hoeveelheid);
        setNaam(naam);
        setPrijs(prijs);

    }

    public void setNaam(String naam) {
        if(naam == null || naam.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.naam = naam;
    }

    public void setPrijs(double prijs) {
        if(prijs < 0){
            throw new IllegalArgumentException();
        }
        this.prijs = prijs;
    }

    public void setHoeveelheid(int hoeveelheid) {
        if(hoeveelheid < 0){
            throw new IllegalArgumentException();
        }
        this.hoeveelheid = hoeveelheid;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public int getHoeveelheid() {
        return hoeveelheid;
    }
}
