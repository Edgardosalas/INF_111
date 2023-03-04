nse=int(input("Introduce nse: "))
tse=1; pse=1; kse=0
for ise in range(1,nse+1):
    kse=kse+tse
    print(kse, end=", ")
    pse=pse+1
    if pse>tse:
        tse=tse+1
        pse=1