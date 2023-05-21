**_Author_** : Kader Tarlan
## Huld.com
####  Test Automation Project 

------------
### About Project

This project was developed with Java and Selenium for huld.com login page

-------------

### **********Folder Structure**********
    ├── drivers    # drivers directory which has gecko-drivers and chrome-drivers for Windows, Mac and Linux 
        ├── linux      -> installed from https://chromedriver.chromium.org/ and https://github.com/mozilla/geckodriver/releases
        ├── mac
        ├── win
    ├── src
         ├──  main
             ├──  java
                  ├── com
                      ├──  App.java
    ├── test 
       ├── java
           ├── constants    #constants directory for constants of UI and drivers
           ├── elements     #elements directory for locators
           ├── screens      #screen directory for methods screen base
           ├── tests        #tests directory for test itself
           ├── widgets      #widgets directory for setup of driver and selenium driver builder
              ├── SeleniumDriverBuilder     #it has a build method to manage the running of tests on different operating systems and browsers
              ├── Screen Methods            #it has common methods of framework
              ├── TestBase                  #it has a setup method for driver

    ├── pom.xml


## Installation - Setup

### 1. Open terminal

### 2. Run git init before clone project
> git init
> 
### 3. Clone project from git repository
>git clone https://github.com/kadertrl/huld.com-testAutomation.git

### 4. Go to test Project Directory in Terminal

### 5. Install Apache Maven latest release.
**Go** https://maven.apache.org/download.cgi

**Install** Maven zip file, and unzip it to the folder where we want Maven to live.

Also you can install maven on Mac with these commands:

**Install Brew**  :
>/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

Run **'brew help'** and see if it's working

Homebrew has been installed on you computer. You need to modify your PATH like this:
>export PATH=/usr/local/bin:$PATH

Then install maven with Brew: 
>brew install maven

### 6. Run commands in terminal 
>java -version

>mkdir -p /usr/local/apache-maven/apache-maven-3.8.4

>sudo unzip apache-maven-3.8.4-bin.zip -d /usr/local/apache-maven/apache-maven-3.8.4

### 7. Adding Maven to the Environment Path
**Open bashrc**  :
>vim ~/.bashrc

**Add Maven-specific lines to the file**:
>export M2_HOME=/usr/local/apache-maven/apache-maven-3.8.4
> 
>export M2=$M2_HOME/bin
> 
>export PATH=$M2:$PATH

**Run commands**:

> source ~/.bashrc

> mvn -version

### 8.Go to test Project Directory in Terminal

### 9.Run tests

Run all  test on default browser :
>mvn clean test

Run test with desired browser ( chrome or firefox )  :
> mvn -Dbrowser=firefox test  
> mvn -Dbrowser=chrome test

Run specific test class :
>mvn clean test -Dtest=LoginTests

Run only desired test:
>mvn -Dtest=LoginTests#testLoginButtonsOnLandingScreen test


------------
### 10. Test cases:


	 Given A user navigates to 'hudl.com'
	 And the Hudl.com landing screen is display
	 When A user clicks 'Log in' button
	 Then A user sees all login "<options>"
	 Examples:
	 |  options             |
	 |  LOGINHUDL           |
	 |  LOGINWYSCOUT        |
	 |  LOGIVOLLEYMETRICS   |
	 |  LOGINWIMU           |
	 

	 Given A user navigates to hudl.com'
	 And the Hudl.com landing screen is display
	 When A user navigate Hudl login screen
	 Then A user sees login "<fields>"
	 Examples:
	 |  fields               |
	 |  EMAIL INPUT          |
	 |  PASSWORD INPUT       |
	 |  LOGIN BUTTON         |
	 |  REMEMBER ME CHECKBOX |
	 |  NEED HELP LINK       |
	 |  SIGN UP BUTTON       |


	 Given A user navigates to login screen
	 And the Hudl.com login screen is display
	 When A user clicks 'Log In' button
	 Then A user sees Error message on login screen


	 Given A user navigates to login screen
	 When A user enters an invalid email <email> and password <password>
	 And A user clicks 'Log In' button
	 Then A user should not be successfully logged into the site
	 And A user sees Error message on login screen


	 Given A user navigates to login screen
	 When A user enters an valid email and invalid password
	 And A user clicks 'Log In' button
	 Then A user should not be successfully logged into the site
	 And A user sees Error message on login screen

	
	 Given A user navigates to login screen
	 When A user enters an valid email and password
	 And A user clicks 'Log In' button
	 Then A user should be successfully logged into the huld.com
	

	 Given A user navigates to login screen
	 And A user enters valid email and password
	 When A user clicks Remind me checkbox
	 And A user clicks 'Log In' button
	 And A user clicks 'Log Out' button after logged in
	 Then A user sees entered Email in Login screen to be remembered
	 

	 Given A user navigates to login screen
	 When A user observes Sign up button on login page
	 And A user clicks 'Sign up' button
	 Then A user navigates sign up screen


	 Given A user navigates to login screen
	 When A user observes Need help button on login page
	 And A user clicks 'Need help' button
	 Then A user observes Need help pop-up on login screen
	 

	 Given A user navigates to login screen
	 When A user observes Login with an organization button on login page
	 And A user clicks 'Login with an organization' button
	 Then A user navigates Log into Hudl with your Organization screen


	 Given A user navigates to login screen
	 And A user enters valid email and password
	 When A user clicks 'Log In' button
	 And A user observes home screen
	 And A user clicks 'Log Out' button
	 Then A user should be redirect to landing screen again
	 
	

### Tests path:
    //hudl-test-projects/src/test/java/tests/LoginTests.java

####  Documentaries:
Please check my blog post for more details : https://kadertarlan.wordpress.com/2017/05/19/create-java-test-project-with-maven/

Turkish:  https://kadertarlan.github.io/blog/2017/05/21/maven-ile-java-test-projesi-olusturmak/

