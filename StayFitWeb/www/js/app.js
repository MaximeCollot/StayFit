// Ionic Starter App

// angular.module is a global place for creating, registering and retrieving Angular modules
// 'starter' is the name of this angular module example (also set in a <body> attribute in index.html)
// the 2nd parameter is an array of 'requires'
// 'starter.controllers' is found in controllers.js
angular.module('starter', ['ionic', 'starter.controllers'])

.run(function($ionicPlatform) {
  $ionicPlatform.ready(function() {
    // Hide the accessory bar by default (remove this to show the accessory bar above the keyboard
    // for form inputs)
    if (window.cordova && window.cordova.plugins.Keyboard) {
      cordova.plugins.Keyboard.hideKeyboardAccessoryBar(true);
      cordova.plugins.Keyboard.disableScroll(true);

    }
    if (window.StatusBar) {
      // org.apache.cordova.statusbar required
      StatusBar.styleDefault();
    }
  });
})

.config(function($stateProvider, $urlRouterProvider,$ionicConfigProvider) {
  $ionicConfigProvider.tabs.position('top');

  $stateProvider

    .state('app', {
    url: '/app',
    abstract: true,
    templateUrl: 'templates/menu.html',
    controller: 'AppCtrl'
  })

  .state('app.welcome', {
    url: '/welcome',
    views: {
      'menuContent': {
        templateUrl: 'templates/welcome.html'
      }
    }
  })

  .state('app.profil', {
    url: '/profil',
    views: {
      'menuContent': {
        templateUrl: 'templates/profil.html'
      }
    }
  })

  .state('app.information', {
    url: '/information',
    views: {
      'menuContent': {
        templateUrl: 'templates/information.html'
      }
    }
  })

  .state('app.objectif', {
      url: '/objectif',
      views: {
        'menuContent': {
          templateUrl: 'templates/objectif.html'
        }
      }
    })

  .state('app.suivi', {
      url: '/suivi',
      views: {
        'menuContent': {
          templateUrl: 'templates/suivi.html'
        }
      }
    })

  .state('app.sport', {
      url: '/sport',
      views: {
        'menuContent': {
          templateUrl: 'templates/sport.html'
        }
      }
    })

  .state('app.nutrition', {
      url: '/nutrition',
      views: {
        'menuContent': {
          templateUrl: 'templates/nutrition.html'
        }
      }
    })
  // if none of the above states are matched, use this as the fallback
  $urlRouterProvider.otherwise('/app/welcome');
});
