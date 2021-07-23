export DB_URL=jdbc:postgresql://localhost:5432/db_customer
export DB_USER=u_customer
export DB_PASSWORD=customer

cd build/libs

java -jar customer-service-1.0-SNAPSHOT.jar