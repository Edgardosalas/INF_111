import math

nsbe=int(input("Introduce nsbe: "))
cdsbe=int(math.log10(nsbe))+1

if cdsbe%2==0:
    psbe=(cdsbe//2)-1
else:
    psbe=cdsbe//2
bsbe=nsbe%10**psbe
nsbe= nsbe//10**psbe
if cdsbe%2==0:
    csbe=nsbe%100
    asbe=nsbe//100
    d1sbe=csbe//10
    d2sbe=csbe%10
else:
    csbe=nsbe%10
    asbe=nsbe//10
    d1sbe=csbe
    d2sbe=csbe
ysbe=(d1sbe*10**psbe+asbe)*10**psbe+bsbe
ysbe=ysbe*10+d2sbe
print(ysbe)