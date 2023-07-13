public class Chicken {

    private String name;
    private int eggs;

//    the below is the constructor
    public Chicken(String inputName, int inputEggs){
        this.name = inputName;
        this.eggs = inputEggs;
    }

//    the below are getters
    public String getName(){
        return this.name;
    }

    public int getEggs(){
        return this.eggs;
    }

//    the below is a setter, it won't return something but it does something

    public void setEggs(int amount){
        this.eggs = amount;
    }

}
