package behavioral.command.handler;

import behavioral.command.TextFileCommand;

public class TextFileCommandExecutor {
    public static String execute(TextFileCommand textFileCommand) {
        return textFileCommand.execute();
    }
}
