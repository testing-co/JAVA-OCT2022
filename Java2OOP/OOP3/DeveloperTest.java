import java.util.ArrayList;
class DeveloperTest{
    public static void main(String[] args){
        System.out.println("----Starting Developer Test----");
        System.out.println("Dev count: "+ Developer.getDevCount());
        Developer dev1 = new Developer("Pepper" , 2);
        dev1.displayInfo();
        dev1.setSalary(-30);
        dev1.addOneLanguage("Java");
        dev1.addOneLanguage("Meow");

        dev1.displayInfo();

        Developer dev2 = new Developer();
        dev2.displayInfo();
        System.out.println("Dev count: "+ Developer.getDevCount());
        System.out.println("Total Language: "+ Developer.getTotalLanguages());
 
    }
}