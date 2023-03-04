nse=int(input("introduzca nse: "))
kse=int(input("introduzca kse: "))
if nse==kse:
    ase=kse*2
    bse=ase+kse
else:
    if nse<kse:
        ase=kse
        bse=ase+kse
    else:
        if nse%kse==0:
            ase=nse-kse
            bse=nse+kse
        else:
            rse=nse%kse
            ase=nse-rse
            bse=ase+kse
print(ase,bse)