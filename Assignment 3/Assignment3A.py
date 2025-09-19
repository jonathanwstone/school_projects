# Class: CSE 1321L
# Section: J11
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# Assignment 3A

posi = int(input("Enter a positive number: "))

numb = 1

for row in range (1, posi+1):
    for col in range (1, row+1):
        print(numb, end = " ")
        numb+=1
    print("")