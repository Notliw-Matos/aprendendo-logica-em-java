package Modulo01.NomesListas;

public class People {
    private String name;
    private int year;
    private double heigth;

    public People(){
    }

    public People(String name, int year, double heigth){
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

    @Override 
    public String toString(){
        return "Name: " + name + " | Years: " + year + " | Heigth: " + heigth;
    }
}
