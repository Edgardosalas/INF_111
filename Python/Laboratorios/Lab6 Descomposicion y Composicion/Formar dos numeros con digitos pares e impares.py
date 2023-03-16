import math
nsbe=int(input("Introduce nsbe: "))
cdsbe=int(math.log10(nsbe))+1
asbe=0; bsbe=0
while nsbe!=0:
    dsbe=nsbe//10**(cdsbe-1)
    nsbe=nsbe%10**(cdsbe-1)
    cdsbe=cdsbe-1
    if dsbe%2==0:
        asbe=asbe*10+dsbe
    else:
        bsbe=bsbe*10+dsbe
print("asbe=", asbe, "bsbe=", bsbe)