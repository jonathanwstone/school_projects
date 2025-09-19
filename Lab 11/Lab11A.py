# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Lab 11A

#Constants
x = int(input("Enter your first number: "))
y = int(input("Enter your second number: "))

# Math Function and tuple
def allMath(x,y):
    add = x + y
    subtract = x - y
    multiply = x * y
    divide =  x / y
    floordivide = x // y
    modulus = x % y
    power = x ** y

    tuple=(add, subtract, multiply , divide , floordivide , modulus , power)
    print("Your resulting tuple is", tuple)

allMath(x,y)