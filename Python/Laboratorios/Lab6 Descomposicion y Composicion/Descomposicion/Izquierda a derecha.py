import math
nsbe=int(input("Introducir nbse: "))
cdsbe=int(math.log10(nsbe))+1
print("cdsbe=", cdsbe)
while nsbe!=0:
    dsbe=nsbe//10**(cdsbe-1)
    nsbe=nsbe%10**(cdsbe-1)
    cdsbe=cdsbe-1
    print("dsbe=", dsbe)
