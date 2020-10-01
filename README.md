# serenity-bdd

[Serenity](http://www.thucydides.info/docs/serenity/).

## Setup
* Install [JDK8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
* Install [maven](https://maven.apache.org/download.cgi)
* Setup environment variables
* Clone the repo
* Install dependencies `mvn install`
## Running your tests
- To run a single test, run `mvn verify`

## Test cases
- Test cases is written using cucumber BDD, you can find the test case at `/src/test/resources/features/test.feature`
- For login facebook, I skipped this test because I have no facebook test account
## Notes
* You can view your test results on the `src/target/site/serenity/index.html`
* This test will be run on chrome v85 in MacOS
* In case you want to test on Windows, change value of `drivers.mac.webdriver.chrome.driver` to `src/test/resources/drivers/chromedriver.exe`