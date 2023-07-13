import java.util.ArrayList;

public class Farm {

    private String name;
    private ArrayList<Chicken> chickens; // this array list starts empty
    private int eggsForSale; // starts at 0

    public Farm(String inputName){
        this.name = inputName;
        this.chickens = new ArrayList<>();
        this.eggsForSale = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getChickenCount(){
        return this.chickens.size();
    }

    public void addChicken(Chicken newChicken){
        this.chickens.add(newChicken);
    }

    public int getEggsForSale(){
        return this.eggsForSale;
    }

    public void setEggsForSale(int amount){
        this.eggsForSale = amount;
    }

    public ArrayList<Chicken> getChickens(){
        return this.chickens;
    }

}
