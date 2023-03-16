n=int(input("introduce n "))
a=int(input("introduce a "))
b=int(input("introduce b "))
sig=1
t=a; p=1; c=((b-a)*2)+1; c1=1; m=(b-a)
for i in range(1,n+1):
    print(t, end=(" "))
    c1=c1+1
    t=t+sig
    p=p+1
    if c1>c:
        t=a; p=1; sig=1; c1=1; c=c+2
    else:
        if p>m:
            sig=sig*(-1); p=1
        if t==a:
            m=m+1