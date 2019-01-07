package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

@RunWith(Junit4GitRunner.class)
public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();
        assertEquals(app.greet("world"),"Hello world");
    }

}
