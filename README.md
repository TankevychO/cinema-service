# 🎥 **Cinema Service**
The application describes the operation of a service for the sale of cinema tickets. </br>
#### Available actions of the application:
The application has the ability: 
- view lists of cinema halls, movies, all movie sessions, orders, movie sessions for a movie on a date
- find movie session by id, shopping cart by user, user by email
- add movie, movie session, cinema hall, order
- change movie session by id, movie session from shopping cart
- delete movie session </br>

There are two types of roles in the application: ADMIN and USER. During registration, the user is assigned a role USER.
###### All users have access to pages: 
/register </br>
/login </br>
###### Users with role Admin or User have access to pages:
GET: /cinema-halls - get a list of cinema halls </br>
GET: /movies - get a list of movies </br> 
GET: /movie-sessions/available - get a list of all movie sessions for a movie (by id) on a date </br>
GET: /movie-sessions/{id} - get movie sessions with id </br>
###### Users with role Admin have access to pages:
POST: /movies - add movie </br>
POST: /movie-sessions - add movie session </br>
POST: /cinema-halls - add cinema hall </br>
GET: /users/by-email - get user by email </br>
PUT: /movie-sessions/{id} - change movie session by id </br>
DELETE: /movie-sessions/{id}} - delete movie session by id </br>
###### Users with role User have access to pages:
GET: /orders - get a list of user's orders </br>
GET: /shopping-carts/by-user - get user's shopping cart </br>
POST: /orders/complete - add order </br>
PUT: /shopping-carts/movie-sessions - change movie session (by id) from shopping cart </br>
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
