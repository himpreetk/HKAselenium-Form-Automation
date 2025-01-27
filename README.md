# HKAselenium-Form-Automation

A. Automation Practice Form Script

This repository contains a Java-based Selenium WebDriver script to automate the submission of the "Automation Practice Form" available at [DemoQA's website](https://demoqa.com/automation-practice-form). The script simulates filling out a form, interacting with various web elements, and submitting the form.

B. Features

         B.1 Automates the filling of form fields like:
                  - First Name
                  - Last Name
                  - Email
                  - Gender
                  - Mobile Number
                  - Date of Birth
                  - Subjects
                  - Hobbies
                  - Current Address
                  - State and City
          B.2. Uploads an image file.
          B.3. Submits the form.
          B.4. Validates successful form submission.

C. Prerequisites

          C.1. **Java Development Kit (JDK)**: Install JDK 8 or later.
          C.2. **Selenium WebDriver**: Add the Selenium WebDriver library to your project.
          C.3. **ChromeDriver**: Ensure you have ChromeDriver installed and the path set in the script.
          C.4. **Eclipse IDE** (optional): To import and run the project.

D. How to Run

          D.1. Clone the repository or copy the script file to your project.
          D.2. Update the `chromedriver` path in the script to point to your local ChromeDriver installation:
                 ```java
                    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
          D.3. Ensure the uploadPicture path is updated to an existing image file on your system:
                    uploadPicture.sendKeys("path/to/your/image.png");
          D.4. Compile and run the script using your IDE or a terminal.

E. Project Structure

          AutomationPracticeForm/
          ├── src/
          │   └── packageformautomation/
          │       └── AutomationPracticeForm.java
          ├── resources/
          │   └── chromedriver.exe (Add your ChromeDriver executable here)
          │   └── image.png (Add your sample image file here)
          
F. Key Libraries Used

          F.1. Selenium WebDriver: For browser automation.
          F.2. Java: Programming language used.
          F.3. ChromeDriver: To control Google Chrome for testing.
          
G. Code Highlights

          G.1. Explicit waits: Uses WebDriverWait for better reliability.
          G.2. Dynamic element interaction: Includes Actions for handling dropdowns.
          G.3. Exception handling: Ensures the browser closes even if an error occurs.
          
H. Example Output

          When the script is run successfully, the console outputs:
                - Form submitted successfully!
                
I. Known Issues

          I.1. Ensure the ChromeDriver version matches your installed Chrome browser version.
          I.2. Update locators if the structure of the DemoQA form changes.
          
J. Contributing

          Feel free to fork this repository, improve the script, or adapt it to other forms. Contributions are always welcome!
