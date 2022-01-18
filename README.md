# 🎥 **Cinema Service**
The application describes the operation of a service for the sale of cinema tickets. </br>
#### Available actions of the application:
###### All users have access to pages: 
- /register 
- /login 
###### Users with role Admin or User have access to pages:
- /cinema-halls - get a list of cinema halls
- /movies - get a list of movies
- /movie-sessions/available - get a list of all movie sessions for a movie (by id) on a date
- /movie-sessions/** - get movie sessions with id
###### Users with role Admin have access to pages:
- /movies - add movie
- /movie-sessions - add movie session
- /cinema-halls - add cinema hall
- /users/by-email - get user by email
- /movie-sessions/** - change movie session by id
- /movie-sessions/** - delete movie session by id
###### Users with role User have access to pages:
- /orders - get a list of user's orders 
- /shopping-carts/by-user - get user's shopping cart
- /orders/complete - add order
- /shopping-carts/movie-sessions - change movie session (by id) from shopping cart
________________________________________________________________________________________________________________________
#### Technologies:
- Spring, Spring security, Spring web
- Hibernate(v 5.4.27.Final), Hibernate validator(v 6.1.6.Final)
- MySQL(v 8.0.22)
- Apache Tomcat (v 9.0.55)
- Maven
- Jackson(v 2.12.1)
_______________________________________________________________________________________________________________________
#### Implementation details and technologies
Project based on 3-layer architecture:</br>
![This is an image](https://progi.pro/media/main/f5/f0/11/f5f01101de396d5c76a8eb66efaf9653.png)
To implement the application were created: database, models, dto, interfaces DAO and services for each model, controllers for all actions.
_______________________________________________________________________________________________________________________
#### Setup "Cinema service"
- [x] Install MySQL and MySQL Workbench
- [x] Configure Apache Tomcat
- [x] Add plugin Lombok
- [x] Change the absolute path to checkstyle.xml in `pom.xml` </br>
  ![This is an image](http://joxi.ru/DmB6xRGcqwgkxm.jpg)
- [x] Create DB in the Workbench.
- [x] Change `DRIVER`, `DATABASE_URL`, `USERNAME`, `PASSWORD` in `/resources/db.properties` </br>
  ![This is an image](http://joxi.ru/p27zoExtLZkxnm.jpg)
