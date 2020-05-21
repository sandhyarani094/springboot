var app = angular.module("myApp");
app.controller("editbookController", function($scope,$http,$location,$rootScope) {
	$scope.book=$rootScope.bookdetails;
	$scope.saveBook=function(){
		console.log($scope.book);
		
	$http.post("http://localhost:9000/saveBook",$scope.book).then(function(response) {
		$location.path("/home");
		swal("Good Job!", "Book updated successfully", "success");
	});
	
	
	
		
	}
	   
});