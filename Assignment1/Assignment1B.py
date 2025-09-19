# Class: CSE 1321L
# Section: J11
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# 2C

P = float(input("Enter the loan amount: "))
annrate = float(input("Enter the annual interest rate(in %): "))
years = int(input("Enter the loan term (in years): "))

r = ((annrate/100) / 12)
n = (years * 12)

A1 = (P * r)
A2 = ((1+r)**n)
A3 = (((1+r)**n)-1)
MP = round(((A1 * A2)/A3), 2)

print("Your monthly payment is: ",MP)