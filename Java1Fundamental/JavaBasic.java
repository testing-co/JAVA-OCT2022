// class name MUST BE the same as file name
class JavaBasic{
    public static void main(String[] args){
        // 1. compile java (javac JavaBasic.java   & java JavaBasic)
        System.out.println("Hello Java");

        // 2. variables (int, double, boolean, char, String )
        String projectTitle = "Cafe Java"; // String must be ""
        String language = "Java";
        int totalFiles = 1;
        boolean isDone = false;
        double requiredTime = 0.5;
        char difficulty = 'B'; // char must be ''
        //primitive type : int, double, boolean, char
        // Object type : String, Integer, Double, Boolean
        // Wrapper class: Integer, Double, Boolean
        System.out.println("Title : "+ projectTitle);
        System.out.println("Language : "+ language);
        System.out.println("Total Files : "+ totalFiles);
        System.out.println("isDone : "+ isDone);
        System.out.println("Required Time : "+ requiredTime);
        System.out.println("difficulty : "+ difficulty);
        System.out.println("Max integer:" + Integer.MAX_VALUE);

         // 3. conditionals & ternary
        if(isDone){
            System.out.println("This project is completed");
        }else{
            System.out.println("This project is not completed");
        }

        if(requiredTime < 1){
            System.out.println("This assignment shouldn't take too long to complete");
        }else{
            System.out.println("It may take some time to finish this assignment");
        }

        System.out.println(requiredTime<1? "This assignment shouldn't take too long to complete":
            "It may take some time to finish this assignment" );

         // 4. String (indexOf, format, trim(), .equals )
        System.out.println("Project title length: " + projectTitle.length());
        String projectDetails = projectTitle.concat(" ---- ").concat(language);
        System.out.println("Project Details: " + projectDetails);

        String projectDetails2 = String.format("Project Title : %s | Estimated Time: %.2f hours", projectTitle,requiredTime );
        System.out.println("Project Details: " + projectDetails2);

        String creator1 = "Heidi";
        String creator2 = "Heidi";
        String creator3 = new String("Heidi");
        System.out.println(creator1 == creator2);
        System.out.println(creator1.equals(creator2));
        System.out.println(creator1.equals(creator3));
        
    }
}