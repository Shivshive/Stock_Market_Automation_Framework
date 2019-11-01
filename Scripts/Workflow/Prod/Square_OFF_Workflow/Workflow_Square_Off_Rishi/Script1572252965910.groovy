import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Logins/Login_Rishi'), [('userID') : 'R138586', ('password') : 'Shiv1234$'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility/Prod/ToOrders'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility/Prod/To_NetPosition'), [:], FailureHandling.STOP_ON_FAILURE)

int totalrows = findTestData('Data Files/Square_off').getRowNumbers()

println('Total Number of Rows Square off ' + totalrows)

for (int i = 1; i < (totalrows + 1); i++) {
    this.SquareOff_L_MKT = findTestData('Data Files/Square_off').getValue(11, i)

    this.SquareOff_Price = findTestData('Data Files/Square_off').getValue(13, i)

    this.SquareOff_Quantity = findTestData('Data Files/Square_off').getValue(12, i)

    this.SquareOff_Status_C = findTestData('Data Files/Square_off').getValue(14, i)

    this.Status_P_C = findTestData('Data Files/Square_off').getValue(10, i)

    this.Symbol = findTestData('Data Files/Square_off').getValue(2, i)

    if (this.SquareOff_Status_C.equalsIgnoreCase('P')) {
		
        WebUI.callTestCase(findTestCase('Utility/Prod/Square_off_tc'), [('current_symbol') : Symbol, ('sqr_ff_price') : SquareOff_Price
                , ('SquareOff_L_MKT') : SquareOff_L_MKT, ('SquareOff_Quantity') : SquareOff_Quantity], FailureHandling.STOP_ON_FAILURE)

        System.out.println('Order Square Executed ' + this.Symbol)
    }
}

WebUI.closeBrowser()

