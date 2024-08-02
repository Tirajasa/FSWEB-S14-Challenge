package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger() {
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public Hamburger(String name, String meat, String breadRollType, double price, String addition1Name, double addition1Price) {
        this(name, meat,price, breadRollType );
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public Hamburger(String name, String meat, String breadRollType, double price, String addition1Name, double addition1Price ,String addition2Name, double addition2Price) {
        this(name, meat, breadRollType ,price,addition1Name,addition1Price);
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public Hamburger(String name, String meat, String breadRollType, double price, String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price) {
        this(name, meat, breadRollType ,price,addition1Name,addition1Price,addition2Name,addition2Price);
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public Hamburger(String name, String meat, String breadRollType, double price, String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price, String addition4Name, double addition4Price) {
        this(name, meat, breadRollType ,price,addition1Name,addition1Price,addition2Name,addition2Price,addition3Name,addition3Price);
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }
    public void setPrice(double price) {
        this.price=price;
    }
    public void specs(){
        System.out.println("Name: "+getName());
        System.out.println("Meat: "+getMeat());
        System.out.println("BreadRollType: "+ getBreadRollType());
    }
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        specs();
        System.out.println("Addition1: "+addition1Name);
        price=price+addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name,double addition2Price){
        System.out.println("Addition2: "+addition2Name);
        price=price+addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name,double addition3Price){
        System.out.println("Addition3: "+addition3Name);
        price=price+addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name,double addition4Price){
        System.out.println("Addition4: "+addition4Name);
        price=price+addition4Price;
    }
    public double itemizeHamburger(){
      //  System.out.println("Ek malzemeler: "+ addition1Name+" "+addition2Name+" "+addition3Name+" "+addition4Name);
        System.out.println("Price: "+( this.price+addition1Price+addition2Price+addition3Price+addition4Price));
        return this.price+addition1Price+addition2Price+addition3Price+addition4Price;
    }




}
