import math
def centrosbe(wsbe):
    cdsbe=int(math.log10(wsbe))+1
    psbe=cdsbe//2
    ksbe=1
    if cdsbe%2==0:
        psbe=psbe-1
        ksbe=2
    wsbe=wsbe//10**psbe
    ysbe=wsbe%10**ksbe
    return ysbe
def cambiosbe(wsbe,xsbe):
    cdsbe=int(math.log10(wsbe))+1
    cd1sbe=int(math.log10(xsbe))+1
    psbe=cdsbe//2; ksbe=1
    if cdsbe%2==0:
        psbe=psbe-1
        ksbe=2
    asbe=wsbe%10**psbe
    wsbe=int(wsbe/10**(psbe+ksbe))
    wsbe=(wsbe*10**cd1sbe)+xsbe
    ysbe=(wsbe*10**psbe)+asbe
    return ysbe

nsbe=int(input("Introduce el numero: "))
for isbe in range(1,nsbe+1):
    xsbe=int(input("introduce xsbe: "))
    if isbe==1:
        x1sbe=xsbe
        psbe=centrosbe(xsbe)
    else:
        p1sbe=centrosbe(xsbe)
        ysbe=cambiosbe(xsbe,psbe)
        print(ysbe)
        psbe=p1sbe
ysbe=cambiosbe(x1sbe,psbe)
print(ysbe)