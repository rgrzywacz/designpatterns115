package behavioral.command;

public class SaveTextFileCommand extends TextFileCommand {

    private TextFile textFile;

    public SaveTextFileCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
