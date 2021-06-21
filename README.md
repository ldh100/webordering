This project is used to automate android applications
Project framework is testNG

Project requirements:

IDE: Intellij IDEA: https://www.jetbrains.com/idea/download/#section=mac
Download Community edition(Open source)

Appium: Appium Desktop (V1.18.2)

Java: Java 8 (https://www.oracle.com/java/technologies/javase-jre8-downloads.html)
note: may be required oracle account

Android Studio: https://developer.android.com/studio/?gclid=CjwKCAjwq_D7BRADEiwAVMDdHtCOYVNwb-VBMG0Hx8ET3kU-JYfXK8AvOLZXZMq12y2fFmsV8jcEoRoCKnkQAvD_BwE&gclsrc=aw.ds
download latest version

Create Simulator by using android studio
 Simulator name: 
 
 Pixel 2 API 29 1(Used for Mobile Chrome )
 

 Notes:
 
 1. Project will run by using .xml files under project. i.e. Suppose want to run boost regression just run Boost.xml
 2. If want to run smoke testing in production, run Smoke Boost.xml etc.
 3. If you want to run continuous testing run Boost_CT.xml
 4. If you want to run just specific part of the project run Debug.xml and set "Debug" in BeforeSuite, Test annotations like this: (groups = {"Nourish", "Smoke Nourish", "Nourish_CT","Debug""}) 
 
 Mobile chrome testing: 
 
 Step 1: Check your mobile browser version
 Step 2: Download the same version with this link: https://chromedriver.chromium.org/downloads
 Step 3: Save this chromedriver in you appium desktop, please follow this path: 
         /Applications/Appium.app/Contents/Resources/app/node_modules/appium/node_modules/appium-chromedriver/chromedriver/your downloaded chrome driver
         

Web chrome testing: 
 
 Step 1: Check your Web browser version
 Step 2: Download the same version with this link: https://chromedriver.chromium.org/downloads
 Step 3: Save this chromedriver, please follow this path: 
         /Users/"Your Laptop Account""/webordering/chromedriver
      




