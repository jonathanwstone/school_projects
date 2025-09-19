# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor : Manosmi Gundu.
# Lab# : 7A

import pygame

pygame.init()

size = (width, height) = (400, 400)
speed = [5,5]
startcolor = 255
screen = pygame.display.set_mode(size)
clock = pygame.time.Clock()

while True:
    for event in pygame.event.get():
        if event.type == pygame.QUIT: exit()

    screen.fill((startcolor,startcolor,startcolor))
    pygame.display.flip()

    if startcolor > 0:
        startcolor -= 1
    if startcolor == 0:
        startcolor += 0

    clock.tick(60)