@Exercicesgn
Feature: compte exercice
En tant que utilisateur , je veux cree un compte exercice

  @Creationn_compte	
  Scenario: creation de compte exercice						
    Given acceder a url "https://automationexercise.com/" de la page
    When cilquer sur sgn/log
    And saisir le nom "Mohammed" et l mail "mohammed--llmmmmohammmed@gmail.com"
    And cliquer sur sgn
    And je selectionne le genre :"Mr"
    And saisir le mot de passe "Test1234!"
    And selectionne la date "22" ,le mois "4" et l annee "1991" de naissance
    And cocher les options
    And saisir first name "akrem" et last name "akrem"
    And saisir le company "test" et saisir l adresse "130 avenue de paris tunis" et selectionner country "India"
     And saisir le stat "tunis" le city " tunis" et zipcode "1003"
     And saisir le phone number "26485769"
     And cliquer sur creat account
     Then verifier que le mssg "ACCOUNT CREATED!"

  