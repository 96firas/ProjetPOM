@Paiment
Feature: Paiment produit
  
  
  
Background:
Given acceder a url "https://automationexercise.com/" de la page
    When cilquer sur sgn/log
    And saisir lemail adress "mohammed--llmmmmohammmed@gmail.com"
    And saisire le mot de passe "Test1234!"
    And cliquer sur la boutton login
    And verifier le nom "Mohammed"
    And cliquer sur bt produit
    And passer la souris sur produit1 et cliquer sur Add to cart
    And Cliquer sur boutton Continue Shopping
    And passer la souris sur produit2 et cliquer sur Add to cart
    And cliquer sur le booutton view cart 
    And verifier l ajout de deux produit "Blue Top" et "Men Tshirt"
    And verifier le prix "Rs.500" "Rs.400" , quantité "1" "1"
    And le prix total "Rs.500" "Rs.400"
    And Cliquer sur bt prceed to checkout
    And entrer la description "hjsvjhsd" et click sur bt Place Order



  @PaimentProduit
  Scenario: PaimentProduit
    And Entree Name Cart "Mohammed"
    And Entree Cart Number "123658458"
    And Entree CVC et la date d Expiration "311" le mois "12" et annee "2024"
    And cliquer sur bt Pay and Confirm Order
    Then verif le message "ORDER PLACED !"
    
  