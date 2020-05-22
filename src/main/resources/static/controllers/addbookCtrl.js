var app = angular.module("myApp");
app.controller("addbookController", function($scope,$http,$location) {
	  $scope.book={};
	 
	$scope.saveBook=function(){
		console.log($scope.book);
		$scope.book.id=0;
		
	$http.post("https://igit-library-mangement-sys.herokuapp.com/saveBook",$scope.book).then(function(response) {
		$location.path("/home");
		swal("Good Job!", "Book added successfully", "success");
	});
	
		
	}
	   
});
