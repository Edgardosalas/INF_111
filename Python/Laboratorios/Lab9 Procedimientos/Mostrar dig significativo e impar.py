import math
def masmenossbe(wsbe):
    global massbe; global mensbe
    w1sbe=wsbe; swsbe=0
    while wsbe!=0 and swsbe!=1:
        dsbe=wsbe%10
        wsbe=wsbe//10
        if dsbe%2==1:
            mensbe=dsbe
            swsbe=1
    wsbe=w1sbe; swsbe=0
    while wsbe!=0 and swsbe!=1:
        cdsbe=int(math.log10(wsbe))+1
        dsbe=wsbe//10**(cdsbe-1)
        wsbe=wsbe%10**(cdsbe-1)
        if dsbe%2==0:
            massbe=dsbe
            swsbe=1
    return

nsbe=int(input("Introduce nsbe: "))
for isbe in range(nsbe):
    xsbe=int(input("Introduce xsbe: "))
    masmenossbe(xsbe)
    parsbe=massbe; imparsbe=mensbe
    print("\n", parsbe, ", ", imparsbe)