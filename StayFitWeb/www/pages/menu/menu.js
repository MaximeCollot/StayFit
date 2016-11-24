angular.module('starter.controllers', [])

.controller('AppCtrl', function($scope, $ionicModal, $timeout, $state,$location) {

  // Form data for the login modal
  $scope.user = {mail:'', password:'', isConnected:false};

  // Triggered in the login modal to close it
  $scope.closeModal = function() {
    $scope.modal.remove();
  };

  $scope.goToSuivi = function() {

    $state.go('app.suivi');
  };

  $scope.goToSport = function() {

    $state.go('app.sport');
  };

  $scope.goToNutrition = function() {

    $state.go('app.nutrition');
  };

  // Open the login modal
  $scope.login = function() {
    $ionicModal.fromTemplateUrl('templates/login.html', {
    scope: $scope
    }).then(function(modal) {
      if ($scope.modal != null) $scope.modal.close();
      $scope.modal = modal;
      $scope.modal.show();
    });
  };

  // Perform the login action when the user submits the login form
  $scope.doLogin = function() {

      //userService.authenticate($scope.user);


    $scope.user.isConnected=true;
    console.log('Doing login', $scope.user);

    // Simulate a login delay. Remove this and replace with your login
    // code if using a login system
    $timeout(function() {
      $scope.closeModal();
    }, 1000);
  };

  $scope.subscribe = function() {
    if ($scope.modal != null) {
      $scope.modal.remove();
    }
    $ionicModal.fromTemplateUrl('templates/subscribe.html', {
    scope: $scope
    }).then(function(modal) {
      $scope.modal = modal;
      $scope.modal.show();
    });
  };

  $scope.doSubscribe = function(newUser) {
    if (newUser.password != newUser.confirmPassword) {



    }
    $scope.user.mail=newUser.mail;
    $scope.user.isConnected=true;
    console.log('Doing subscribe', $scope.user);

    // Simulate a login delay. Remove this and replace with your login
    // code if using a login system
    $timeout(function() {
      $scope.closeModal();
    }, 1000);
  };

  $scope.$on('$destroy', function() {
    $scope.modal.remove();
  })
})