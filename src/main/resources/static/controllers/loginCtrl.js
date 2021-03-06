var app = angular.module("myApp");
app.controller('loginController', function($scope, $http,$location,$rootScope){
	
	
	$scope.emailid='abc@gmail.com';
	$scope.password='abc';
	$scope.hidediv= true;
	$scope.loginhide=function(){
		if($scope.hidediv==false)
		{
			$scope.hidediv=true;
		}
		else
		{
			$scope.hidediv=false;
		}
	}
	
	$scope.login=function(){
		$scope.logindetails={
				  "mailid":$scope.emailid,
				  "pw": $scope.password
				};

		
	
		$http.post("https://igit-library-mangement-sys.herokuapp.com/login",$scope.logindetails).then(function(response) {
			console.log(response);
			if(response.status==200 && response.data!=""){
				$rootScope.role=response.data.role;
			
				$location.path("/home");
				swal("Welcome Back!"+response.data.name, "You are authenticated", "success");
			}
			else
				{
				swal("Sorry","You are not authenticated","error");
				}
			
		});
		
		
	}
	$scope.saveuser=function(){
		console.log($scope.user);
		$scope.user.id=0;
	$http.post("https://igit-library-mangement-sys.herokuapp.com/saveUser",$scope.user).then(function(response) {
		$location.path("/");
		swal("Good Job!", "Successfully Registered", "success");
	});
	
		
	}
	
});