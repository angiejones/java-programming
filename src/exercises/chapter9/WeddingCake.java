package exercises.chapter9;

public class WeddingCake extends Cake{

    private int tiers;

    public WeddingCake(){
        super("almond");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
