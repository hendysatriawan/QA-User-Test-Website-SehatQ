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

println(GlobalVariable.g_nama)

println(GlobalVariable.g_email)

Mobile.comment('Story: Login dengan User yang sudah terdaftar')

WebUI.comment('Buka browser & go to url')

WebUI.delay(3)

WebUI.openBrowser(GlobalVariable.g_siteurl)

WebUI.maximizeWindow()

WebUI.comment('cek berhasil open browser')

WebUI.waitForElementVisible(findTestObject('Homepage/Home - Logo SehatQ'), GlobalVariable.g_timeout)

WebUI.waitForElementVisible(findTestObject('Homepage/Home - Search'), GlobalVariable.g_timeout)

WebUI.comment('masuk ke halaman login')

WebUI.waitForElementVisible(findTestObject('Homepage/Home - Ke Login'), GlobalVariable.g_timeout)

WebUI.click(findTestObject('Homepage/Home - Ke Login'))

WebUI.waitForElementVisible(findTestObject('Page_Login/Button-Continue with email'), GlobalVariable.g_timeout)

WebUI.click(findTestObject('Page_Login/Button-Continue with email'))

WebUI.comment('cek halaman login')

WebUI.waitForElementVisible(findTestObject('Page_Login/button-Continue'), GlobalVariable.g_timeout)

WebUI.waitForElementVisible(findTestObject('Page_Login/text-Login'), GlobalVariable.g_timeout)

WebUI.comment('input email & password lalu klik continue')

WebUI.waitForElementVisible(findTestObject('Page_Login/input-email'), GlobalVariable.g_timeout)

WebUI.setText(findTestObject('Page_Login/input-email'), GlobalVariable.g_email)

WebUI.waitForElementVisible(findTestObject('Page_Login/input-password'), GlobalVariable.g_timeout)

WebUI.setText(findTestObject('Page_Login/input-password'), GlobalVariable.g_password)

WebUI.click(findTestObject('Page_Login/button-Continue'))

WebUI.comment('berhasil login & lengkapi data profile')

if (WebUI.waitForElementVisible(findTestObject('Page_Login/text_Lengkapi Profil'), 10) == true) {
    WebUI.waitForElementVisible(findTestObject('Page_Login/input__dob'), GlobalVariable.g_timeout)

    WebUI.setText(findTestObject('Page_Login/input__dob'), '1998-01-20')

    WebUI.waitForElementVisible(findTestObject('Page_Login/button_Continue lengkapi profile'), 0)

    WebUI.click(findTestObject('Page_Login/button_Continue lengkapi profile'))
}

WebUI.waitForElementVisible(findTestObject('Homepage_after login/text-profile'), GlobalVariable.g_timeout)

WebUI.waitForElementVisible(findTestObject('Homepage_after login/button-edit profile'), GlobalVariable.g_timeout)
