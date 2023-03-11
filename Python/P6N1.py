import math
n=int(input("Introduzca n: "))
cd=int(math.log10(n)+1)
p=0; y=0; po=1
if cd%2==0:
    while n!=0:
        d=n%10
        n=n//10
        p=p+1
        if p==(cd//2):
            d=n%10
            n=n//10
            p=p+2
        else:
            y=d*po+y
            po=po*10
else:
    while n!=0:
        d=n%10
        n=n//10
        p=p+1
        if p==((cd//2)+1):
            d=n%1
            n=n//1
            p=p+1
        else:
            y=d*po+y
            po=po*10
print(y)
