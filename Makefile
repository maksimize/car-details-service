build:
	DS_URL="jdbc:h2:file:~/test" DS_DRIVER="org.h2.Driver" ./mvnw package
	docker build -t car-details-service .
push:
    docker tag car-details-service:latest 409506722486.dkr.ecr.ap-southeast-1.amazonaws.com/car-details-service:latest
    docker push 409506722486.dkr.ecr.ap-southeast-1.amazonaws.com/car-details-service:latest
deploy:
    cd ansible
    ansible-playbook playbook-production.yml -i production.ini
test:
	DS_URL="jdbc:h2:file:~/test" DS_DRIVER="org.h2.Driver" ./mvnw test
