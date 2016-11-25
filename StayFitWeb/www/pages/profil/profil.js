angular.module('profil.controllers', [])

.controller('ProfilCtrl', function($scope) {




	$scope.Profil= { user_firstName: "Chris", 
	user_lastName: "Weakness", 
	user_birthday: "13/01/1995",
	user_size: "193",
	user_creation_date: "25/11/2016",
	user_is_coach: true,
	user_is_dietitian: true};



});