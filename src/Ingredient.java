public class Ingredient {

    private double amount;

    private String unit;

    private String name;

    public Ingredient(double amount, String unit, String name){
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }
    public Ingredient(){
    }

    public double getAmount(){
        return amount;
    }

    public String getUnit(){
        return unit;
    }

    public String getName(){
        return name;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }

}

