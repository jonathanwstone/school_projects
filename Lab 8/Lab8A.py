# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Lab 8A

import pygame

#Needed
height = (400)
width = (400)
zoom = (5)
speed = [5,0]


pygame.init()
clock = pygame.time.Clock()

screen = pygame.display.set_mode((width,height))
rect1 = pygame.Rect(0, (height//2-25), 50, 50)
rect2 = pygame.Rect((height//2-25), 0, 50, 400)


surf = pygame.Surface((rect1.w, rect1.h))
surf.fill((0,0,255))
surf2 = pygame.Surface((rect2.w, rect2.h))
surf2.fill((255, 0, 0))




pygame.display.flip()
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False



    if rect1.colliderect(rect2):
        surf2.fill((0, 255, 0))
    else:
        surf2.fill((255, 0, 0))

    if (rect1.x < 0 or rect1.x > 350):
        speed[0] = -speed[0]
        speed[1] = -speed[1]

    rect1 = rect1.move(speed)

    screen.fill(( 0 , 0 , 0 ))


    screen.blit(surf, (rect1.x, rect1.y))
    screen.blit(surf2, (rect2.x, rect2.y))

    pygame.display.flip()

    clock.tick(60)
