var app = angular.module("myApp");
app.controller("homeController", function($scope,$http,$location,$rootScope) {
	$scope.role=$rootScope.role;
	$scope.adminshow=false;
	if($scope.role=="admin"){
		$scope.adminshow=true;

	}
	else{
		$scope.adminshow=false;
	}
	$scope.getAllBook=function(){

		
	
	$http.get("http://localhost:9000/getAllBook").then(function(response) {
		$scope.myBooks = response.data;
		console.log(response.data);
	});
	}
	$scope.getAllBook();
	$scope.editBook=function(book){
		console.table(book);
		$rootScope.bookdetails=book;
		$location.path("/editbook");
	}
	$scope.deleteBook=function(bookId){
		console.log(bookId);
	
	$http.post("http://localhost:9000/deleteBook",bookId).then(function(response) {
	    
//		console.log(response.data);
		swal("Book deleted succssfully");
		$scope.getAllBook();
		
	});
	}

});