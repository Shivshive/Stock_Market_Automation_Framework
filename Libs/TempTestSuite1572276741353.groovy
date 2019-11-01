import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Users_SELL_INTRA_N_SL/R138586_SELL_INTRA_N_SL')

suiteProperties.put('name', 'R138586_SELL_INTRA_N_SL')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Chandra-Kautilya\\Katalon Studio\\AB_Framework\\Reports\\Users_SELL_INTRA_N_SL\\R138586_SELL_INTRA_N_SL\\20191028_210221\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Users_SELL_INTRA_N_SL/R138586_SELL_INTRA_N_SL', suiteProperties, [new TestCaseBinding('Test Cases/Workflow/Prod/Workflow_SELL_INTRA_N_SL_Rishi', 'Test Cases/Workflow/Prod/Workflow_SELL_INTRA_N_SL_Rishi',  null)])
