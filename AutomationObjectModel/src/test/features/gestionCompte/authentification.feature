
@authen
Feature: Login ex
 En tant que client , je veux login au compte

  @authentification
  Scenario: Login compte
    Given acceder a url "https://automationexercise.com/" de la page
    When cilquer sur sgn/log
    And saisir lemail adress "mohammed--llmmmmohammmed@gmail.com"
    And saisire le mot de passe "Test1234!"
    And cliquer sur la boutton login
    Then verifier le nom "Mohammed"
   
 
