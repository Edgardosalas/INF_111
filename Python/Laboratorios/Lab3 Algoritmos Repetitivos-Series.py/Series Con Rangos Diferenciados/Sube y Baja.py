nse=int(input("introduzca nse: "))
tse=1; pse=1; sigse=1
for ise in range(1,nse+1):
    print(tse, end=",")
    tse=tse+sigse
    pse=pse+1
    if pse>4:
        sigse=sigse*(-1)
        pse=1