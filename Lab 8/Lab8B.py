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
speed2 = [10,0]
speed3 = [20,0]
nospeed = [0,0]

pygame.init()
clock = pygame.time.Clock()

screen = pygame.display.set_mode((width,height))
rect1 = pygame.Rect(0, (height//2-25), 50, 50)
rect2 = pygame.Rect((height//2-25), 0, 50, 400)
rect3 = pygame.Rect( 0, 0, 50, 50)
rect4 = pygame.Rect( 0, 350, 50, 50)


surf = pygame.Surface((rect1.w, rect1.h))
surf.fill((0,0,255))
surf2 = pygame.Surface((rect2.w, rect2.h))
surf3 = pygame.Surface((rect3.w, rect3.h))
surf3.fill((0, 0, 255))
surf4 = pygame.Surface((rect4.w, rect4.h))
surf4.fill((0, 0, 255))



pygame.display.flip()
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False


    if rect2.collidelist((rect1 , rect3 , rect4)) != -1:
        surf2.fill((0, 255, 0))
    else:
        surf2.fill((255, 0, 0))

    if (rect1.x < 0 or rect1.x > 350):
        speed[0] = -speed[0]
        speed[1] = -speed[1]
    if (rect3.x < 0 or rect3.x > 350):
        speed2[0] = -speed2[0]
        speed2[1] = -speed2[1]
    if (rect4.x < 0 or rect4.x > 350):
        speed3[0] = -speed3[0]
        speed3[1] = -speed3[1]

    rect1 = rect1.move(speed)
    rect3 = rect3.move(speed2)
    rect4 = rect4.move(speed3)


    screen.fill(( 0 , 0 , 0 ))

    screen.blit(surf2, (rect2.x, rect2.y))
    screen.blit(surf3, (rect3.x, rect3.y))
    screen.blit(surf4, (rect4.x, rect4.y))
    screen.blit(surf, (rect1.x, rect1.y))


    pygame.display.flip()

    clock.tick(60)