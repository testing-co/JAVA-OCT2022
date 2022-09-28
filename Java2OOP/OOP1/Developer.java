import java.util.ArrayList;

class Developer{
    // 1. member variables : what it does
    public String name;
    public int yearsOfCoding;
    public ArrayList<String> languages = new ArrayList<String>();
    public int braincell;

    // 2. constructor
    



    // other methods
    public void displayInfo(){
        System.out.println("--------" + this.name + "--------");
        System.out.println("Years of coding: "+ this.yearsOfCoding);
        System.out.println("Braincell: "+ this.braincell);
        System.out.println("Languages: "+ this.languages);
    }
}