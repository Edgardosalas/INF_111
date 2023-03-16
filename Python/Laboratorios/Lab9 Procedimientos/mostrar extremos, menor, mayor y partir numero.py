import math
def exotresbe(wsbe):
    global e1sbe; global e2sbe
    e2sbe=wsbe%10
    cdsbe=int(math.log10(wsbe))+1
    e1sbe=wsbe//10**(cdsbe-1)
    return
def menmasbe(wsbe):
    global m1sbe; global m2sbe
    m1sbe=9; m2sbe=0
    while wsbe!=0:
        dsbe=wsbe%10
        wsbe=wsbe//10
        if dsbe>m2sbe:
            m2sbe=dsbe
        if dsbe<m1sbe:
            m1sbe=dsbe
    return
def partirsbe(wsbe):
    global p1sbe; global p2sbe; global cesbe
    cdsbe=int(math.log10(wsbe))+1
    psbe=cdsbe//2
    cesbe=0
    p2sbe=wsbe%10**psbe
    p1sbe=wsbe//10**psbe
    if cdsbe%2!=0:
        cesbe=p1sbe%10
        p1sbe=p1sbe//10
    return

nsbe=int(input("introduce nsbe: "))
for isbe in range(nsbe):
    xsbe=int(input("Itroduce xsbe: "))
    exotresbe(xsbe)
    exisbe=e1sbe; exdsbe=e2sbe
    menmasbe(xsbe)
    dmnsbe=m1sbe; dmysbe=m2sbe
    partirsbe(xsbe)
    parisbe=p1sbe; pardsbe=p2sbe; censbe=cesbe
    print("\n", exisbe, ", ", exdsbe)
    print("\n", dmnsbe, ", ", dmysbe)
    print("\n", parisbe, ", ", pardsbe, ", ", censbe)