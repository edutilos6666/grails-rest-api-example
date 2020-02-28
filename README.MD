### h2-console
http://localhost:8080/h2-console


### commands
./grailsw run-app

./grailsw run-app --port=8090

./gradlew bootRun

grails list-profiles

grails create-app myApp -profile rest-api

grails create-app myApp -profile org.grails.profiles:react:1.0.2

grails profile-info plugin

./grailsw console  (here we can play with model classes, ...)


### rest 
curl -i -X POST -H "Content-Type: application/json" -d '{"name": "BMW"}' localhost:8080/api/makes

curl -i -X PUT -H "Content-Type: application/json" -d '{"name": "Audi"}' localhost:8080/api/makes/3

curl -i -X DELETE localhost:8080/api/makes/3

