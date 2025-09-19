# Class: CSE 1321L
# Section: J11
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# 2C

w = float(input("Enter your weight in kilograms: "))
h= float(input("Enter your height in centimeters: "))

Height = (h/100)

BMI = round(w/((Height)**2),1)

print("Your BMI is: ", BMI)
if BMI<(18.5):
    print("1 Weight")
elif 18.5 < BMI < 24.9:
    print("2 Weight")
elif 25 < BMI < 29.9:
    print("3 Weight")
else:
    print("4 Weight")