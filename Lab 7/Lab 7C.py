# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor : Manosmi Gundu.
# Lab# : 7C

import pygame

pygame.init()

size = (width, height) = (1000, 500)

cube1 = pygame.Rect(0, 0, 100, 100)
surfcube1 = pygame.Surface((cube1.w, cube1.h))
surfcube1.fill((0,0,255))


cube2 = pygame.Rect(0, 0, 100, 100)
surfcube2 = pygame.Surface((cube2.w, cube2.h))
surfcube2.fill((0,255,0))

cube_speed = [5,0]



screen = pygame.display.set_mode(size)
clock = pygame.time.Clock()

running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT: exit()

    if (cube1.x < 0 or cube1.x > 900) and (cube1.y < 400 or cube1.y > 0):
        cube_speed[0] = -cube_speed[0]
        cube_speed[1] = -cube_speed[1]



    cube1 = cube1.move(cube_speed)
    cube2 = cube2.move(cube_speed)

    screen.fill((0, 0, 0))
    screen.blit(surfcube1, (cube1.x, cube1.y))
    screen.blit(surfcube2, (cube2.x, 400))

    pygame.display.flip()

    clock.tick(60)