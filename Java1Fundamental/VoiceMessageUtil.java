import java.util.*;

class VoiceMessageUtil{
    // 5. methods (overloading methods)
    public String greeting(){
        return "Hi, anonymous!";
    }

    public String greeting(String name){
        return "Hi, "+ name + "!";
    }

    public String greeting(int count){
        return "Hi for " + count + " times";
    }

    public String greetWithDate(){
        return "Hi, today is " + new Date();
    }

    public int totalMessages(int[] numArr){
        int sum =0;
        for(int i=0; i<numArr.length; i++){
            sum += numArr[i];
        }
        return sum;
    }

    public void displayMessages(String[] msgArr){
        for(String msg: msgArr){
            System.out.println(msg);
        }
    }

    public void changeArray(ArrayList<String> msgArr){
        msgArr.add("adding an item in the method");
    }
}