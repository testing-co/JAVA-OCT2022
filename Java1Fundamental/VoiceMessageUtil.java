import java.util.Date;

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
}