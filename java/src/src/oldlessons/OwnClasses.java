package oldlessons;

import java.util.Scanner;

public class OwnClasses {

    private static final CommandAndResult[] COMMAND_AND_RESULT = new CommandAndResult[]{
                new CommandAndResult("/help", ""),
                new CommandAndResult("/start", "Bot started!"),
                new CommandAndResult("/getLocation","location is Moscow"),
                new CommandAndResult("/end", "Bot ended")
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = "commands avaible for this bot \n";
        for (CommandAndResult item : COMMAND_AND_RESULT) {
            commands += item.command + "\n";
        }
        COMMAND_AND_RESULT[0] = new CommandAndResult(COMMAND_AND_RESULT[0].command, commands);
        String input;
        boolean found;
        while(true) {
            input = scanner.nextLine();
            found = false;
            for (int i = 0; i < COMMAND_AND_RESULT.length; i++){
                if(COMMAND_AND_RESULT[i].command.equals(input)){
                    print(COMMAND_AND_RESULT[i].result);
                    found = true;
                    break;
                }
            }
            if(COMMAND_AND_RESULT[COMMAND_AND_RESULT.length-1].command.equals(input)){
                break;
            }
            if(!found){
                print("no commands found for that input. Try typing"+COMMAND_AND_RESULT[0].command);
            }
        }

    }

    private static void print(Object o) {
        System.out.println(o);
    }

}
