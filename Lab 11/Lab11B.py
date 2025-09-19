# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Lab 11B

phrase = input("Enter your phrase: ")
search = input("Enter a letter: ")

def letterPositions(phrase,search):
    phraselist = list(phrase)

    index = phraselist.index(search)

    print(index)




letterPositions(phrase,search)