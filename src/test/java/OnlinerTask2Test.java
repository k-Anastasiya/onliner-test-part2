import org.junit.Assert;
import org.junit.Test;

public class OnlinerTask2Test extends OnlinerSetting {
    @Test
    public void verifyElementsOfComputerAndNetTest(){
        OnlinerStep onlinerStep=new OnlinerStep(driver);
        Assert.assertTrue(onlinerStep.verifyElementsOfComputerAndNet());
    }
}
