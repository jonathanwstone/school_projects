# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Lab 4 A

grade = float(input("Enter the score of your exam: "))


if grade > 97:
    print("Letter grade is: A+")
elif grade > 94:
    print("Letter grade is: A")
elif grade > 91:
    print( "Letter grade is: A-")
elif grade > 88:
    print("Letter grade is: B+")
elif grade > 85:
    print("Letter grade is: B ")
elif grade > 82:
    print("Letter grade is: B- ")
elif grade > 79:
    print("Letter grade is: C+ ")
elif grade > 76:
    print("Letter grade is: C ")
elif grade > 73:
    print("Letter grade is: C- ")
elif grade > 70:
    print("Letter grade is: D+ ")
elif grade > 67:
    print("Letter grade is: D ")
elif grade > 64:
    print("Letter grade is: D- ")
elif grade >= 0:
    print("Letter grade is: F ")