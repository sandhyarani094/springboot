var app = angular.module("myApp");
app.controller('ticketCtrl', function($scope, $http,$location){
	
	$scope.emailid='admin@gmail.com';
	$scope.password='admin';
	$scope.login=function(){
		swal("Welcome Back!", "You are authenticated", "success");
		$location.path("/home");
	}
});