package structural.decorator;

public class BubbleLights extends ChristmasTreeDecorator {
    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with bubble lights";
    }

}
