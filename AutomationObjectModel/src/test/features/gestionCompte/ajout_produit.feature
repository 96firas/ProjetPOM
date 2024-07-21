
@Ajout
Feature: Title of your feature
  je veux ajouter un produit

  
Background:
 Given acceder a url "https://automationexercise.com/" de la page
    When cilquer sur sgn/log
    And saisir lemail adress "mohammed--llmmmmohammmed@gmail.com"
    And saisire le mot de passe "Test1234!"
    And cliquer sur la boutton login
    Then verifier le nom "Mohammed"

  @AjoutProdouit
  Scenario: ajout produit
    Given cliquer sur bt produit
    And passer la souris sur produit1 et cliquer sur Add to cart
    And Cliquer sur boutton Continue Shopping
    And passer la souris sur produit2 et cliquer sur Add to cart
    And cliquer sur le booutton view cart 
    And verifier l ajout de deux produit "Blue Top" et "Men Tshirt"
    And verifier le prix "Rs.500" "Rs.400" , quantité "1" "1"
    And le prix total "Rs.500" "Rs.400"
    And Cliquer sur bt prceed to checkout
    And entrer la description "hjsvjhsd" et click sur bt Place Order
  

 
