### **Automation Testing - Selenium Using JAVA**
This repository is the complete overview of my automation knowledge.

### **Prerequisite:**
1. [JAVA JDK](https://www.oracle.com/java/technologies/downloads/?er=221886)
2. Install the following IDE :
   - [Spring Tools](https://spring.io/tools)
3. [Apache Maven](https://maven.apache.org/download.cgi)

### **Installation**
1. Java JDK
   - Download the installer from the [Oracle Java SE Downloads](https://www.oracle.com/java/technologies/downloads/?er=221886) page.
   - Run the installer and set up the JDK.
2. IDE
   - Download and Install Spring Tools
3. Apache Maven
   - Download Apache Maven from the [official website](https://maven.apache.org/download.cgi)
   - Follow installation instructions.

### **Setting Up Java JDK**
1. Download the JDK installer from Oracle.
2. Run the installer and select your installation folder.
3. Set up JAVA_HOME and PATH environment variables:
   - Open System Properties.
   - Navigate to Environment Variables.
   - Add JAVA_HOME with the JDK installation path.
   - Update the PATH variable to include %JAVA_HOME%\bin.
5. Verify Java installation by running java --version in a terminal.

### **Setting Up Spring Tools**
1. Download Spring Tools from the [official website](https://spring.io/tools)
2. Run the installer and select the package to install.
3. Choose your installation folder and complete the setup.
4. Launch Spring Tools to start using it.

   
### **Installing Apache Maven**
1. Check if you have Java installed by running java --version.
2. Download Apache Maven from the [official website](https://maven.apache.org/download.cgi) 
3. Extract the archive to your desired location.
4. Set up M2_HOME and MAVEN_HOME environment variables:
   - Create M2_HOME and point it to the Maven installation directory.
   - Update the PATH variable to include %M2_HOME%\bin.
5. Verify Maven installation by running mvn --version in a terminal

### **Installation Steps**
To start using the framework:
1. [Fork](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/tree/main) the repository.
2. Clone, i.e, download your copy of the repository to your local machine using
 ```console 
 https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java.git
```
3. Import the project into your preferred IDE (Eclipse, IntelliJ IDEA, or Spring Tools).
4. Maven Dependencies
 ```console 
   <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
    
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.21.0</version>
</dependency>
   
   
   <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.8.0</version>
</dependency>


<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.10.2</version>
    <scope>test</scope>
</dependency>

  </dependencies>

```

### **Step Wise Details**
### 00 - Launching Browsers
   - 00 - 00 [Run Selenium Tests using Chrome Browser.](https://github.com/Zafrin-Chowdhury-Joya/Automation_Basics_Using_Selenium/blob/main/src/test/java/BrowserHandling/ChromeBrowserInSelenium.java)
   - 00 - 01 [Run Selenium Tests using Firefox Browser.](https://github.com/Zafrin-Chowdhury-Joya/Automation_Basics_Using_Selenium/blob/main/src/test/java/BrowserHandling/FireFoxBrowserInSelenium.java)
   - 00 - 02 [Run Selenium Tests using Edge Browser. ](https://github.com/Zafrin-Chowdhury-Joya/Automation_Basics_Using_Selenium/blob/main/src/test/java/BrowserHandling/EdgeBrowserInSelenium.java)
   - 00 - 03 [Run Selenium Tests using Safari Browser. ](https://github.com/Zafrin-Chowdhury-Joya/Automation_Basics_Using_Selenium/blob/main/src/test/java/BrowserHandling/SafariBrowserInSelenium.java)
   - 00 - 04 [Run Selenium Tests using Cross Browser. ](https://github.com/Zafrin-Chowdhury-Joya/Automation_Basics_Using_Selenium/blob/main/src/test/java/BrowserHandling/CrossBrowserInSelenium.java)
### 01 - TestNG Examples
BeforeSuite - BeforeTest - BeforeClass - BeforeMethod - Test - AfterMethod - AfterClass - AfterTest - AfterSuite
   - 01 - 00 [TestNG ](https://github.com/Zafrin-Chowdhury-Joya/Automation_Basics_Using_Selenium/blob/main/src/test/java/TestNG_Examples/TestNG.java)
### 02 - Interacting with WebElement
  Sendkeys, Clear, Click, Get Attribute, Back, Forward & Refresh
  - 02 - 00 [Interacting WebElements](https://github.com/Zafrin-Chowdhury-Joya/Automation_Basics_Using_Selenium/blob/main/src/test/java/InteractingWithWebElement/WebElementExamples.java)
  - 02 - 01 [Navigation Test](https://github.com/Zafrin-Chowdhury-Joya/Automation_Basics_Using_Selenium/blob/main/src/test/java/WebPages/Navigation.java)
### 03 - Browser Commands
  - 03 - 00 [Get Title](https://github.com/Zafrin-Chowdhury-Joya/Automation_Basics_Using_Selenium/blob/main/src/test/java/BrowserCommands/GetTitle.java)
  - 03 - 01 [Get Current URL](https://github.com/Zafrin-Chowdhury-Joya/Automation_Basics_Using_Selenium/blob/main/src/test/java/BrowserCommands/getCurrentTitle.java)
