Feature: Google Arama ozelligi

@bunucalistir
Scenario: Kelime aratip liste yapmasini kontrol etme
Given kullanici google ana sayfaya gider
When kullanici arama kutusuna bilgin yazar
And arama tusuna basar
Then bilgin ifadesinin gectigi tum sonuclar liste halinde ekranda gorunur
