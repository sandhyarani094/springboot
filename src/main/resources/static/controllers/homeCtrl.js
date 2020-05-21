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

		
	
	$http.get("https://igit-library-mangement-sys.herokuapp.com/getAllBook").then(function(response) {
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
	
	$http.post("https://igit-library-mangement-sys.herokuapp.com/deleteBook",bookId).then(function(response) {
	    
//		console.log(response.data);
		swal("Book deleted succssfully");
		$scope.getAllBook();
		
	});
	}

});