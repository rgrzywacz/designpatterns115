package behavioral.command;

public class TextFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open() {
        return "Opening file";
    }

    public String save() {
        return "Saving file";
    }
}
