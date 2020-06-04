import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mattermost-master.herokuapp.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place s_703ef5'), 't2ntruong')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'vItX/nZ/LjgkcP+YDueabg==')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - acb Mattermost/button_t2ntruong_style--none sidebar-header_25c4cb'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - acb Mattermost/span_Create a Team'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - acb Mattermost/input_Team Name_teamNameInput'), nameTeam)

WebUI.click(findTestObject('Object Repository/Page_Town Square - acb Mattermost/span_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - t1 Mattermost/input_httpsmattermost-masterherokuappcom_te_7a0a88'), 
    '')

