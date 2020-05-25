var app = angular.module("myApp");
app.controller("homeController", function($scope,$http,$location,$rootScope) {
	$scope.role=$rootScope.role;
	$scope.adminshow=false;
	$scope.tempbook;
	$scope.addbookstock;
	
	setTimeout(function(){
		if($scope.role==="admin"){
			$scope.adminshow=true;
			console.log($scope.adminshow);
		}
		else{
			$scope.adminshow=false;
			console.log($scope.adminshow);
		}
		$scope.$apply();
	},500);
	
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
	
	$scope.addstock=function(book){
		$scope.tempbook=book;
		$scope.tempbookname=book.name;
		console.log($scope.tempbookname);
		setTimeout(function(){
		$scope.$apply();
		},500);
	
//	$http.post("http://localhost9000/addStock",$scope.temp).then(function(response) {
//		
//		swal("Good Job!", "Stock Added", "success");
//	});
//	
		
	}
	$scope.savestock=function(){
		
		var temp={
			"bookid": $scope.tempbook.id,
			"bookqty": $scope.addbookstock.qty
		  }
		$http.post("http://localhost9000/addStock",temp).then(function(response) {
					
					swal("Good Job!", "Stock Added", response.value);
				});
	}
	
	

});