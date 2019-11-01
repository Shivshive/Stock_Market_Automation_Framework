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

WebUI.callTestCase(findTestCase('Logins/Login_utkarsh'), [('userID') : 'U16115', ('password') : 'loveumom8'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility/Prod/ToMarket'), [:], FailureHandling.STOP_ON_FAILURE)

int totalrows = findTestData('Data Files/Orders').getRowNumbers()

println('Total Number of Rows ' + totalrows)

for (int i = 1; i < (totalrows + 1); i++) {
    this.OrderType_Sell_Buy = findTestData('Data Files/Orders').getValue(1, i)

    this.Symbol = findTestData('Data Files/Orders').getValue(2, i)

    this.Quantity = findTestData('Data Files/Orders').getValue(3, i)

    this.Price = findTestData('Data Files/Orders').getValue(4, i)

    this.TriggerPrice = findTestData('Data Files/Orders').getValue(5, i)

    this.OrderType_Normal_Stoploss = findTestData('Data Files/Orders').getValue(6, i)

    this.PriceType_L_SL = findTestData('Data Files/Orders').getValue(7, i)

    println((('Row No ' + i) + ' || order ') + this.OrderType_Sell_Buy)

    if (this.OrderType_Sell_Buy.equalsIgnoreCase('sell')) {
        WebUI.callTestCase(findTestCase('Utility/Prod/Sell_Limit_Intra_Normal_Stoploss'), [('OrderType_Sell_Buy') : OrderType_Sell_Buy
                , ('OrderType_Normal_Stoploss') : OrderType_Normal_Stoploss, ('TriggerPrice') : TriggerPrice, ('Symbol') : Symbol
                , ('Quantity') : Quantity, ('Price') : Price, ('Disc_Qty') : Disc_Qty, ('PriceType_L_SL') : PriceType_L_SL], 
            FailureHandling.STOP_ON_FAILURE)
    } else {
        WebUI.callTestCase(findTestCase('Utility/Prod/Buy_Limit_Intra_Normal_Stoploss'), [('OrderType_Sell_Buy') : OrderType_Sell_Buy
                , ('OrderType_Normal_Stoploss') : OrderType_Normal_Stoploss, ('TriggerPrice') : TriggerPrice, ('Symbol') : Symbol
                , ('Quantity') : Quantity, ('Price') : Price, ('Disc_Qty') : Disc_Qty, ('PriceType_L_SL') : PriceType_L_SL], 
            FailureHandling.STOP_ON_FAILURE)
    }
}

WebUI.closeBrowser()

