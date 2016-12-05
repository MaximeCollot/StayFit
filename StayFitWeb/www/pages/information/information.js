angular.module('information.controllers', [])

.controller('InformationCtrl', function($scope) {
	$scope.modif = {firstName:'', lastName:'', mail:''};

	$scope.doProfilModification = function (modif) {
		console.log(modif);
		if (modif.firstName != ''){
			$scope.user.firstName = modif.firstName;
		}
		if (modif.lastName != ''){
			$scope.user.lastName = modif.lastName;
		}
		if (modif.mail != ''){
			$scope.user.mail = modif.mail;
		}
		$scope.modif = {firstName:'', lastName:'', mail:''};
	}


});