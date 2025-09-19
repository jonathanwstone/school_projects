# Class: CSE 1321L
# Section: J11
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# Assignment 3A


sent=True

print("You are in a room.", end = " ")


while sent:
    direction = input("Choose a direction to move in (north, south, east, west): ")


    if direction == "north":
            swimmers = input("You move north and find a river. What will you do? (swim/build a raft): ")
            if swimmers == "swim":
                print("You swim across the river and find a hidden treasure.")
            else:
                print("You cant gather enough materials and have to move on.")
    elif direction == "south":
        trees = input("You move south and discover a dense forest. What will you do? (climb a tree/walk deeper): ")
        if trees == "climb a tree":
            print("You see the entire forest and enjoy the sights and sounds of nature")
        else:
            print("You walk deeper into the forest and find an abandoned cabin.")
    elif direction == "east":
        montagne = input("You move east and encounter a mountain. What will you do? (climb the mountain/move around it): ")
        if montagne == "climb the mountain":
            print("You struggle to climb the mountain, but in the end you reach a monestary of wise monks who teach you their secrets")
        else:
            print("You take the more common road and see the base of the mountain, taking in the sounds of the creatures around you")
    else:
        getinthere = input("You move west and stumble upon a cave. What will you do? (enter the cave/ walk past it): ")
        if getinthere == "enter the cave":
            print ("You run into a group of vampires and flee to daylight to save yourself.")
        else:
            print("You will always wonder what awaited you inside the maw of the cave.")


    keepitgoing = input("Would you like to continue playing? (yes/no): ")
    if keepitgoing == "yes":
        sent=True
    else:
        sent=False
