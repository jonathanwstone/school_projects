# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Assignment 2 A

def ticketinquiry():
    age = int(input("Please enter your age: "))
    if (age < 12):
        print("Ticket Price: $8.00")
    elif (age <= 17):
        print("Ticket Price: $10.00")
    elif (age <= 64):
        club = input("Are you a member of our cinema club (Please respond Yes or No)?: ")
        if club == ("Yes") :
            print("Welcome member, Ticket price: $12.00")
        else:
            print("Ticket Price: $15.00")
    else:
        print("Ticket price: $10.00")

ticketinquiry()
