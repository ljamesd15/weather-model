# Weather Platform

## Making a change
Make the model updates as needed
1. Compile the JAR ```$ mvn clean package```
2. Move the JAR to your local maven repository
   ```
   $ mvn install:install-file \
   -Dfile=./target/weather-model-1.0-SNAPSHOT.jar \
   -DgroupId=com.weather \
   -DartifactId=weather-model \
   -Dversion=1.0-SNAPSHOT \
   -Dpackaging=jar \
   -DgeneratePom=true
   ```