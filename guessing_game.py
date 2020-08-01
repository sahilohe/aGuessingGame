import random # imports randome to generate some random numbers

number = random.randint(1, 10) # our secret number, ranges from 1 to 10
count = 0 # the count, max three times
#print(number) # you can change if you want to see the secret number

while count < 3 :
    ask = int(input("Guess : "))
    count += 1
    if ask == number :
        print("\nYou got that right!\n")
        break
        
else:
    print("\nYou failed")
    
