# Class: CSE 1321L
# Section: J11
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# 6A

sent = True

def area():
    xya = float(x*y)
    print("The area is", xya)


def perimeter():
    xyp = 2*(x+y)
    print("The perimeter is", xyp)


def isValid():
    while xys > 30 :
       print("This is a valid rectangle")
       area()
       perimeter()
       break
    else:
       print("This is not a valid rectangle")

while sent == True:
    x = float(input("Enter width: "))
    y = float(input("Enter height: "))

    xys = (x + y )

    isValid()

    userin = input("Do you want to enter another width and height (Y/N) ?: ")
    if userin == ("Y"):
        sent = True
    else:
        sent = False

