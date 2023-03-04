nse=int(input("Introduce nse: "))
xse=int(input("Introduce xse: "))
sse=0; ase=-1; bse=1; tse=ase+bse; sigse=1
for ise in range(nse):
    sse=sse+sigse*(xse**tse/((ise+1)*2))
    print(sigse,"*",xse,"^",tse,"/",(ise+1)*2, end=" + ")
    ase=bse; bse=tse; tse=ase+bse
    if (ise+1)%2==0:
        sigse=sigse*(-1)
print("=",sse) 