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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com.vn/')

WebUI.setText(findTestObject('Object Repository/Page_Google/textarea_ng nhp_q'), 'lkjasdlfkjalsdkj at 1023.20.:not found lalskjdf.jssssssss:33030923')

WebUI.click(findTestObject('Object Repository/Page_Google/input_Bo co cc gi  khng ph hp_btnK'))

text = WebUI.getText(findTestObject('Object Repository/Page_lkjasdlfkjalsdkj at 1023.20.not found _a372d1/p_Khng tm thy lkjasdlfkjalsdkj at 1023.20.n_6c4b6e'))

WebUI.verifyMatch(text, '.*trong tài liệu.*', true)

