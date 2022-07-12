import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest extends OnlinerSetting{


    @Test
    public void verifyTitle(){
        System.out.println(" In Verify Title Test Case");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Onliner"));
    }
    @Test
    public  void verifyElectronicSectionTest(){
     OnlinerStep onlinerStep= new OnlinerStep(driver);
        Assert.assertTrue(onlinerStep.verifyElectronicSection());
    }
    @Test
    public  void verifyComputerAndNetSectionTest(){
        OnlinerStep onlinerStep= new OnlinerStep(driver);
        Assert.assertTrue(onlinerStep.verifyComputerAndNetSection());
    }



    @Test
    public  void verifyHouseAppliancesSectionTest(){
        OnlinerStep onlinerStep= new OnlinerStep(driver);
        Assert.assertTrue(onlinerStep.verifyHouseAppliancesSection());
    }
    @Test
    public  void verifyBuildAndRepairTest(){
        OnlinerStep onlinerStep= new OnlinerStep(driver);
        Assert.assertTrue(onlinerStep.verifyBuildAndRepairSection());
    }
    @Test
    public  void verifyHouseAndGardenSectionTest(){
        OnlinerStep onlinerStep= new OnlinerStep(driver);
        Assert.assertTrue(onlinerStep.verifyHouseAndGardenSection());
    }
    @Test
    public  void verifyAutoANdMotoSectionTest() {
        OnlinerStep onlinerStep= new OnlinerStep(driver);
        Assert.assertTrue(onlinerStep.verifyAutoANdMotoSection());
    }
    @Test
    public  void verifyBeautyAndSportSectionTest() {
        OnlinerStep onlinerStep= new OnlinerStep(driver);
        Assert.assertTrue(onlinerStep.verifyBeautyAndSportSection());
    }
    @Test
    public  void verifyChildAndMamSectionTest() {
        OnlinerStep onlinerStep= new OnlinerStep(driver);
        Assert.assertTrue(onlinerStep.verifyChildAndMamSection());
    }
    @Test
    public  void verifyTvAndVideoSectionTest() {
        OnlinerStep onlinerStep= new OnlinerStep(driver);
        Assert.assertTrue(onlinerStep.verifyTvAndVideoSection());
    }
    @Test
    public  void verifyJobAndOfficeSectionTest() {
        OnlinerStep onlinerStep= new OnlinerStep(driver);
        Assert.assertTrue(onlinerStep.verifyJobAndOfficeSection());
    }


}
