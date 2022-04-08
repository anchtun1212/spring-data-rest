# Create new Database and new user

sudo -u postgres psql

postgres=# create database springdb;

postgres=# create user springuser with encrypted password 'springpass';

postgres=# grant all privileges on database springdb to springuser;

# Below URLs will work perfectly for the created REST API.

Base URL = http://localhost:8496/products

[GET to get all Products] : http://localhost:8496/products

[GET to get product by id] : http://localhost:8496/products/{id}

[POST to create new product] : http://localhost:8496/products

[PUT to update product by id] : http://localhost:8496/products/{id}

[DELETE to delete product by id] : http://localhost:8496/products/{id}

# You can use postman to test URLs and you can import this collection: Spring local.postman_collection.json



