n=int(input("introduce n: " ))
x=int(input("introduce x: " ))
s=0
#Sube y baja
t=1; p=1; sig=1
#Primos
a=2; pp=2; sw=1
for i in range (1,n+1):
    s=s+(x**t)/pp
    print(x,"^",t , "/",pp , end=(" + "))
    t=t+sig
    p=p+1
    if p>2:
        sig=sig*(-1)
        p=1
    sw=1
    while sw==1:
            if pp%a!=0 and a<=(pp//2):
                a=a+1
            else:
                if (pp//2)<a:
                    sw==0
                a=2
                pp=pp+1
print(s)