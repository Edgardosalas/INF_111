n=int(input("introduce n: "))
x=int(input("introduce x: "))
s=0
a=-1; b=1; t=b+a
a2=3; b2=5; k=3; t2=a2; c=a2+b2
sig=1; cs=1
for i in range(n):
    u=i+1
    if i%k==0:
        t2=c-t2
    s=s+sig*((x**t)/t2)
    print(sig, "*", x, "^", t, "/", t2, "=",s)
    a=b; b=t
    t=a+b
    if u%cs==0:
        sig=sig*(-1)
        cs=u
print("=",s)