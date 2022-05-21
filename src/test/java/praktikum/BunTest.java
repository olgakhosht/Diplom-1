package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BunTest {

    @Mock
    Bun bun;

    @Before
    public void setUp() throws Exception {
        bun = new Bun("Булочка", 55.0f);
    }

    @Test
    public void checkGetNameBan() {
        Assert.assertEquals("Булочка", bun.getName());
    }

    @Test
    public void checkGetPriceBun() {
        Assert.assertEquals(55.0f, bun.getPrice(), 0.000001d);
    }
}