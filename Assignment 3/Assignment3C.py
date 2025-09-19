# Class: CSE 1321L
# Section: J11
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# Assignment 3C
num = 1
while num <= 25:
    for row in range(5):
       print(" ")
       for col in range (5):
            if num % 2:
                print( num , "(O)", end = " ")
                num+=1

            else:
                print(num , "(E)", end = " ")
                num+=1

    num+=1