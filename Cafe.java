/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements {

    private int nCoffeeOunces;
    private int nSugarPackets; 
    private int nCreams; 
    private int nCups;

    public Cafe(String name, String address, int nfloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nfloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    
    public String toString(){
        return(super.toString());
    }

    /**
     * This wil sell a coffe acording to the customers intrest and remove what they ask for from the amount of recsouces the coffee shop has 
     * @param size is the size of the coffee they want 
     * @param nSugarPackets how many sugar packets they want
     * @param nCreams how much cream they want in their coffee
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && this.nCreams >= nCreams){
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
            System.out.println("Coffee sold. Enjoy your drink");
        } else {
            System.out.println("Low on stock, please give us a moment");
        }
    }

    /**
     * This will restock the stores suplly, if needed to do so  
     * @param nCoffeeOunces restocking how much coffe the cafe has 
     * @param nSugarPackets restocking how many sugar packets they have
     * @param nCreams restocking how many creams they have 
     * @param nCups restocking how many cups they have 
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    public static void main(String[] args) {
        Cafe cc = new Cafe("CC", "somewhere...", 3, 200, 200, 200, 200);
        System.out.println(cc);

        cc.sellCoffee(16, 3, 2);
        cc.sellCoffee(12, 10, 1);
    }
    
}
