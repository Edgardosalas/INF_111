n=int(input("introduce n "))
#l=int(input("introduce l"))
#k=int(input("introduce k"))
sig=1
t=1; p=1; c=5; c1=1
for i in range(1,n+1):
    print(t, end=(" "))
    c1=c1+1
    t=t+sig
    p=p+1
    if c1>c:
        t=1; p=1; sig=1; c1=1
    else:
        if p>2:
            sig=sig*(-1); p=1