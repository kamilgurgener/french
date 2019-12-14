$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Homepage.feature");
formatter.feature({
  "name": "Google Arama ozelligi",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Kelime aratip liste yapmasini kontrol etme",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@bunucalistir"
    }
  ]
});
formatter.step({
  "name": "kullanici google ana sayfaya gider",
  "keyword": "Given "
});
formatter.match({
  "location": "BilginStepDefinition.kullanici_google_ana_sayfaya_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici arama kutusuna bilgin yazar",
  "keyword": "When "
});
formatter.match({
  "location": "BilginStepDefinition.kullanici_arama_kutusuna_bilgin_yazar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "arama tusuna basar",
  "keyword": "And "
});
formatter.match({
  "location": "BilginStepDefinition.arama_tusuna_basar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "bilgin ifadesinin gectigi tum sonuclar liste halinde ekranda gorunur",
  "keyword": "Then "
});
formatter.match({
  "location": "BilginStepDefinition.bilgin_ifadesinin_gectigi_tum_sonuclar_liste_halinde_ekranda_gorunur()"
});
formatter.result({
  "status": "passed"
});
});