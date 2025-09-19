# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Lab 11B

class Dog:
    def __init__(self, name, age, weight, furcolor, breed):
        self.age = age
        self.weight = weight
        self.name = name
        self.furcolor = furcolor
        self.breed = breed

    # Behaviors / Methods
    def bark(self_):
        print("Woof Woof")

    def eat(self):
        print(self.name, end = " ")
        foodweight = int(input("is very hungry, how much should he eat: "))
        self.weight += foodweight

    def rename(self):
        print(self.name, end=" ")
        namereplacement = input("isnt a very good name. What should they be renamed to: ")
        self.name = namereplacement


age = input("How old is the dog: ")
weight = int(input("How much does the dog weight: "))
name = input("What is the dog's name: ")
furcolor = input("What color is the dog: ")
breed = input("What breed is the dog: ")

doggie = Dog( name, age , weight , furcolor , breed )

print(doggie.name , "is a" , doggie.age , "year old" , doggie.furcolor , doggie.breed
      , "that weighs" , doggie.weight , "lbs.")

doggie.bark()
doggie.eat()
doggie.rename()

print(doggie.name , "is a" , doggie.age , "year old" , doggie.furcolor , doggie.breed
      , "that weighs" , doggie.weight , "lbs.")







