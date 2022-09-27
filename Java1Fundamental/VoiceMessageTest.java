import java.util.ArrayList;

class VoiceMessageTest{
    public static void main(String[] args){
        System.out.println("Hello World");
        // 6. dependency injection (import other files)
        VoiceMessageUtil answeringMachine = new VoiceMessageUtil();
        System.out.println(answeringMachine.greeting());
        System.out.println(answeringMachine.greeting("Pepper"));
        System.out.println(answeringMachine.greeting(5));
        System.out.println(answeringMachine.greetWithDate());

        //7. type casting
        int days = 7;
        double cost = 10.01;
        // implicit casting : int --> double 
        double doubleDay = days;
        System.out.println(doubleDay);
        double totalCost = cost * days; // works because double * int --> double
        System.out.println(totalCost);

        // double --> int
        int roundUpCost = (int)cost;
        System.out.println(roundUpCost);
        int roundUpTotalCost = (int) cost * days;
        System.out.println(roundUpTotalCost);

        // 8. Fixed Array
        int[] messagesPerDay1 = new int[5]; // messagesPerDay = [ 0,0,0,0,0]
        messagesPerDay1[0] = 5;
        messagesPerDay1[1] = 3;
        messagesPerDay1[2] = 6;
        System.out.println(messagesPerDay1[4]);

        int[] messagesPerDay2 = {3, 2, 4};
        System.out.println(messagesPerDay2[1]);
        System.out.println("Length: " + messagesPerDay2.length);

        String[] messages = {"Please call back!", "Make sure you install JDK", "Help debug please"};

        // 9. Loops 
        // traditional loop with i
        for(int i=0; i< messages.length ; i++){
            System.out.println(messages[i]);
        }

        for(String msg: messages){
            System.out.println(msg);
        }

        System.out.println(answeringMachine.totalMessages(messagesPerDay1));
        answeringMachine.displayMessages(messages);

        // 10. Dynamic Array - ArrayList
        ArrayList<String> messageList = new ArrayList<String>();
        messageList.add("Please ask me any questions. ");
        messageList.add("Feed the cat");
        messageList.add("Reach out for help when you struggled for more than 20 mins");
        System.out.println(messageList);
        messageList.remove(1);
        System.out.println(messageList);
        System.out.println(messageList.get(0));
        System.out.println(messageList.size());
        
        answeringMachine.changeArray(messageList);
        System.out.println(messageList);

        double test = 3;

    }
}