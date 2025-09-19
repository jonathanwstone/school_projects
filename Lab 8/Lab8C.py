# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Lab 8C

import pygame

#Needed
height = (500)
width = (500)
zoom = (5)



pygame.init()
clock = pygame.time.Clock()

screen = pygame.display.set_mode((width,height))
rect1 = pygame.Rect(height/2-25, height/2-25, 50, 50)

pygame.display.flip()
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    keys = pygame.key.get_pressed()

    if keys[pygame.K_a] and rect1.x > 0:
        rect1.x -= zoom
    if keys[pygame.K_d] and rect1.x < 450:
        rect1.x += zoom
    if keys[pygame.K_w] and rect1.y > 0:
        rect1.y -= zoom
    if keys[pygame.K_s] and rect1.y < 450:
        rect1.y += zoom
    if keys[pygame.K_r]:
        rect1.x = height/2-25
        rect1.y = height/2-25



    surf = pygame.Surface((rect1.w, rect1.h))
    surf.fill((0, 0, 255))

    screen.fill(( 0 , 0 , 0 ))


    screen.blit(surf, (rect1.x, rect1.y))


    pygame.display.flip()

    clock.tick(60)