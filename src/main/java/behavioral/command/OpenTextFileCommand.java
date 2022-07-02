package behavioral.command;

public class OpenTextFileCommand extends TextFileCommand {
    private TextFile textFile;

    public OpenTextFileCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
