.factory('userService', function($http) {
	var user = [];

	return {
		authenticate: function(user){
			var retour = {};
			return $http.get("https://www.yoursite.com/users").then(function(response){
				return response;
			});
		}
	}
})