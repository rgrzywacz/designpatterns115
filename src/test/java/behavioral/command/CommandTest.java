package behavioral.command;

import behavioral.command.handler.TextFileCommandExecutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommandTest {
    private static final String FILE = "Podanie";

    @Test
    public void shouldExecuteOpenTextFileCommand() {
        TextFile textFile = new TextFile(FILE);
        String expected = "Opening file";
        OpenTextFileCommand openTextFileCommand = new OpenTextFileCommand(textFile);

        String result = TextFileCommandExecutor.execute(openTextFileCommand);
        Assertions.assertEquals(expected, result);
    }

}
