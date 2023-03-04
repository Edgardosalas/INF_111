nse=int(input("introduzca nse: "))
ase=int(input("introduzca ase: "))
bse=int(input("introduzca bse: "))
tse=ase; pse=1; zse=ase+bse
for ise in range (1, nse+1):
    print(tse, end=(","))
    pse=pse+1
    if pse>tse:
        tse=zse-tse
        pse=1