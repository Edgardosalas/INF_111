import math
n=int(input("introduzca n: "))
k=int(input("introduzca k: "))
cd=int(math.log10(n)+1)
d=0; z=0
y=0; c=0; po=1; g=0
while n!=0:
    if c==k:
        g=y*po+g
        po=po*(10**(k))
        c=0
        y=0
        z=n
    else:
        d=n%10
        n=n//10
        y=y*10+d
        c=c+1
if cd%k==0:
    g=y*po+g
    po=po*(10**(k))
else:
    cdz=int(math.log10(z)+1)
    g=z*(10**(cd-cdz))+g
print(g)