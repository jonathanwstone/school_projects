# Class: CSE 1321L
# Section:
# Term: Fall 2024
# Instructor: Manosmi Gundu.
# Lab# : Lab 9


import pygame
import pygame.mixer

pygame.init()
clock = pygame.time.Clock()

#Variables
width = (500)
height = (500)

offing = True
charging = False
ready = False
shooting = False
discharge = False
soundplaying = False
readytoparty = False

buttonfont = pygame.font.Font(None, 32)
headerfont = pygame.font.Font(None, 32)
statusfont = pygame.font.Font(None, 64)

hitbox1 = pygame.Rect(60, 200, 100, 100)
hitboxx = pygame.Rect(200, 200 , 100, 100)
hitboxxx = pygame.Rect(340, 200, 100, 100)

hit1col = pygame.Surface((hitbox1.w, hitbox1.h))
hit2col = pygame.Surface((hitboxx.w, hitboxx.h))
hit3col = pygame.Surface((hitboxxx.w, hitboxxx.h))
hit1col.fill((255,0,0))
hit2col.fill((0,255,0))
hit3col.fill((0,0,255))

screen = pygame.display.set_mode((width,height))
onbutton = pygame.image.load("button-on.png").convert_alpha()
offbutton = pygame.image.load("button-off.png").convert_alpha()
laserimage = pygame.image.load("laser.png").convert_alpha()

onresize = pygame.transform.scale(onbutton, (100,100))
offresize = pygame.transform.scale(offbutton, (100,100))
laserresize = pygame.transform.scale(laserimage, (100,100))

on = buttonfont.render("Power Up", True, (0,0,0))
shoot = buttonfont.render("Shoot", True, (0, 0, 0))
off = buttonfont.render("Power Down", True, (0, 0, 0))

charge = statusfont.render("Charging", True, (0, 0, 0))
pewpew = statusfont.render("Shooting", True, (0, 0, 0))
losecharge = statusfont.render("Discharging", True, (0, 0, 0))
itsoff = statusfont.render("Off", True, (0, 0, 0))
ready = statusfont.render("Ready", True, ((0,0,0)))

powerup = pygame.mixer.Sound("powerup.mp3")
powerdown = pygame.mixer.Sound("powerdown.mp3")
shooty = pygame.mixer.Sound("blaster.mp3")

running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

        elif event.type == pygame.MOUSEBUTTONDOWN:

            if hitbox1.collidepoint(event.pos):
                powerup.play()
                discharge = False
                shooting = False
                offing = False
                charging = True
            elif hitboxx.collidepoint(event.pos) and readytoparty == True:
                shooty.play()
                discharge = False
                shooting = True
                offing = False
                charging = False
            elif hitboxxx.collidepoint(event.pos) and readytoparty == True:
                powerdown.play()
                discharge = True
                shooting = False
                offing = False
                charging = False
        elif pygame.mixer.get_busy():
            soundplaying = True
        elif not pygame.mixer.get_busy():
            soundplaying = False

    screen.blit(hit1col, (60,200))
    screen.blit(hit2col,(200, 200))
    screen.blit(hit3col, (340,200))

    screen.fill((255,255,255))

    if offing == True:
        screen.blit(itsoff, ((220, 140)))
    elif soundplaying == False and charging == True:
        screen.blit (ready, (200,140))
        readytoparty = True
    elif charging == True:
        screen.blit(charge, ((160,140)))
    elif shooting == True:
        screen.blit(pewpew, ((160, 140)))
    elif discharge == True:
        screen.blit(losecharge, ((130, 140)))



    screen.blit(onresize,(60,200))
    screen.blit(laserresize, (200, 200))
    screen.blit(offresize, (340,200))

    screen.blit(on, ((width/2-190,height/2+70)))
    screen.blit(shoot, ((width/2-40), (height/2+70)))
    screen.blit(off, ((width/2+75),(height/2+70)))





    pygame.display.flip()