nse=int(input("introduzca nse: "))
ase=-1; bse=1; tse=ase+bse
for ise in range(1,nse+1):
    print (tse, end=", ")
    ase=bse; bse=tse
    tse=ase+bse