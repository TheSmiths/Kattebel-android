#!/usr/bin/env node 

var ex = require('child_process');

var data = {
    password: "",
    email: "",
    username: ""
}

function get(url) {
    console.log("Testing GET with\t"+url);
    var cmd = 'curl -s -H "X-Parse-Application-Id: APPLICATION-id"'+
     ' -H "X-Parse-REST-API-Key: JAVASCRIPT-id"'+
     ' -H "Content-Type: application/json"'+
     /*' -d \'' + JSON.stringify(data) + '\'' +*/
     ' -X GET "http://kattebel.parseapp.com'+url+'"';
     
     var raw_json = ex.execSync(cmd).toString();

     try {
        console.log(JSON.stringify(JSON.parse(raw_json),null,"\t"));
     }
     catch(e) {
        console.log(ex.execSync(cmd).toString());   
     }
};

get('/note/new');
