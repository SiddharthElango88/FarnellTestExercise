# FarnellTestExercise
Farnell Test Exercise

# Project Description 
This project is built as a maven project using Cucumber BDD framework with testNG and Selenium Webdriver in Java. Eclipse 2018-12 (4.10.0) is used as IDE. All objects are identified using Page Object Model. Separate repository classes are created for both pages in the journey called "HomePage" and "RegisterPage" respectively. These repositories have all webelements defined and methods to perform actions on the elements.

**Framework:** Cucumber BDD with TestNG
**Language:** Java 
**Automation Tool:** Selenium Webdriver 
**IDE:** Eclipse with cucumber plugin 
**Runtime environment:** JRE 1.8

**Design Description:** All referenced libraries are defined in pom.xml and webdriver exe files are all placed in resources folder. "pages" package holds repository which has all objects definitions and classes for user actions.

"stepsdefinition" package holds "UserRegistration" class where all the steps are defined. And "testrunner" package holds Runner class. Feature files are held in Features folder. Reports are generated in Target folder. cucumber-report-html holds html report and cucumber.json holds json reports which can be used to create Jenkins report.

**Tests Implementation:** There is one feature file FT_001_Farnell_Register_Test.feature which runs 3 scenarios written in gherkins and do the following:

Scenario 1: Test to check remember me checkbox is present and is selected by default

Opens brower and lauches uk.farnell.com
Accepts cookies policy
Clicks on Register
Enters all mandatory details in Register page
Now checks whether remember me checkbox is present and is checked by default

Scenario 2: User enters all details in register page and unchecks the remember me checkbox 
Opens brower and lauches uk.farnell.com
Accepts cookies policy
Clicks on Register
Enters all mandatory details in Register page
Unchecks the remember me check box
Asserts remember me checkbox stays unchecked

Scenario 3: User enters all details, registers and a welcome message is displayed
Opens brower and lauches uk.farnell.com
Accepts cookies policy
Clicks on Register
Enters all mandatory details in Register page
Clicks on Register button
Asserts user is registered(By checking whether my account link is displayed)
Asserts welcome message displayed (Checks text "Hi username" is displayed)

Note: In all scenarios above, browser is parameterised to take values chrome or firefox or internetexplorer.

Any questions, feel free to mail me at siddharthelango@outlook.com 

Thanks, 
Siddharth Elango
