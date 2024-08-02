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

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public Hamburger(String name, String meat, String breadRollType, double price, String addition1Name, double addition1Price) {
        this(name, meat, breadRollType ,price);
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

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        System.out.println(addition1Name +" "+ addition1Price);
    }
    public void addHamburgerAddition2(String addition2Name,double addition2Price){
        System.out.println(addition2Name +" "+ addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name,double addition3Price){
        System.out.println(addition3Name +" "+ addition3Price);
    }

    public void addHamburgerAddition4(String addition4Name,double addition4Price){
        System.out.println(addition4Name +" "+ addition4Price);
    }
    public double itemizeHamburger(double price){
        System.out.println("Ek malzemeler: "+ addition1Name+" "+addition2Name+" "+addition3Name+" "+addition4Name);
        return price+addition1Price+addition2Price+addition3Price+addition4Price;
    }




}
