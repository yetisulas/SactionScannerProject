
@sanction
Feature: US01 Kullanici Sanction Scanner  anasayfasina gider

  Scenario: TC01 Kullanici sanction Scanner negatifif login testi

    Given kullanici sanctionScannerUrl anasayfaya gider
    And   Login tusuna basar
    And   Username ve password girer
    Then  Dogru password ve mail olmadan giris yapamadigini dogrular
     And Sayfa kapatılır


  Scenario: TC02 Basliklarin gorunurluk testi

    Given kullanici sanctionScannerUrl anasayfaya gider
    Then  Basliklarin gorunurluk  test eder
    And Sayfa kapatılır

    Scenario: TC03 Developer sayfasina gitme testi

      Given kullanici sanctionScannerUrl anasayfaya gider
      And Developer linkine tiklar
      And Start integration a tiklar
      Then Developer sayfasinda oldugunu test eder
      And Sayfa kapatılır
