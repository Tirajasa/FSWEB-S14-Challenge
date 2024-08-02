package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.1,"Double_Burger" );
        // super.setPrice(19.1);
        this.cips="CURVY";
        this.drink="COKE";

    }

    public String getDrink() {
        return drink;
    }

    public String getCips() {
        return cips;
    }

    public DeluxeBurger(String name, String meat, String breadRollType) {
        super(name, meat, 19.1,breadRollType );
       // super.setPrice(19.1);
        this.cips="CURVY";
        this.drink="COKE";

    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
        specs();
        System.out.println("Price: "+ getPrice());

    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
        specs();
        System.out.println("Price: "+ getPrice());
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
        specs();
        System.out.println("Price: "+ getPrice());
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
        specs();

        System.out.println("Price: "+getPrice() );
        // super.addHamburgerAddition4(addition4Name, addition4Price);
    }

    @Override
    public double itemizeHamburger() {


        return getPrice();
    }


}
