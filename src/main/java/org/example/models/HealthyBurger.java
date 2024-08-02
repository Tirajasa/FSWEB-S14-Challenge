package org.example.models;

public class HealthyBurger extends Hamburger{
   private String healthyExtra1Name;
   private double healthyExtra1Price;
    private String healthyExtra2Name;
   private double healthyExtra2Price;



    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
        super.setMeat("Tofu");
    }

    public HealthyBurger(String name, String meat, double price, String breadRollType, String healthyExtra1Name, double healthyExtra1Price) {
        super(name, "Tofu", price, breadRollType);
        super.setMeat("Tofu");
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public HealthyBurger(String name, String meat, double price, String breadRollType, String healthyExtra1Name, double healthyExtra1Price, String healthyExtra2Name, double healthyExtra2Price) {
        super(name, "Tofu", price, breadRollType);
        super.setMeat("Tofu");
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public void setHealthyExtra1Name(String healthyExtra1Name) {
        this.healthyExtra1Name = healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public void setHealthyExtra1Price(double healthyExtra1Price) {
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public void setHealthyExtra2Name(String healthyExtra2Name) {
        this.healthyExtra2Name = healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public void setHealthyExtra2Price(double healthyExtra2Price) {
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public String getAddition1Name() {
        return super.getAddition1Name();
    }

    @Override
    public String getAddition2Name() {
        return super.getAddition2Name();
    }

    @Override
    public String getAddition3Name() {
        System.out.println("Addition3: "+getAddition3Name());
        return super.getAddition3Name();
    }

    @Override
    public double getAddition1Price() {
        return super.getAddition1Price();
    }

    @Override
    public String getAddition4Name() {
        System.out.println("Addition4: "+super.getAddition4Name());
        return super.getAddition4Name();
    }

    @Override
    public double getAddition2Price() {
        return super.getAddition2Price();
    }

    @Override
    public double getAddition4Price() {
        return super.getAddition4Price();
    }

    @Override
    public double getAddition3Price() {
        return super.getAddition3Price();
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        double total=getPrice()+healthyExtra1Price;
        setPrice(total);
    }
    public void addHealthyAddition2(String healthyExtra1Name,double healthyExtra2Price){
        double total=getPrice()+healthyExtra2Price;
        setPrice(total);
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Price: "+(getPrice()+healthyExtra1Price+healthyExtra2Price+getAddition1Price()+getAddition2Price()+getAddition3Price()+getAddition4Price()));
        return getPrice()+healthyExtra1Price+healthyExtra2Price+getAddition1Price()+getAddition2Price()+getAddition3Price()+getAddition4Price();
    }
}
