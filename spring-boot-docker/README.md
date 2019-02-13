# SpringBootをDockerで動かすメモ
## Initializr
```
$ curl https://start.spring.io/starter.tgz \
-d dependencies=web \
-d type=maven-project \
-d applicationName=Application \
-d groupId=com.example \
-d artifactId=spring-boot-docker \
-d packageName=app \
-d baseDir=spring-boot-docker | tar -xzvf -
```

## Maven package
```
$ ./mvnw package
```

## Run
```
$ docker-compose up --build
```