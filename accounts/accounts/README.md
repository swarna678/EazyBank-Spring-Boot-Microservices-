
first we use the h2 databse using 
localhost:8080/h2-console

for documentaion we use openapi for restapi :
http://localhost:8080/swagger-ui/index.html

for spring actuator
http://localhost:8080/actuator -it will get all apis 

Check Endpoints in Browser or Postman

General Health Check
http://localhost:8080/actuator/health


Liveness Probe
http://localhost:8080/actuator/health/liveness


Readiness Probe
http://localhost:8080/actuator/health/readiness

http://localhost:8071/accounts/prod - for application.properties



