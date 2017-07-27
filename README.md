Team Dev TODO list is at: https://docs.google.com/document/d/1JvA3Q6teH_uK631jiM7oua0K3VxNrkMbHlg-U9yywjY/edit?ts=597686e0


# _Takeover of The Coding Zombies_

#### _Brief Description: Program presents user with a series of movement choices as they move through a play field populated with zombies and obstacles, July 27, 2017_

#### By _**Michael Dunlap, Laura Hamilton, Steve Zaske & Joel Bakken**_

## Description
_This program is a text based adventure game that uses a database to track the location of zombies, your location and the movement options available to you._
* _The goal of this adventure is to find your way through the play field without being caught by any zombies. Don't forget to get your noodles on your way out...

## What's included
Within the repository you'll find the following directories and files:
```
epicodus-zombies/
├── src/
│    └── main/
│    │    └── java/
|    │    │     └── App.java
|    │    │     └── Exit.java
|    │    │     └── DB.java
|    │    │     └── Location.java
|    │    │     └── Zombie.java
|    │    │     └── VelocityTemplateEngine.java
|    |    └── resources/
|    |          └──public/
|    |                └──css/
|    |                    └──zombie.css
|    |                └──fonts/
|    |                    └──V5Xtende.ttf
|    |                └──img/
|    |                    └──1.jpg
|    |                    └──2.jpg
|    |                    └──3.jpg
|    |                    └──4.jpg
|    |                    └──5.jpg
|    |                    └──6.jpg
|    |                    └──7.jpg
|    |                    └──8.jpg
|    |                    └──9.jpg
|    |                    └──10.jpg
|    |                    └──11.jpg
|    |                    └──12.jpg
|    |                    └──13.jpg
|    |                    └──14.jpg
|    |                    └──15.jpg
|    |                    └──16.jpg
|    |                    └──17.jpg
|    |                    └──18.jpg
|    |                    └──game_over.png
|    |          └──templates/
|    |               └──death.vtl
|    |               └──index.vtl
|    |               └──layout.vtl
|    |               └──start.vtl
|    └── test/
│         └── java/
|               └── DatabaseRule.java
|               └── ExitTest.java
|               └── LocationTest.java
|               └── ZombieTest.java
├── .gitignore
├── build.gradle
└── README.md
```

## Setup/Installation Requirements

* _Install gradle on your device_
* _LOCAL: Go to Terminal_
* _Clone this repository:_
```
$ cd ~/Desktop
$ git clone https://github.com/szaske/epicodus-zombies.git
$ cd epicodus-zombies
```
* _Run Postgres with terminal command:_
```
$ postgres
```
* _Open a new tab in terminal by pressing [command ⌘] + [T]_
* _In the new tab, create 'epicodus_zombies' database:_
```
$ psql
$ CREATE DATABASE epicodus_zombies;
$ \c epicodus_zombies;
$ CREATE TABLE locations (id serial PRIMARY KEY, roomtitle varchar, roomdescription varchar);
$ CREATE TABLE exits (id serial PRIMARY KEY, locationid int,  leadsto int, direction varchar);
$ CREATE TABLE zombies (id serial PRIMARY KEY, name varchar, description varchar, location int);
$ CREATE TABLE items (id serial PRIMARY KEY, name varchar, description varchar, location int, status int, userid varchar);
$ CREATE DATABASE epicodus_zombies_test WITH TEMPLATE sepicodus_zombies;


```
* _Return to original tab where repository was cloned and run gradle:_
```
$gradle run
```
* _Open browser window:_
```
localhost:4567
```

## Known Bugs

_No known bugs at this time_

## Support and contact details

_For questions or feedback, please notify Michael Dunlap, Laura Hamilton, Steve Zaske or Joel Bakken via Epicodus._

## Technologies Used

_Languages used include Java & Amazon AWS database server. IDE used - Atom_

### License

*This software runs under the MIT license*

Copyright (c) 2017 **_Michael Dunlap, Laura Hamilton, Steve Zaske & Joel Bakken_**
