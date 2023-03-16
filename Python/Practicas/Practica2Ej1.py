n=int(input("ingrese un numero de 8 digitos"))
a=n//10000000
b=n//100000
b=b%100
c=n//10000
c=c%10
d=n//1000
d=d%10
e=n//10
e=e%100
f=n%10
Num=c*10000000+b*100000+a*10000+f*1000+e*10+d
print(Num)
