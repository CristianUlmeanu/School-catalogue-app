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
7. Disciplina - extended from persoana
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

I created 4 CSV files to have the inputs saved in there for 4 classes. I've also created an AUDIT CSV file which is monitoring the usage of the app. I created a method which loads  all the data from the CSV files.
I will implement later the Singletone and also create CSV files for all the classes.
