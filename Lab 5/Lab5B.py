# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# :Lab 5A
size = int(input("Please enter a value for the size: "))
star = ("*")

print("This is the requested" , size , "x" , size , "box: ")

for i in range(0 , size):
    for j in range(0 , size):
        print(star , end = "")
    print("")

print("This is the requested right facing " , size , "x" , size , "triangle: ")

for i in range (0 , size):
    for j in range(0, i+1):
        print(star, end = "")
    print("")

print("This is the requested left facing " , size , "x" , size, "triangle")

for i in range (0 , size):
    for k in range(0, size-i+1):
        print(" ", end = "")
    for j in range(0, i+1):
        print(star, end = "")
    print("")



