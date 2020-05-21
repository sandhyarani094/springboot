var app = angular.module("myApp");
app.controller("addbookController", function($scope,$http,$location) {
	  $scope.book={};
	 
	$scope.saveBook=function(){
		console.log($scope.book);
		
	$http.post("http://localhost:9000/saveBook",$scope.book).then(function(response) {
		$location.path("/home");
		swal("Good Job!", "Book added successfully", "success");
	});
	
		
	}
	   
});
