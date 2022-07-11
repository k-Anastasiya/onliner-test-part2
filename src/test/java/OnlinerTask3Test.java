import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class OnlinerTask3Test extends OnlinerSetting{
    @Test
    public void verifyKomplectuuschieOfComputerAndNetTest(){
        OnlinerStep onlinerStep= new OnlinerStep(driver);
        onlinerStep.verifyKomplectuuschieOfComputerAndNet();


}
}