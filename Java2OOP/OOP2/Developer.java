import java.util.ArrayList;

class Developer{
    // 1. member variables : what it does (private)
    private String name;
    private int yearsOfCoding;
    private ArrayList<String> languages;
    private int braincell;
    private double salary;

    // 2. constructor (overloaded constructor & empty argument constructor)
    public Developer(){
        this.name = "Anonymous Developer";
        this.yearsOfCoding = 5;
        this.languages = new ArrayList<String>();
        this.braincell = 30;
    }

    public Developer(String name, int braincell){
        this.name= name;
        this.braincell = braincell;
        this.languages = new ArrayList<String>();
        this.yearsOfCoding = 10;
    }

    // 3. getters & setters 
    // getter: return datatype of variable , no parameters
    // naming: getName , getYearsOfCoding
    public String getName(){
        return this.name;
    }

    // setter : no return, with parameters with same datatype
    public void setName(String name){
        this.name = name;
    }

    public int getYearsOfCoding(){
        return this.yearsOfCoding;
    }
    public void setYearsOfCoding(int yearsOfCoding){
        this.yearsOfCoding = yearsOfCoding;
    }

    public int getBraincell(){
        return this.braincell;
    }
    public void setBraincell(int braincell){
        this.braincell = braincell;
    }


    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }


    public ArrayList<String> getLanguages(){
        return this.languages;
    }
    public void setLanguages(ArrayList<String> languages){
        this.languages = languages;
    }

    // other methods
    public void addOneLanguage(String lang){
        this.languages.add(lang);
        this.salary += 1000;
        this.braincell += 10;
    }


    public void displayInfo(){
        System.out.println("--------" + this.name + "--------");
        System.out.println("Years of coding: "+ this.yearsOfCoding);
        System.out.println("Braincell: "+ this.braincell);
        System.out.println("Salary: "+ this.salary);
        System.out.println("Languages: "+ this.languages);
    }
}