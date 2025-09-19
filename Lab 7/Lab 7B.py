# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor : Manosmi Gundu.
# Lab# : 7B

import pygame

pygame.init()

size = (width, height) = (600, 600)
square = (widths, heights) = (60,60)

s1 = pygame.Surface(square)
s2 = pygame.Surface(square)
s3 = pygame.Surface(square)
s4 = pygame.Surface(square)
s5 = pygame.Surface(square)

s1.fill((255,0,0))
s2.fill((255,0,0))
s3.fill((255,0,0))
s4.fill((255,0,0))
s5.fill((255,0,0))


screen = pygame.display.set_mode(size)
clock = pygame.time.Clock()

while True:
    for event in pygame.event.get():
        if event.type == pygame.QUIT: exit()

    screen.blit(s1 , (0, 0))
    screen.blit(s2, (0, 540))
    screen.blit(s3, (540, 0))
    screen.blit(s4, (540, 540))
    screen.blit(s5, (270, 270))

    pygame.display.flip()



    clock.tick(60)