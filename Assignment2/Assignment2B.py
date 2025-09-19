# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Assignment 2 A

def AnimalClassifier():
    animal = input("Enter the name of an animal: ")
    animal = animal.lower()

    if animal in ["dog", "cat" , "human" , "elephant" , "whale" ]:
        print("The chosen animal is a mammal.")

    elif animal in ["snake", "lizard", "crocodile" , "turtle"]:
        print("The chosen animal is a reptile.")

    elif animal in ["salmon" , "goldfish" , "shark" , "tuna"]:
        print("The chose animal is a fish.")

    elif animal in ["frog" , "toad" , "salamander" , "newt"]:
        print("The chosen animal is a reptile.")
    else:
        print("Unknown category")

AnimalClassifier()
