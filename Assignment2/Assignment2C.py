# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Assignment 2 A

def dotw():
    dotw = int(input("Enter a number (1-7): "))

    match dotw:

        case 1:
            print( dotw , ": Monday")

        case 2:
            print( dotw , ": Tuesday")

        case 3:
            print( dotw, ": Wednesday")

        case 4:
            print( dotw , ": Thursday")

        case 5:
            print( dotw , ": Friday")

        case 6:
            print( dotw , ": Saturday")

        case 7:
            print( dotw , ": Sunday")

        case _:
            print("Invalid input. Please enter a number between 1 and 7.")


dotw()
