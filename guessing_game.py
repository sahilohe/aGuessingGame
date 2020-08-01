import random

number = random.randint(1, 10) # our secret number
count = 0 # the count, max three times
#print(number)

while count < 3 :
    ask = int(input("Guess : "))
    count += 1
    if ask == number :
        print("\nYou got that right!\n")
        break
        
else:
    print("\nYou failed")
    
