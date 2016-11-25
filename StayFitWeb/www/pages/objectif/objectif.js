angular.module('objectif.controllers', [])

.controller('ObjectifCtrl', function($scope) {

	$scope.init = function () {
		$scope.ListObjectif = [
		{ name: "Sèche Musculaire", description: "Description dre la seche", image: "ressources/seche.jpg", checked: false},
		{ name: "Prise de masse", description: "Description Prise de masse", image: "ressources/prisedemasse.jpg", checked: false},
	  
		];

		function isCheck (item, index) {
			if (item.name == $scope.user.objectif) {
				console.log(item);
				$scope.ListObjectif[index].checked = true;
				item.checked = true;
			}
		}

		$scope.ListObjectif.forEach(isCheck);
	}

	$scope.init();

	console.log($scope.ListObjectif);
	console.log($scope.user);


	$scope.shouldShowDelete = false;
	$scope.shouldShowReorder = false;
	$scope.listCanSwipe = true;

	


});