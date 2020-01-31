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
import com.github.javafaker.Faker as Faker

WebUI.comment('Story: Register User Baru')

WebUI.comment('create data dummy (pakai faker)')

WebUI.comment('Buka browser & go to url')

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

WebUI.waitForElementVisible(findTestObject('Page_Login/button-sign up'), GlobalVariable.g_timeout)

WebUI.click(findTestObject('Page_Login/button-sign up'))

WebUI.comment('create data dummy (pakai faker)')

Faker faker = new Faker()

String name = faker.name().firstName()

println(name)

String namadepan = (name + ' ') + 'Test'

String namadepan2 = name + 'Test'

println(namadepan)

GlobalVariable.g_nama = namadepan

println(namadepan2)

String email = namadepan2 + '@yopmail.com'

println(email)

GlobalVariable.g_email = email

WebUI.comment('input nama, email, password & check agreement')

WebUI.waitForElementVisible(findTestObject('Page_Register/text-sign up'), GlobalVariable.g_timeout)

WebUI.waitForElementVisible(findTestObject('Page_Register/input-Nama Lengkap'), GlobalVariable.g_timeout)

WebUI.setText(findTestObject('Page_Register/input-Nama Lengkap'), GlobalVariable.g_nama)

WebUI.waitForElementVisible(findTestObject('Page_Register/input-Email'), GlobalVariable.g_timeout)

WebUI.setText(findTestObject('Page_Register/input-Email'), GlobalVariable.g_email)

WebUI.waitForElementVisible(findTestObject('Page_Register/input-password'), GlobalVariable.g_timeout)

WebUI.setText(findTestObject('Page_Register/input-password'), GlobalVariable.g_password)

WebUI.waitForElementVisible(findTestObject('Page_Register/check-user agreement'), GlobalVariable.g_timeout)

WebUI.check(findTestObject('Page_Register/check-user agreement'))

WebUI.waitForElementVisible(findTestObject('Page_Register/button-Continue'), GlobalVariable.g_timeout)

WebUI.click(findTestObject('Page_Register/button-Continue'))

WebUI.comment('cek berhasil register')

not_run: WebUI.waitForElementVisible(findTestObject('Homepage_after login/span_Pendaftaran berhasil'), GlobalVariable.g_timeout)

WebUI.waitForElementVisible(findTestObject('Homepage_after login/text-profile'), GlobalVariable.g_timeout)

WebUI.waitForElementVisible(findTestObject('Homepage_after login/button-edit profile'), GlobalVariable.g_timeout)

WebUI.closeBrowser()

