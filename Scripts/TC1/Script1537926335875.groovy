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

WebUI.openBrowser('')

WebUI.navigateToUrl("http://demoaut-mimic.kazurayam.com/9748_testbed.html")

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Katalon Discussion 9748/iframe_Capture object_katalon-'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Object Repository/Page_Katalon Discussion 9748/iframe_Capture object_katalon-'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Katalon Discussion 9748/a_Make Appointment'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()
