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

WebUI.comment('Story: Edit Profile akun yang login sebelumnya')

WebUI.comment('run test case login sebelumnya jika belum login, run test case login sebelumnya')

//WebUI.openBrowser(GlobalVariable.g_siteurl)

if (WebUI.waitForElementVisible(findTestObject('Homepage_after login/text-profile'), 5) == false) {
    WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Homepage_after login/text-profile'), GlobalVariable.g_timeout)

    WebUI.waitForElementVisible(findTestObject('Homepage_after login/button-edit profile'), GlobalVariable.g_timeout)
}

WebUI.click(findTestObject('Homepage_after login/button-edit profile'))

WebUI.comment('cek halaman update profile')

WebUI.waitForElementVisible(findTestObject('Pge_edit profile/text-edit profile'), GlobalVariable.g_timeout)

not_run: WebUI.comment('untuk upload foto')

not_run: WebUI.waitForElementVisible(findTestObject('Pge_edit profile/image-upload foto'), GlobalVariable.g_timeout)

//WebUI.click(findTestObject('Pge_edit profile/image-upload foto'))
not_run: CustomKeywords.'newKeyword.UploadFileLocal.uploadFile'(findTestObject('Pge_edit profile/image-upload foto'), '/Users/hendy.satriawan_gue/desktop/foto_profile.jpg')

not_run: WebUI.uploadFile(findTestObject('Pge_edit profile/image-upload foto'), '/Users/hendy.satriawan_gue/desktop/foto_profile.jpg')

WebUI.comment('input tinggi, berat, alamat dan no telp')

WebUI.scrollToElement(findTestObject('Pge_edit profile/input_Tinggi Badan'), GlobalVariable.g_timeout)

WebUI.setText(findTestObject('Pge_edit profile/input_Tinggi Badan'), tinggi_badan)

WebUI.setText(findTestObject('Pge_edit profile/input_Berat Badan'), berat_badan)

WebUI.scrollToElement(findTestObject('Pge_edit profile/input__alamat'), GlobalVariable.g_timeout)

WebUI.setText(findTestObject('Pge_edit profile/input__alamat'), alamat)

WebUI.scrollToElement(findTestObject('Pge_edit profile/input__phone'), GlobalVariable.g_timeout)

WebUI.setText(findTestObject('Pge_edit profile/input__phone'), no_telp)

WebUI.waitForElementVisible(findTestObject('Pge_edit profile/button_Simpan'), GlobalVariable.g_timeout)

WebUI.click(findTestObject('Pge_edit profile/button_Simpan'))

