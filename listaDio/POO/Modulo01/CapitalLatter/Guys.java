package Modulo01.CapitalLatter;

public class Guys {
    private String name;
    private int year;
    private double heigth;

    public Guys(){
    }

    public Guys(String name, int year, double heigth){
        this.name = name;
        this.year = year;
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override 
    public String toString(){
        return "Name: " + name + " | Years: " + year + " | Heigth: " + heigth;
    }
}
