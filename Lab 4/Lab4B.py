# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Lab 4 B

print("Welcome!")
num = float(input("Please input a number: "))
counter = -1

print("What would you like to do to this number: ")
print("0) Get the additive inverse of the number")
print("1) Get the reciprocal of the number")
print("2) Square the number")
print("3) Cube the number")
print("4) Exit the program")
choice = int(input(""))
print(" ")

match choice:
    case 0:
        inverse = num * -1
        print("The additive inverse of " , num , "is" , inverse)
    case 1:
        if num == 0:
            print("Cannot divide by 0!")
        else:
            recip = 1 / num
            print("The reciprocal of" , num , " is " , recip)
    case 2:
        square = num * num
        print("The square of " , num , " is " , square)
    case 3:
        cube = num * num * num
        print("The cube of " , num , " is " , square)
    case 4:
        print("Thank you, goodbye!")
    case _:
        print("Invalid option!")
