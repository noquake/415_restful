# Inception
This RESTful API was built primarily using IntelliJ and Postman. Swagger implemenetation was later included as required but I found that Postman was more transparent/handson in the making of requests and alowed for a more top-down view of the application. This first iteration of the app is based on simple CRUD requests for the manipulation of objects called "Takes" which are simplified movie reviews that hold three String values; filmName, filmRating, and filmNotes. 

Initially this API was going to be of a library in the form of a hashmap containing Takes, that would include a number of other parameters and presentation methods, but learning to perform simple CRUD operations proved to be a challenge enough. The core of that program is reserved in this API and in the future I will work to incorporate the other methods as well as a more rounded out application.

Special shoutout to [Think Constructive](https://www.youtube.com/@ThinkConstructive) for guiding me through the process and explaining the implementation of CRUD operations.

**This repo is built based off a previous project that eventually had to be terminated because of som failure I could not figure out. This project uses Gradle instead of Maven.

# Installation

## Git Clone + Docker
Locally clone the git repo with this line,
```
git clone https://github.com/noquake/415_restful.git
```
cd into the restful folder and create the .jar files needed by the application,
```
./gradlew build
```

Now, with the required files present on your system, make sure that the Docker Daemon is currently running and run this command while inside the 'RESTful-API' folder. The initial build may take some time.
```
docker image build -t restful-takes-api .
```
Now that the image has been built on your machine, you can run it using this command. 
NOTE: I would recommend using the docker desktop application once the image is built to run the container in a more user-friendly way.
```
docker run --rm -name restful-takes-api -p 8080:8080
```
or
```
docker run --rm -name restful-takes-api -p {any desired port on your local machine}:8080
```
The application should now to running on your machine, visit the Swagger UI to interact with it. If you used a port on your machine that isn't 8080, place it in this link to access Swagger.
```
http://localhost:8080/swagger-ui/index.html
```
or
```
http://localhost:{the port you used to run the image}/swagger-ui/index.html
```

If you are familiar with Postman, you can run/test some request using the included RESTful.postman_collection.JSON to run CRUD tests I have implemented. To access this collection, import the file into postman and feel free to test at your leisure.

## Kubernetes

First, retrieve the application files via git clone
``` bash
git clone https://github.com/noquake/415_restful.git
cd 415_restful
```
Then run the following commands to apply the kubernetes commands to create a deployment
```bash
kubectl apply -f kubernetes
```
Then,
```kubectl get all```
to retrieve the status of the deployment

You can run this cURL to verify that your service is running correctly
```bash
curl localhost:31234/fib?length=18
```
Your output should contain `[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597]`

## Download ZIP
A simpler way to run this application without its dependencies already being installed is to first download the ZIP, unzip it and run it in an application of your choice. This will ensure the presence of the source code at the assumption you have an IDE and port 8080 already open.
