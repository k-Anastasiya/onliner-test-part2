import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnlinerStep extends OnlinerObject {

    public OnlinerStep(WebDriver driver) {
        super(driver);
    }


    public boolean verifyElectronicSection() {
        findButtonCatolog().click();
        findBurronElectronical();
        return true;
    }


    public Boolean verifyComputerAndNetSection() {
        findButtonCatolog().click();
        findButtonComputerAndNet();
        return true;
    }

    public Boolean verifyHouseAppliancesSection() {
        findButtonCatolog().click();
        findButtonHouseholdAppliances();
        return true;
    }

    public Boolean verifyBuildAndRepairSection() {
        findButtonCatolog().click();
        findButtonBuildAndRepair();
        return true;
    }

    public Boolean verifyHouseAndGardenSection() {
        findButtonCatolog().click();
        findButtonHouseAndGarden();
        return true;
    }

    public Boolean verifyAutoANdMotoSection() {
        findButtonCatolog().click();
        findButtonAutoAndMoto();
        return true;
    }

    public Boolean verifyBeautyAndSportSection() {
        findButtonCatolog().click();
        findButtonBeautyAndSport();
        return true;
    }

    public Boolean verifyChildAndMamSection() {
        findButtonCatolog().click();
        findButtonChildAndMam();
        return true;
    }

    public Boolean verifyTvAndVideoSection() {
        findButtonCatolog().click();
        findButtonTvAndVideo();
        return true;
    }

    public Boolean verifyJobAndOfficeSection() {
        findButtonCatolog().click();
        findButtonJobAndOffice();
        return true;
    }

    public boolean verifyElementsOfComputerAndNet() {
        findButtonCatolog().click();
        findButtonComputerAndNet().click();
        findListOfComputerAndNet();
        return true;
    }

    public  boolean verifyKomplectuuschieOfComputerAndNet() {
        findButtonCatolog().click();
        findButtonComputerAndNet().click();
        findComplectuuschie().isDisplayed();
return true;
}

}
