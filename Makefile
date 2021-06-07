main:
	./mvnw clean spring-boot:build-image -Dmaven.test.skip=true
docker:
	./mvnw clean spring-boot:build-image docker:build -Dmaven.test.skip=true
start:
	./mvnw clean spring-boot:run
