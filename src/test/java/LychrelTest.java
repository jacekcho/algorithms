import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LychrelTest {

    private LychrelNumber lychrelNumber;

    @Before
    public void setUp() {
        lychrelNumber = new LychrelNumber();
    }

    @Test
    public void oneIterationToLychrelNumberTest() {
        int iterationToLychrel = lychrelNumber.getIterationNumber(56);
        Assert.assertEquals(1, iterationToLychrel);
    }

    @Test
    public void twoIterationToLychrelNumberTest() {
        int iterationToLychrel = lychrelNumber.getIterationNumber(57);
        Assert.assertEquals(2, iterationToLychrel);
    }

    @Test
    public void threeIterationToLychrelNumberTest() {
        int iterationToLychrel = lychrelNumber.getIterationNumber(59);
        Assert.assertEquals(3, iterationToLychrel);
    }

    @Test
    public void twentyForIterationToLychrelNumberTest() {
        int iterationToLychrel = lychrelNumber.getIterationNumber(89);
        Assert.assertEquals(24, iterationToLychrel);
    }
}
