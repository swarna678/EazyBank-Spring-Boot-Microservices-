
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

http://localhost:8080/actuator/shutdown for shutdown without killling process using post method 


http://localhost:8070 for eurekaserver
http://localhost:8070/eureka/apps for eurekaserverinstances in xmlformat

Postman or browser calls →
http://localhost:8072/accounts/api/create

8072 → Gateway Server port.

ACCOUNTS → the service name you registered in Eureka (from your accounts microservice).

/api/create → actual API endpoint inside the accounts service


