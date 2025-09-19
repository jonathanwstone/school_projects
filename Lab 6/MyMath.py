# Class: CSE 1321L
# Section: J11
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# MyMath.py

def my_max(num_one, num_two):
    if num_one > num_two :
        print("Max is: " , num_one )
    else:
        print("Max is: " , num_two )

def my_min(num_one,num_two):
    if num_one < num_two :
        print("Min is: ", num_one)
    else:
        print("Min is: ", num_two)

def my_avg(num_one,num_two):
    sumt = num_one + num_two
    avg =  sumt / 2
    print("Average is ", avg)