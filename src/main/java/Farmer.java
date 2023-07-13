public class Farmer {

    private String name;
    private int collectedEggs;

    public Farmer(String inputName){
        this.name = inputName;
        this.collectedEggs = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getCollectedEggs(){
        return this.collectedEggs;
    }

    public void collectEggs(Farm farm){
//        loop through the chickens on the farm
//        count num of eggs available
//        Add these eggs to the eggsForSale
//        set all chicken eggs to zero
        int totalEggs = 0;
        for (Chicken chicken : farm.getChickens()){
            totalEggs += chicken.getEggs();
            chicken.setEggs(0);
        }
        this.collectedEggs = totalEggs;
    }

    public void assignEggsForSale(Farm farm){
        farm.setEggsForSale(this.collectedEggs -2);
        this.collectedEggs = 2;
    }

}

