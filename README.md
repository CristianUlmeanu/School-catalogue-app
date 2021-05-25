# School-catalogue-app
A school catalogue type of app created for my EAP university course

# Stage 1

## The structure of the project will be the following.

I will implement the following classes:
1. Locatie
2. Scoala - extended from Locatie
3. Persoana
4. Student - extended from Persoana
5. Profesor - extended from Persoana
6. Domeniu
7. Disciplina - extended from Persoana
8. Sala

Also implemented auxialliary classes for services(Services), menu(Meniu) and main.
The hierarchy might suffer changes. I might add new classes or modify them a little bit but primarly those are the main ones.

## Methods implemented:
I've implemented methods for adding, viewing, modifying and deleteing objects for each class. Later I will create a general method for adding, viewing that works as a whole for the entire hierarchy. I added the following methods: 
- to show the schools from a certain location, 
- to show the domains that a school has, 
- to calculate the average of the marks for a course,
- to calculate the number of credits awarded for a course based on the marks.

The methods will probably suffer changes, I intend to add more methods to the app and edit those methods to be more exact the inputs.

# Stage 2

Created a Generic Singleton Class, but didn't use it since I didn't find a attribution and a way to use it for the project but I created it as a requirment. 

I created 4 CSV files with a function to read from it used for the data inputs, the loading of the inputs in the data members is done before starting to go trough the app. 

On top of that I used another 4 CSV files for viewing the data members which is populated by a method which writes in it the data members. On top of that I created a CSV file as an audit type of file which monitors the usage of the application.

# Stage 3

Created matching database for 4 of the classes in MySQL. I've conected the database to the application and created CRUD methods for the application in order to work on the database from the application. I've alsoe created a method which parses the information from the app to the database or from the database to the app.
