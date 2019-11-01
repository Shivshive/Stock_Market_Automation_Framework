import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.orderByClause_scope as orderByClause_scope
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

WebUI.click(findTestObject('ToMarket/a_Buy'))

WebUI.verifyElementPresent(findTestObject('Buy_Intra_Dialog/div_BuyDialog'), 100)

WebUI.click(findTestObject('Buy_Intra_Dialog/span_Buy'))

WebUI.click(findTestObject('Buy_Intra_Dialog/a_BUY'))

WebUI.click(findTestObject('Buy_Intra_Dialog/span_NSE'))

WebUI.click(findTestObject('Buy_Intra_Dialog/a_NSE'))

if (this.OrderType_Normal_Stoploss.equalsIgnoreCase('N')) {
    WebUI.click(findTestObject('Buy_Intra_Dialog/span_Normal'))

    WebUI.click(findTestObject('Buy_Intra_Dialog/a_Normal'))
} else {
    WebUI.click(findTestObject('Buy_Intra_Dialog/span_Stoploss'))

    WebUI.click(findTestObject('Buy_Intra_Dialog/a_Stoploss'))

    WebUI.setText(findTestObject('Buy_Intra_Dialog/input_Trigger Price_txtTrigPrice'), TriggerPrice)
}

if (this.PriceType_L_SL.equalsIgnoreCase('limit')) {
    WebUI.click(findTestObject('Buy_Intra_Dialog/span_Limit'))

    WebUI.click(findTestObject('SELL_Dialog_Objs/a_LIMIT'))
} else {
    WebUI.click(findTestObject('SELL_Dialog_Objs/span_SL LIMIT'))

    WebUI.click(findTestObject('SELL_Dialog_Objs/a_SL LIMIT'))
}

WebUI.setText(findTestObject('Buy_Intra_Dialog/input_Symbol_txtBSCompSearch'), Symbol)

WebUI.callTestCase(findTestCase('Utility/Prod/click_suggestion'), [('s') : Symbol], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buy_Intra_Dialog/input_Quantity_txtQuantity'), Quantity)

WebUI.setText(findTestObject('Buy_Intra_Dialog/input_Price_txtPrice'), Price)

WebUI.click(findTestObject('Buy_Intra_Dialog/span_AMO DELIVERY'))

WebUI.click(findTestObject('Buy_Intra_Dialog/Page_Trade  Market Watch/a_AMO INTRADAY'))

WebUI.click(findTestObject('Buy_Intra_Dialog/span_Day'))

WebUI.click(findTestObject('Buy_Intra_Dialog/a_DAY'))

WebUI.click(findTestObject('Buy_Intra_Dialog/a_Cancel'))

