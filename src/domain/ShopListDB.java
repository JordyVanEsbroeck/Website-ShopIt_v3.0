package domain;
import java.util.ArrayList;


public class ShopListDB{
   private ArrayList<ShopList> lijst;

    public ShopListDB() {
        this.lijst = new ArrayList<>();
        this.NextItem(new ShopList("kaas",2.5,4));
        this.NextItem(new ShopList("tomaten",2,2));
        this.NextItem(new ShopList("sla",1.75,3));
    }
    public void NextItem(ShopList nieuwItem){
        if(nieuwItem == null){
            throw new IllegalArgumentException();
        }
        this.lijst.add(nieuwItem);
    }
    public void verwijder(String naam){
        for (ShopList shopList:lijst){
            if(naam == shopList.getNaam()){
                this.lijst.remove(shopList);
            }
        }

    }
    public double gemiddeldePrijs(){
        double uit = 0;
        if (lijst.size() == 1){
            return lijst.get(0).getPrijs();

        }
        for (ShopList shopList:lijst){
            uit = uit+ shopList.getPrijs();
        }
        double size = lijst.size();
        uit = uit/size;
        return uit;
    }
    public ArrayList<ShopList> getLijst(){
        return this.lijst;
    }
}
