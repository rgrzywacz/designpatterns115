package structural.proxy.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.decorator.BubbleLights;
import structural.decorator.ChristmasTree;
import structural.decorator.ChristmasTreeImpl;
import structural.decorator.Garland;

public class DecoratorTest {
    @Test
    public void shouldCreateChristmasTreeWithBubbleLightsAndGarland() {

        ChristmasTree christmasTree = new ChristmasTreeImpl();
        ChristmasTree christmasTreeWithBubbleLights = new Garland(new BubbleLights(christmasTree));
        String decorate = christmasTreeWithBubbleLights.decorate();
        System.out.println(decorate);
        Assertions.assertEquals("Christmas tree with bubble lights with garland", decorate);
    }
}
