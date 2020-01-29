./mvnw clean test
./mvnw package -DSkipTests=true
docker-compose build --no-cache
docker-compose up