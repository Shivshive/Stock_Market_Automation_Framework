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

WebUI.click(findTestObject('ToMarket/a_sell'))

WebUI.verifyElementPresent(findTestObject('SELL_Dialog_Objs/Sell_Dialog'), 100)

WebUI.click(findTestObject('SELL_Dialog_Objs/OrderType_Sell'))

WebUI.click(findTestObject('SELL_Dialog_Objs/a_Type_SELL'))

if (this.OrderType_Normal_Stoploss.equalsIgnoreCase('N')) {
    WebUI.click(findTestObject('SELL_Dialog_Objs/span_Normal'))

    WebUI.click(findTestObject('SELL_Dialog_Objs/a_Normal'))
} else {
    WebUI.click(findTestObject('Object Repository/SELL_Dialog_Objs/span_Normal'))

    WebUI.click(findTestObject('Object Repository/SELL_Dialog_Objs/a_Stoploss'))

    WebUI.setText(findTestObject('SELL_Dialog_Objs/input_Trigger Price_txtTrigPrice'), TriggerPrice)
}

if (this.PriceType_L_SL.equalsIgnoreCase('limit')) {
    WebUI.click(findTestObject('SELL_Dialog_Objs/span_LIMIT'))

    WebUI.click(findTestObject('SELL_Dialog_Objs/a_LIMIT'))
} else {
    WebUI.click(findTestObject('SELL_Dialog_Objs/span_SL LIMIT'))

    WebUI.click(findTestObject('SELL_Dialog_Objs/a_SL LIMIT'))
}

WebUI.click(findTestObject('SELL_Dialog_Objs/Market_Type_NSE'))

WebUI.click(findTestObject('SELL_Dialog_Objs/a_Type_NSE'))

WebUI.click(findTestObject('SELL_Dialog_Objs/span_AMO DELIVERY'))

WebUI.click(findTestObject('SELL_Dialog_Objs/a_AMO INTRADAY'))

WebUI.click(findTestObject('SELL_Dialog_Objs/span_Day'))

WebUI.click(findTestObject('SELL_Dialog_Objs/a_DAY'))

WebUI.setText(findTestObject('SELL_Dialog_Objs/input_Symbol_txtBSCompSearch'), Symbol)

WebUI.setText(findTestObject('SELL_Dialog_Objs/input_Quantity_txtQuantity'), Quantity)

WebUI.setText(findTestObject('SELL_Dialog_Objs/input_Price_txtPrice'), Price)

WebUI.setText(findTestObject('SELL_Dialog_Objs/input_Disc Qty_txtDiscQuantity'), Disc_Qty)

WebUI.click(findTestObject('SELL_Dialog_Objs/a_Cancel'))

