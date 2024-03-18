
@sanction
Feature: US01 Kullanici Sanction Scanner  anasayfasina gider

  Scenario: TC01 Kullanici sanction Scanner negatifif login testi

    Given kullanici sanctionScannerUrl anasayfaya gider
    And   Login tusuna basar
    And   Username ve password girer
    Then  Dogru password ve mail olmadan giris yapamadigini dogrular
     And Sayfa kapatılır



