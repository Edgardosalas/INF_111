n=int(input())
a=1
b=0
t=(a+b)
a1=1
for i in range(1,n+1):
    if(i%2==0):
        print(t, end=" ")
        a=b
        b=t
        t=a+b
    else:
        print(a1, end=" ")
        a1=a1+1