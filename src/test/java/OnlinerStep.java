import org.openqa.selenium.WebDriver;

public class OnlinerStep extends OnlinerObject {

    public OnlinerStep(WebDriver driver) {
        super(driver);
    }


    public boolean verifyElectronicSection() {
        findButtonCatolog().click();
        findBurronElectronical().isDisplayed();
        return true;
    }


    public Boolean verifyComputerAndNetSection() {
        findButtonCatolog().click();
        findButtonComputerAndNet().isDisplayed();
        return true;
    }

    public Boolean verifyHouseAppliancesSection() {
        findButtonCatolog().click();
        findButtonHouseholdAppliances().isDisplayed();
        return true;
    }

    public Boolean verifyBuildAndRepairSection() {
        findButtonCatolog().click();
        findButtonBuildAndRepair().isDisplayed();
        return true;
    }

    public Boolean verifyHouseAndGardenSection() {
        findButtonCatolog().click();
        findButtonHouseAndGarden().isDisplayed();
        return true;
    }

    public Boolean verifyAutoANdMotoSection() {
        findButtonCatolog().click();
        findButtonAutoAndMoto().isDisplayed();
        return true;
    }

    public Boolean verifyBeautyAndSportSection() {
        findButtonCatolog().click();
        findButtonBeautyAndSport().isDisplayed();
        return true;
    }

    public Boolean verifyChildAndMamSection() {
        findButtonCatolog().click();
        findButtonChildAndMam().isDisplayed();
        return true;
    }

    public Boolean verifyTvAndVideoSection() {
        findButtonCatolog().click();
        findButtonTvAndVideo().isDisplayed();
        return true;
    }

    public Boolean verifyJobAndOfficeSection() {
        findButtonCatolog().click();
        findButtonJobAndOffice().isDisplayed();
        return true;
    }

    public boolean verifyElementsOfComputerAndNet() {
        findButtonCatolog().click();
        findButtonComputerAndNet().click();
         findListOfComputerAndNet().isDisplayed();
         return true;
            }

    public  boolean verifyKomplectuuschieOfComputerAndNet() {
        findButtonCatolog().click();
        findButtonComputerAndNet().click();
        findComplectuuschie().isDisplayed();
return true;
}

}
