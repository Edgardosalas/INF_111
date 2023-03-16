n=int(input("introduce n : "))
a=int(input("introduce a : "))
b=int(input("introduce b : "))
t=a; p=1; sig=1; m=(b-a)
for i in range (1, n+1):
    print(t, end=", ")
    t=t+sig
    p=p+1
    if p>m:
        sig=sig*(-1)
        p=1
    if t==a:
        m=m+1