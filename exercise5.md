# Exercise 5

Branch wurde erstellt und gewechselt.

![](resources/images/ex5_1.png)

Aufgabe: Erweitern Sie Ihre main Methode (falls noch nicht existiert) und initialisieren Sie in dieser Klasse ein Logging Objekt. Setzten Sie an einer beliebigen Stelle zwei Log Einträge ab, wobei der Textinhalt irrelevant ist, jedoch das Level Info und Error genutzt werden sollen. 

* Was fällt Ihnen dabei auf?

![](resources/images/ex5_2.png)

Die Meldung mit dem Level Info wird nicht in der Konsole ausgegeben.

* Template

Es existiert ein Template für die Konfiguratonsdatei der log4j2 api. Diese heißt [log4j2.xml.template](/Users/laurabrcina/bsd22_brcina_laura/src/main/resources/log4j2.xml.template)
und beschreibt, dass die logs in der Datei logs/myapp.log gespeichert werden sollen.

Inhalt der log-Datei:

![](resources/images/ex5_3.png)