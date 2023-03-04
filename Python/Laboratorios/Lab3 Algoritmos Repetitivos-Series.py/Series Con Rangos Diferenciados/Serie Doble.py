nse=int(input("Introduce nse: "))
ase=-1; bse=1; tse=ase+bse; tse2=1; pse2=1
for ise in range(1,nse+1):
    if ise%2==0:
        print(tse2,end=" ,")
        pse2=pse2+1
        if pse2>tse2:
            tse2=tse2+1; pse2=1
    else:
        print(tse, end=", ")
        ase=bse; bse=tse
        tse=ase+bse