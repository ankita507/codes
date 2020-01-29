Feature: Register
Scenario: Register on TestMe App
		Given user open TestMeApp
		When user click on signup
		And enter username as "Ankita12345"
		And enter first name as "Ankita"
		And enter last name as "Kumbhar"
		And enter password as "Ankita1234"
		And enter confirm password as "Ankita1234"
		And select gender as "Female"
		And enter email as "ankita@gmail.com"
		And enter mobile number as "1234567891"
		And enter dob as "28/12/1997"
		And enter address as "kolhapur"
		And Select security question as "What is your favour color?"
		And enter answer as "Black"
		Then click on Register

@login	
@data-driven
Scenario: login test
		Given user open TestMeApp
		When user click signin
		And user enter credentials as
		|Ankita12345|
		|Ankita1234|
		
@searchproduct
@data-driven
Scenario: product search
	Given user open TestMeApp
	When user click signin
	And user enter credentials as
		|Ankita12345|
		|Ankita1234|
	And seach product
		|Head|
	And  click on find button
	Then click on add to cart button
		
		
		