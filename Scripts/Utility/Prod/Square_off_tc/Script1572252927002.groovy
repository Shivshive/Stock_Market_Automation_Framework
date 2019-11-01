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

String comp = this.current_symbol.toString().toUpperCase()

String row = ('//*[@id="otherReports_table_tbody"]/tr[td[@class=\'aL\']/span[normalize-space(text())=\'' + comp) + '\']]'

String label = ('//*[@id="otherReports_table_tbody"]/tr[td[@class=\'aL\']/span[normalize-space(text())=\'' + comp) + '\']]/td[2]/span'

String square_off_btn = ('//*[@id="otherReports_table_tbody"]/tr[td[@class=\'aL\']/span[normalize-space(text())=\'' + comp) + 
'\']]/td[10]/a[1]'

TestObject sqr_ff = CustomKeywords.'myPack.AddKeyword.createTestObject'(comp + '_Obj', square_off_btn)

WebUI.verifyElementPresent(sqr_ff, 100)

WebUI.click(sqr_ff)

WebUI.verifyElementPresent(findTestObject('Object Repository/SqureOff/Sqr_ff_dialog'), 100)

WebUI.click(findTestObject('SqureOff/span_MARKET'))

if (this.SquareOff_L_MKT.equalsIgnoreCase('L')) {
    WebUI.click(findTestObject('Object Repository/SqureOff/a_LIMIT'))

    WebUI.setText(findTestObject('Object Repository/SqureOff/input_price_txtPrice_sqroff'), this.sqr_ff_price)
} else {
    if (this.SquareOff_L_MKT.equalsIgnoreCase('MKT')) {
        WebUI.click(findTestObject('Object Repository/SqureOff/a_MARKET'))
    }
}

WebUI.setText(findTestObject('Object Repository/SqureOff/input_Quantity_txtQuantity_sqroff'), this.SquareOff_Quantity)

WebUI.click(findTestObject('SqureOff/a_Cancel'))

