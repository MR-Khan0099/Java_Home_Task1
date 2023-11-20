# Java_Home_Task1
## Table of Contents
1.Introduction
2.Usage
3.Classes
4.Main
5.reservation
6.Store_data

## Introduction
The Reservation System project is a Java application that manages reservations with 24-hour time input and performs basic file operations. It includes error handling for invalid inputs during reservation and file handling for data storage.

## Usage
To use the Reservation System, follow these steps:

Run the Main class, which demonstrates the system's functionalities.
Enter reservation details when prompted, and observe how the system handles errors.
Check the generated files to see the result of file operations.
Classes
Main
The Main class contains the main method to initiate the reservation system. It creates instances of the reservation and Store_data classes and demonstrates the booking of a reservation and file operations.

## Reservation
The reservation class handles the reservation process. It prompts the user for reservation details, checks the input time, and throws exceptions for invalid inputs. The checktime method is responsible for validating the booking time.

## Store_data
The Store_data class manages file operations. It includes methods to create a new file (create_file) and copy the content of one file to another (Delete_file).

## Notes:
1. In file reservation I made unlogic operation  by divding number by zero to force code to go to catch . to print
2. Also, to show that excpetion in deleting files is working we try to delete not exist file to proveexception is  working  so it print just a massage 



Run the Main class to test the reservation system.
