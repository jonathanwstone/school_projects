# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Lab 4 C

balance = 1000
print("Welcome!")
print("You have $" , balance , " in your account")
print(" ")

sentinalvalue = True
while sentinalvalue:
    print("Menu")
    print("0 – Make a deposit")
    print("1 – Make a withdrawal")
    print("2 – Display account value")
    print(" ")
    userchoice = int(input("Please make a selection: "))


    match userchoice:
        case 0:
            depo = int(input("How much would you like to deposit?: "))
            balance = balance + depo
            print("Your current balance is $" , balance)
        case 1:
            withdraw = int(input("How much would you like to withdraw?: "))
            if withdraw > balance:
                print("Not enough balance. Withdrawal cancelled.")
                print("Your current balance is $" , balance)
            else:
                balance = balance - withdraw
                print("Your current balance is $", balance)
        case 2:
            print("Your current balance is $", balance)
        case _:
            print("Invalid Input")

    yn = input("Would you like to return to the main menu (Y/N)?: ")

    if yn == "Y" :
        sentinalvalue = True
    else:
        print(" ")
        print("Thank you for banking with us!")
        sentinalvalue = False


