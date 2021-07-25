from random import shuffle
def shuffle_list(mylist):
    shuffle(mylist)
    return mylist
mylist = ['','O','']
shuffle_list(mylist)
def player_guess():
    guess =''
    while guess not in ['0','1','2']:
        guess = input('Pick a number 0,1,or 2:\n')
    return int(guess)
def check_guess(mylist,guess):
    if mylist[guess] == 'O':
        print("Correct!")
    else:
        print('Wrong!')
        print(mylist)
#Initial list
mylist = ['','O','']
#Shuffle list
mixedup_list = shuffle_list(mylist)
#Userguess
guess = player_guess()
#check guess
check_guess(mixedup_list,guess)