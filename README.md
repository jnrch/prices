# App
Application to get prices.

# Run application

```
mvn spring-boot:run
```

# H2 database
* [local](http://localhost:8080/api/h2-console)

## Pre-requisitos 📋

- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)
- [Maven 3](https://maven.apache.org)

## Swagger 📋

* [local](http://localhost:8080/api/swagger-ui/

## Actuator - app health📋

* [local](http://localhost:8080/api/actuator/health)

## Endpoint

#### Get prices by parameters:

Request :
```
curl --location --request GET 'http://localhost:8080/api/prices?product_id=35455&brand_id=1&start_date=2020-06-14 00:00:00&end_date=2020-06-14 16:00:00'
```
Response:

```
{
"productId": 35455,
"brandId": 1,
"priceList": 2,
"startDate": "2020-06-14T15:00:00",
"endDate": "2020-06-14T18:30:00",
"price": 25.45,
"currency": "EUR",
"priority": 1
}
```


