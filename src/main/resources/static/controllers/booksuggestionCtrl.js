var app = angular.module("myApp");
app.controller("booksuggestionController", function ($scope, $http, $location) {
    $scope.agegroup="<18";
    $scope.booktype="story";
    $scope.allbooksbyage=[];
    $scope.allbooksbytype=[];
    
    $scope.getBookByAgegroup=function(){
    $http.post("https://igit-library-mangement-sys.herokuapp.com/getAllBookByAgegroup",$scope.agegroup).then(function(response) {
		
        console.log(response.data);
        $scope.allbooksbyage=response.data;
    });
}
$scope.getBookByBooktype=function(){
    $http.post("https://igit-library-mangement-sys.herokuapp.com/getAllBookByBooktype",$scope.booktype).then(function(response) {
		$scope.allbooksbytype = response.data;
		console.log(response.data);
    });
}
$scope.getBookByAgegroup();
$scope.getBookByBooktype();
});