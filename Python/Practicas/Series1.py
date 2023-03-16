n=int(input("introduce n:" ))
x=int(input("introduce x:" ))
s=0
t=1; p=1; sig=1
k=2; pp=2; u=2; c=0; sw=1
for i in range (1,n+1):
    s=s+(x**t)/pp
    print(pp, end=" ")
    #print(x,"^",t , "/",h , end=(" + "))
    t=t+sig
    p=p+1
    if p>2:
        sig=sig*(-1)
        p=1
    while sw == 1:
        if pp%k!=0 and k<=pp//2:
            k=k+1
        else:
            if k>pp//2:
                sw=0
print("=", s)