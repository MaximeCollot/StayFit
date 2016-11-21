.factory('userService', function($http) {
	var users = [];

	return {
		getUsers: function(){
			return $http.get("https://www.yoursite.com/users").then(function(response){
				users = response;
				return users;
			});
		}
	}
})