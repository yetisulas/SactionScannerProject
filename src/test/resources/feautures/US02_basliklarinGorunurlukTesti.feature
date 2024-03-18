
Feature: US02 kullanici basliklari gorebilmeli
  @sanction
  Scenario: TC02 Basliklarin gorunurluk testi

    Given kullanici sanctionScannerUrl anasayfaya gider
    Then  Basliklarin gorunurluk  test eder
    And   Sayfa kapatılır
