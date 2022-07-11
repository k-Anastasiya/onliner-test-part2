import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerObject {
    WebDriver driver;
    By catologLocator = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[1]/a[2]/span");

    By electronicaLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/ul/li[3]/span[2]/span");
    By tvAndVideoLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/div[4]/div/div[2]/div[1]/div/div[2]/div[1]");
    By televizoryLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/div[4]/div/div[2]/div[1]/div/div[2]/div[2]/div/a[1]");
    By filterProducerlLocator = By.xpath("//*[@id=\"schema-filter\"]/div[5]/div[4]/div[2]/ul");
    By selectLGLocator = By.xpath("//*[@id=\"schema-filter\"]/div[5]/div[4]/div[2]/ul/li[1]/label/span[1]/span");
    By selectSamsungLocator = By.xpath("//*[@id=\"schema-filter\"]/div[5]/div[4]/div[2]/ul/li[2]/label/span[1]/span");
    By computerAndNetLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/ul/li[4]/span[2]/span");
    By householdAppliancesLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/ul/li[5]/span[2]/span");
    By buildAndRepairLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/ul/li[6]/span[2]/span");
    By houseAndGardenLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/ul/li[7]");
    By autoAndMoto = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/ul/li[8]/span[2]/span");
    By beautyAndSportLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/ul/li[9]/span[2]/span");
    By childAndMamLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/ul/li[10]/span[2]/span");
    By jobAndOfficeLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/ul/li[11]/span[2]/span");
By listOfComputerAndNetLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/div[4]");
By complectuuschieLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/div[4]/div/div[3]/div[1]/div/div[2]/div[1]");

    public OnlinerObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findButtonBuildAndRepair() {
        WebElement buttonBuildAndRepair = driver.findElement(buildAndRepairLocator);
        return buttonBuildAndRepair;
    }
    public WebElement findComplectuuschie() {
        WebElement buttoncomplectuuschie = driver.findElement(buildAndRepairLocator);
        return buttoncomplectuuschie;
    }
    public WebElement findListOfComputerAndNet() {
        WebElement listComputerAndNet = driver.findElement(listOfComputerAndNetLocator);
        return listComputerAndNet;
    }

    public WebElement findButtonHouseAndGarden() {
        WebElement buttonHouseAndGarden = driver.findElement(houseAndGardenLocator);
        return buttonHouseAndGarden;
    }
    public WebElement findButtonJobAndOffice() {
        WebElement buttonJobAndOffice = driver.findElement(jobAndOfficeLocator);
        return buttonJobAndOffice;
    }

    public WebElement findButtonAutoAndMoto() {
        WebElement buttonAutoAndMoto = driver.findElement(autoAndMoto);
        return buttonAutoAndMoto;
    }

    public WebElement findButtonBeautyAndSport() {
        WebElement buttonBeautyAndSport = driver.findElement(beautyAndSportLocator);
        return buttonBeautyAndSport;
    }


    public WebElement findButtonChildAndMam() {
        WebElement buttonChildAndMam = driver.findElement(childAndMamLocator);
        return buttonChildAndMam;
    }


    public WebElement findButtonHouseholdAppliances() {
        WebElement buttonHouseholdAppliances = driver.findElement(householdAppliancesLocator);
        return buttonHouseholdAppliances;
    }

    public WebElement findButtonComputerAndNet() {
        WebElement buttonComputerAndNet = driver.findElement(computerAndNetLocator);
        return buttonComputerAndNet;

    }

    public WebElement findButtonTvAndVideo() {
        WebElement buttonTvAndVideo = driver.findElement(tvAndVideoLocator);
        return buttonTvAndVideo;

    }

    public WebElement findButtonCatolog() {
        WebElement buttonCatolog = driver.findElement(catologLocator);
        return buttonCatolog;

    }

    public WebElement findBurronElectronical() {
        WebElement buttonElectronic = driver.findElement(electronicaLocator);
        return buttonElectronic;
    }

    public WebElement findButtonTelevision() {
        WebElement buttonTelevision = driver.findElement(televizoryLocator);
        return buttonTelevision;
    }

    public WebElement findFilterProducer() {
        WebElement filterProducer = driver.findElement(filterProducerlLocator);
        return filterProducer;
    }

    public WebElement findSelectLGLocator() {
        WebElement selectLG = driver.findElement(selectLGLocator);
        return selectLG;

    }

    public WebElement findSelectSamsungLocator() {
        WebElement selectSamsung = driver.findElement(selectSamsungLocator);
        return selectSamsung;
    }
}