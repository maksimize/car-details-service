build:
	DS_URL="jdbc:h2:file:~/test" DS_DRIVER="org.h2.Driver" ./mvnw package
	docker build -t car-details-service .
test:
	DS_URL="jdbc:h2:file:~/test" DS_DRIVER="org.h2.Driver" ./mvnw test
