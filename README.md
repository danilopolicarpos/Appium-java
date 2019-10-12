#QA Mobile

Project Appium maven with cucumber for Android and iOS

## Requirements

* Java 8
* Appium 1.8.1
* Maven
* Android and Ios Simulators or Devices

## Running Tests

1. Start appium server: `$ appium` 
	
2. Run implemented android tests: `$ mvn clean test -Dcucumber.options="--tags @here_tags_for_Android" -Denv.PLATAFORM=ANDROID_OREO`

3. Run implemented ios tests: `$ mvn clean test -Dcucumber.options="--tags @here_tags_for_IOS" -Denv.PLATAFORM=IPHONE_8`

4. Generate reports: `mvn allure:serve`

## IMPORTANT

* Before run the tests you need to start android device or emulator and appium server.


## Documentation

* **[Appium Docs](http://appium.io/)**
* **[Selenium Docs](https://www.seleniumhq.org/docs/)**
* **[Allure reports](https://github.com/allure-framework/allure-maven)**









