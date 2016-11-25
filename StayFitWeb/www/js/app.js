// Ionic Starter App

// angular.module is a global place for creating, registering and retrieving Angular modules
// 'starter' is the name of this angular module example (also set in a <body> attribute in index.html)
// the 2nd parameter is an array of 'requires'
// 'starter.controllers' is found in controllers.js

angular.module('starter', ['ionic', 'menu.controllers','objectif.controllers', 'ngMessages'])
.run(function($ionicPlatform,$rootScope) {
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

  $rootScope.user = {mail:'', password:'', obectif:'', isConnected:false};
})

.config(function($stateProvider, $urlRouterProvider,$ionicConfigProvider) {
  $ionicConfigProvider.tabs.position('top');

  $stateProvider

    .state('app', {
    url: '/app',
    abstract: true,
    templateUrl: 'pages/menu/menu.html',
    controller: 'AppCtrl'
  })

  .state('app.welcome', {
    url: '/welcome',
    views: {
      'menuContent': {
        templateUrl: 'pages/welcome/welcome.html'
      }
    }
  })

  .state('app.profil', {
    url: '/profil',
    controller: 'ProfilCtrl',
    views: {
      'menuContent': {
        templateUrl: 'pages/profil/profil.html'
      }
    }
  })

  .state('app.information', {
    url: '/information',
    views: {
      'menuContent': {
        templateUrl: 'pages/information/information.html'
      }
    }
  })

  .state('app.objectif', {
      url: '/objectif',
      controller: 'ObjectifCtrl',
      views: {
        'menuContent': {
          templateUrl: 'pages/objectif/objectif.html'
        }
      }
    })

  .state('app.suivi', {
      url: '/suivi',
      views: {
        'menuContent': {
          templateUrl: 'pages/suivi/suivi.html'
        }
      }
    })

  .state('app.sport', {
      url: '/sport',
      views: {
        'menuContent': {
          templateUrl: 'pages/sport/sport.html'
        }
      }
    })

  .state('app.nutrition', {
      url: '/nutrition',
      views: {
        'menuContent': {
          templateUrl: 'pages/nutrition/nutrition.html'
        }
      }
    })

  .state('app.contact', {
      url: '/contact',
      views: {
        'menuContent': {
          templateUrl: 'pages/contact.html'
        }
      }
    })

  .state('app.about', {
      url: '/about',
      views: {
        'menuContent': {
          templateUrl: 'pages/about.html'
        }
      }
    })
  // if none of the above states are matched, use this as the fallback
  $urlRouterProvider.otherwise('/app/welcome');
});
