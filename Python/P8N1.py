import math
def desi(w):
    cd=int(math.log10(w)+1)
    if cd%2==0:
        p=(cd//2)-1
        k=2
    else:
        p=cd//2
        k=1
    b=w%10**p
    w=w/10**p
    a=w//10**k
    return a

def desd(w):
    cd=int(math.log10(w)+1)
    if cd%2==0:
        p=(cd//2)-1
        k=2
    else:
        p=cd//2
        k=1
    b=w%10**p
    return b

def numcen(w):
    cd=int(math.log10(w)+1)
    if cd%2==0:
        p=(cd//2)-1
        k=2
    else:
        p=cd//2
        k=1
    b=w%10**p
    w=w/10**p
    c=w%10**k
    return int(c)
    
    
n=int(input("Introduzca n: "))
co=1
for i in range(1,n+1):
    x=int(input("Ingrese x: "))
    cd=int(math.log10(x)+1)
    if cd%2==0:
        p=(cd//2)-1
        k=2
    else:
        p=cd//2
        k=1
    if co==1:
        c=desi(x)*(10**p)+numcen(n)*(10**k)+desd(x)
        co=co+1
        y=x
    else:
        if int(math.log10(numcen(h))+1)==2:
            c=desi(x)*(10**(p+2))+numcen(h)*(10**(p))+desd(x)
            print(c)
        else:
            c=desi(x)*(10**(p+1))+numcen(h)*(10**(p))+desd(x)
            print(c)
    h=x
cd=int(math.log10(y)+1)
if cd%2==0:
    p=(cd//2)-1
    k=2
else:
    p=cd//2
    k=1
if int(math.log10(numcen(h))+1)==2:
    c=desi(y)*(10**(p+2))+numcen(h)*(10**(p))+desd(y)
else:
    c=desi(y)*(10**(p+1))+numcen(h)*(10**(p))+desd(y)
print(c)