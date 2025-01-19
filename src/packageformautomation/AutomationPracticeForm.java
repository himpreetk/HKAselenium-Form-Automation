package packageformautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutomationPracticeForm {
    public static void main(String[] args) {
    	
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\eclipse-workspace\\testerr\\HKAseleniumAutomatingForm\\server\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        try {
            // Open the form URL
            driver.get("https://demoqa.com/automation-practice-form");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Fill in the first name
            WebElement firstName = driver.findElement(By.id("firstName"));
            firstName.sendKeys("John");

            // Fill in the last name
            WebElement lastName = driver.findElement(By.id("lastName"));
            lastName.sendKeys("Doe");

            // Fill in the email
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("johndoe@example.com");

            // Select gender (Male)
            WebElement genderMale = driver.findElement(By.xpath("//label[text()='Male']"));
            genderMale.click();

            // Fill in mobile number
            WebElement mobileNumber = driver.findElement(By.id("userNumber"));
            mobileNumber.sendKeys("1234567890");

            // Enter Date of Birth
            WebElement dobInput = driver.findElement(By.id("dateOfBirthInput"));
            dobInput.click();
            WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
            monthDropdown.sendKeys("May");
            WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
            yearDropdown.sendKeys("1990");
            WebElement day = driver.findElement(By.xpath("//div[text()='15']"));
            day.click();

            // Enter Subject
            WebElement subjectInput = driver.findElement(By.id("subjectsInput"));
            subjectInput.sendKeys("Maths");
            subjectInput.sendKeys("\n");

            // Select hobbies (Sports)
            WebElement hobbySports = driver.findElement(By.xpath("//label[text()='Sports']"));
            hobbySports.click();

            // Upload picture
            WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
            uploadPicture.sendKeys("C:/Users/raman/eclipse-workspace/testerr/HKAseleniumAutomatingForm/image/1.png"); // Replace with the absolute path to your image

            // Fill in current address
            WebElement currentAddress = driver.findElement(By.id("currentAddress"));
            currentAddress.sendKeys("123 Main Street, City, Country");

            // Select state
            WebElement stateDropdown = driver.findElement(By.id("state"));
            Actions actions = new Actions(driver);
            actions.moveToElement(stateDropdown).click().perform();
            WebElement stateOption = driver.findElement(By.xpath("//div[text()='NCR']"));
            stateOption.click();

            // Select city
            WebElement cityDropdown = driver.findElement(By.id("city"));
            actions.moveToElement(cityDropdown).click().perform();
            WebElement cityOption = driver.findElement(By.xpath("//div[text()='Delhi']"));
            cityOption.click();

            // Submit the form
            WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
            submitButton.click();

            // Wait for confirmation
            Thread.sleep(5000);
            System.out.println("Form submitted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}