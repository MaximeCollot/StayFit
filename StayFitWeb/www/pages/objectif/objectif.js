angular.module('objectif.controllers', [])

.controller('ObjectifCtrl', function($scope) {



	$scope.shouldShowDelete = false;
	$scope.shouldShowReorder = false;
	$scope.listCanSwipe = true;

	$scope.ListObjectif = [
	{ name: "Sèche Musculaire", description: "Description dre la seche", image: "ressources/seche.jpg", checked: false},
	{ name: "Prise de masse", description: "Description Prise de masse", image: "ressources/prisedemasse.jpg", checked: true},
  
	];


});