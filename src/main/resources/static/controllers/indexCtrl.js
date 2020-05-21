var app = angular.module('myApp', [ "ngRoute" ]);
	app.config(function($routeProvider,$locationProvider) {
		$routeProvider.when("/", {
			templateUrl : "./pages/login.html",
				controller:"loginController"
			
		}).when("/home", {
			templateUrl : "./pages/home.html",
				controller:"homeController"
		}).when("/aboutus", {
			templateUrl : "./pages/aboutus.html",
		}).when("/noticeboard", {
			templateUrl : "./pages/notice.html",
		}).when("/addbook", {
			templateUrl : "./pages/addbook.html",
		})
		.when("/editbook", {
			templateUrl : "./pages/editbook.html"
		})
		
		.when("/suggestbook", {
			templateUrl : "./pages/booksuggestion.html"
		})
		.when("/suggestbook", {
			templateUrl : "./pages/booksuggestion.html"
		})
		.when("/suggestbook", {
			templateUrl : "./pages/booksuggestion.html"
		})
		.when("/suggestbook", {
			templateUrl : "./pages/booksuggestion.html"
		})
		.when("/suggestbook", {
			templateUrl : "./pages/booksuggestion.html"
		})
		

	});

	