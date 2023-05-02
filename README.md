
Receiptbook API
====

# About

### __In progress__

Backend restfull API to manage receipts.

[//]: # (# How to run)
# Before first run
### Mongodb connection
Before first run change `spring.data.mongodb.uri` in [application.properties](src/main/resources/application.properties) with following pattern:
```agsl
mongodb://<USERNAME>:<PASSWORD>@<DB_HOST>/<DB_NAME>?authSource=admin
```
### Docker instructions 
Setting up mongodb container:
```bash
sudo docker run -d -p 27017:27017 --name=mongodb -e MONGO_INITDB_ROOT_USERNAME=<USERNAME> -e MONGO_INITDB_ROOT_PASSWORD=<PASSWORD> mongo:latest 
```
Accessing mongo shell:
```bash
sudo docker exec -it mongodb mongosh -u <USERNAME> -p <PASSWORD>
```