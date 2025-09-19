import pygame
import random

pygame.init()
clock = pygame.time.Clock()

#Variables
width = (800)
height = (600)
speed = (5)
fall = (5)
count = 0
screen = pygame.display.set_mode((width,height))

basket = pygame.Rect(300, 540, 100, 20)
apple = pygame.Rect((random.randint(0, (800-20))), 0, 20, 20)


running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False


    keys = pygame.key.get_pressed()

    if keys[pygame.K_a] and basket.x > 0:
        basket.x -= speed
    if keys[pygame.K_d] and basket.x < 700:
        basket.x += speed


    if apple.y == 600:
        apple.x = random.randint(0, (800-20))
        apple.y = 0

    if apple.colliderect(basket):
        apple.x = random.randint(0, (800-20))
        apple.y = 0
        count+=1
        print("Score: ", count )


    apple = apple.move(0,fall)


    screen.fill((0,0,0))

    applecol = pygame.Surface((apple.w , apple. h))
    applecol.fill((255,0,0))
    bascol = pygame.Surface((basket.w, basket.h))
    bascol.fill((255, 255, 255))
    screen.blit(bascol, (basket.x, basket.y))
    screen.blit(applecol, (apple.x, apple.y))

    pygame.display.flip()


    clock.tick(60)