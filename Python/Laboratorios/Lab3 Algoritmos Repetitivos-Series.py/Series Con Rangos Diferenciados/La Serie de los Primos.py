nse=int(input("Introduce nse: "))
cse=0; kse=2; pse=2
while cse<=nse:
    if pse%kse!=0 and kse<=pse//2:
        kse=kse+1
    else:
        if kse>pse//2:
            print(pse, end=", ")
            cse=cse+1
        pse=pse+1
        kse=2