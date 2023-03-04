#ejercicio N2
a=int(input("introduce un numero "))
b=int(input("introduce un numero "))
c=int(input("introduce un numero "))
d=int(input("introduce un numero "))
e=int(input("introduce un numero "))
if a>b:
    P1=a   
    S1=b
else:
    P1=b   
    S1=a
if c>d:
    P2=c   
    S2=d
else:
    P2=d  
    S2=c
if P1>P2:
    P3=P1  
    S3=P2
else:
    P3=P2  
    S3=P1
if S1>S2:
    S4=S1
else:
    S4=S2
if P3>e:
    S5=e
else:
    S5=P3
if S4>S3:
    S6=S4
else:
    S6=S3
if S5>S6:
    SM=S5
else:
    SM=S6
print("El segundo mayor es: ", SM)