var app = angular.module("SprinDemooo", []);
app.controller("AppController", function ($scope, $http) {

    $scope.table = [];
    $http.get('http://localhost:8083/api').success(function(data){
        $scope.table=data;

    });
});

// <tr ng-repeat="users in table">
//     <th>{{users.name}}</th>
// <th>{{users.lastName}}</th>
// <th>{{users.phone}}</th>
// </tr>