n=int(input("introduce n:" ))
x=int(input("introduce x:" ))
s=0
t=1; p=1; sig=1
k=2; pp=2; c=0; u=pp
for i in range (1,n+1):
    s=s+(x**t)/pp
    print(pp, end=" ")
    #print(x,"^",t , "/",u , end=(" + "))
    t=t+sig
    p=p+1
    if p>2:
        sig=sig*(-1)
        p=1
    while pp%k!=0 and k<=pp//2:
        k=k+1
    if k<=pp//2:
        pp=pp+2
    else:
        pp
    k=2
print("=", s)
