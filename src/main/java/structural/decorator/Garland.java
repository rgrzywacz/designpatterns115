package structural.decorator;

public class Garland extends ChristmasTreeDecorator {
    public Garland(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return christmasTree.decorate() + " with garland";
    }
}
