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
import myPack.AddKeyword as AddKeyword

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://trade.angelbroking.com/')

WebUI.setText(findTestObject('login/Email ID_txtUserID'), userID)

WebUI.setText(findTestObject('login/txtTradingPassword'), password)

WebUI.click(findTestObject('login/login_Proceed'))

//WebUI.verifyElementPresent(findTestObject('login/Home_ID'), 100)

String xpath_ = '//a[contains(text(),\'' + this.userID+ '\')]';

uid = AddKeyword.createTestObject('user_identification', xpath_)

println(xpath_)

WebUI.verifyElementPresent(uid, 30)

