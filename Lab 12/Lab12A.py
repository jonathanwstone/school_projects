# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Lab 11B

class Chair:
    number_legs: 4            # How many legs the chair have
    rolling: True             # Does the chair roll
    material: "Plastic"       # material the chair is made out of


print("You are about to creat a chair.")
Chair.number_legs = input("How many legs does your chair have: ")
Chair.rolling = input("Is your chair rolling (true/false): ")
Chair.material = input("What is your chair made of: ")

if Chair.rolling == True:
    print("Your chair has", Chair.number_legs, "legs, is rolling, and is made of", Chair.material, ".")
else:
    print("Your chair has", Chair.number_legs, "legs, is not rolling, and is made of", Chair.material, ".")

print("This program is going to change that.")

Chair.number_legs = 4
Chair.rolling = False
Chair.material = "wood"

print("Your chair has", Chair.number_legs, "legs, is not rolling, and is made of", Chair.material, ".")
