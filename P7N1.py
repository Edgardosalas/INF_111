n=int(input("Introduzca n: "))
sw=1; sig=1; t=1; p=1
for i in range(1, n+1):
    x=int(input("Introduzca x: "))
    if x==t:
        print(x)
        t=t+sig
        p=p+1
    if p==3:
        sig=sig*(-1)
        p=1
    