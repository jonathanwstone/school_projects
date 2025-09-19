# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# :Lab 5A

print("Please enter 10 numbers and this program will display the largest.")

numlist = []

for i in range (1,11):
    num = int(input("Please enter number " + str(i) + ": "))
    numlist.append(num)
biggun = max(numlist)
print("The largest number is " + str(biggun))
