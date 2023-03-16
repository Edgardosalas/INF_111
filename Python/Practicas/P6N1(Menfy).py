import math
n=int(input("Introduzca n: "))
cd=int(math.log10(n)+1)
if cd%2==0:
    p=(cd//2)-1
    k=2
else:
    p=cd//2
    k=1
b=n%10**p
n=n//(10**p)
a=n//10**k
c=(a*10**p)+b
print(c)