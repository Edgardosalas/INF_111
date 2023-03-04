nse=int(input("introduzca nse: "))
kse=int(input("introduzca kse: "))
tse=0
for ise in range(1,nse+1):
    print(tse,end=" ")
    if ise%kse==0:
        tse=1-tse