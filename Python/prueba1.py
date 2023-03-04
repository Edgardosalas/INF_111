n=int(input())
a=-1
b=1
t=(a+b)
for i in range(1,n+1):
        print(t)
        a=b
        b=t
        t=a+b