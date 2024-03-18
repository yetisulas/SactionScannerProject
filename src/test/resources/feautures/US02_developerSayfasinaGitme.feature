
Feature: US03 Kullanici Developer sayfasina gidebilmeli

  @sanction
  Scenario: TC03 Developer sayfasina gitme testi

    Given kullanici sanctionScannerUrl anasayfaya gider
    And Developer linkine tiklar
    And Start integration a tiklar
    Then Developer sayfasinda oldugunu test eder
    And Sayfa kapatılır
