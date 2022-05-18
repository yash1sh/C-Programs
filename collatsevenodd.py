def collatz(number):
    n=0
    if (number%2)==0:
        n=number//2
        print(n)
        if n==1:
            return None
        else:
            collatz(n)
    else:   
        n=3*number+1
        print(n)
        if n==1:
            return None
        else:
            collatz(n)
num=int(input("enter the number"))
collatz(num)





