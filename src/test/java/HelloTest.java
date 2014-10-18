import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void Hello_Test(){
        int i = 1;
        assertEquals(i,1);
    }

    @After
    public void tearDown() throws Exception {

    }
}