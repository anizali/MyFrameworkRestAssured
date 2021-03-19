This Project is to automate Weather API using RestAssured


## Project Description:
* Project setup with Pojo and RestAssured
* Written in Java with Junit, Cucumber & Maven


## Setup:
* Install [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html)
* Install Maven [Maven](https://maven.apache.org/)

## Run tests:
* Run MyRunnerTest class
* Run command 'mvn -Dtest=MyRunnerTest test'



## View HTML Report
* HTML report will be generated once execution finish \target\cucumber-html-reports
* Open overview-features.html

#Test Report screenshots




## Maven Integration test logs :

/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/bin/java -Dmaven.multiModuleProjectDirectory=/Users/m_262107/AnizProjects/MyFramework "-Dmaven.home=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3" "-Dclassworlds.conf=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/bin/m2.conf" "-Dmaven.ext.class.path=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven-event-listener.jar" "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=63213:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/boot/plexus-classworlds.license:/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/boot/plexus-classworlds-2.6.0.jar" org.codehaus.classworlds.Launcher -Didea.version=2020.2.4 -Dtest=MyRunnerTest test
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< org.example:MyFramework >-----------------------
[INFO] Building MyFramework 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ MyFramework ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ MyFramework ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ MyFramework ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ MyFramework ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 8 source files to /Users/m_262107/AnizProjects/MyFramework/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ MyFramework ---
[INFO] Surefire report directory: /Users/m_262107/AnizProjects/MyFramework/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.qa.runners.MyRunnerTest

Scenario Outline: As a choosy surfer I want to get the list of dates which satisfy my requirements # src/test/resources/Assignment.feature:12
Initialise
Time Zone - Australia/Sydney
  Given I look up for the weather forecast for next 16 days with postal code "2026"                # com.qa.stepdef.ForeCastStep.theUserSentsGETRequestAndGetTheTimestampAndWeatherValue(java.lang.String)
Temperature satisfied dates **** - [2021-03-19, 2021-03-20, 2021-03-21, 2021-03-22, 2021-03-23, 2021-03-24, 2021-03-25, 2021-03-26, 2021-03-27, 2021-03-28, 2021-03-29, 2021-03-30, 2021-03-31, 2021-04-01, 2021-04-02, 2021-04-03]
  When I check the temperature is between "12" and "30"                                            # com.qa.stepdef.ForeCastStep.iCheckTheTemperatureIsBetweenAnd(java.lang.Float,java.lang.Float)
Wind Speed satisfied dates **** - [2021-03-19, 2021-03-20, 2021-03-21, 2021-03-22, 2021-03-23, 2021-03-25, 2021-03-26, 2021-03-31]
  And I check the wind speed is between "3" and "9"                                                # com.qa.stepdef.ForeCastStep.iCheckTheWindSpeedIsBetweenAnd(java.lang.Float,java.lang.Float)
UV index satisfied dates **** - [2021-03-19, 2021-03-20, 2021-03-21, 2021-03-22, 2021-03-23, 2021-03-25, 2021-03-26, 2021-03-31]
  And I check to see if the UV index is less than or equal to "12"                                 # com.qa.stepdef.ForeCastStep.iCheckToSeeIfTheUVIndexIsLessThanOrEqualTo(java.lang.Float)
Final Dates for the Surfer -  [2021-03-19, 2021-03-20, 2021-03-21, 2021-03-22, 2021-03-23, 2021-03-25, 2021-03-26, 2021-03-31]
  Then List all the dates which satisfy surfer requirement                                         # com.qa.stepdef.ForeCastStep.listAllTheDatesWhichSatisfySurferRequirement()
Quit function
Mar 19, 2021 12:52:56 AM net.masterthought.cucumber.ReportParser parseJsonFiles
INFO: File '/var/folders/jy/bq4hxkmx61z5zyg4d3j7rz8c0000gp/T/cucumber4007860970393215285.json' contains 1 features
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

1 Scenarios (1 passed)
5 Steps (5 passed)
0m3.331s


┌───────────────────────────────────────────────────────────────────────────────────┐
│ Share your Cucumber Report with your team at https://reports.cucumber.io          │
│ Activate publishing with one of the following:                                    │
│                                                                                   │
│ src/test/resources/cucumber.properties:          cucumber.publish.enabled=true    │
│ src/test/resources/junit-platform.properties:    cucumber.publish.enabled=true    │
│ Environment variable:                            CUCUMBER_PUBLISH_ENABLED=true    │
│ JUnit:                                           @CucumberOptions(publish = true) │
│                                                                                   │
│ More information at https://reports.cucumber.io/docs/cucumber-jvm                 │
│                                                                                   │
│ Disable this message with one of the following:                                   │
│                                                                                   │
│ src/test/resources/cucumber.properties:          cucumber.publish.quiet=true      │
│ src/test/resources/junit-platform.properties:    cucumber.publish.quiet=true      │
└───────────────────────────────────────────────────────────────────────────────────┘
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.476 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.992 s
[INFO] Finished at: 2021-03-19T00:52:56+11:00
[INFO] ------------------------------------------------------------------------
