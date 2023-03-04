nse=int(input("Introduce nse: "))
xse=int(input("Introduce xse: "))
sse=0; ase=-1; bse=1; tse=ase+bse; pse=1; tse2=2
for ise in range(nse):
    sse=sse+xse**tse/tse2
    print(xse,"^",tse,"/",tse2,end=" + ")
    ase=bse; bse=tse; tse=ase+bse
    pse=pse+1
    if pse>tse2:
        tse2=tse2+2; p=1
print("=",sse)