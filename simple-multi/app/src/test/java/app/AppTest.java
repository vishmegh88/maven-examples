package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.walkmod.junit4git.junit4.Junit4GitRunner;

@RunWith(Junit4GitRunner.class)
public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();
        assertEquals(app.greet("world"),"Hello world");
    }


}
