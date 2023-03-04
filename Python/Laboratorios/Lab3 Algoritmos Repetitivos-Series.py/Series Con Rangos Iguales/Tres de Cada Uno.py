nse=int(input("introduzca nse: "))
kse=int(input("introduzca kse: "))
ase=int(input("introduzca ase: "))
bse=int(input("introduzca bse: "))
tse=ase; cse=ase+bse
for ise in range(1,nse+1):
    print(tse, end=(" "))
    if ise%kse==0:
        tse=cse-tse