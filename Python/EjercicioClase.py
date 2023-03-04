#Ejercicio clase
a=int(input("introduce un numero "))
b=int(input("introduce un numero "))
c=int(input("introduce un numero "))
if a>b:
    n1=a
    m1=b
else:
    n1=b
    m1=a
if n1>c:
    M=n1
    m2=c
else:
    M=c
    m2=n1
if m2>m1:
    Med=m2
    Men=m1
else:
    Med=m1
    Men=m2
print(M,Med,Men)