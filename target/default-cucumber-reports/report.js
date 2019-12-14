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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "kullanici arama kutusuna bilgin yazar",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "arama tusuna basar",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "bilgin ifadesinin gectigi tum sonuclar liste halinde ekranda gorunur",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});