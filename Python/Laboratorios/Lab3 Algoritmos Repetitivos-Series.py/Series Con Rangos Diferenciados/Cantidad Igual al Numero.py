nse=int(input("introduzca nse: "))
tse=1; pse=1
for ise in range(1, nse+1):
    print(tse, end=(","))
    pse=pse+1
    if pse>tse:
        tse=tse+1
        pse=1