def esvocalsbe(wsbe):
    ksbe=0
    if wsbe=="a" or wsbe=="e" or wsbe=="i" or wsbe=="o" or wsbe=="u":
        ksbe=1
    return ksbe
def contrapalsbe(bsbe):
    bsbe=bsbe+" "
    csbe=0
    elesbe=len(bsbe)
    for isbe in range(1, elesbe+1):
        ysbe=bsbe[isbe-1:isbe]
        if ysbe== " ":
            csbe=csbe+1
    return csbe
def sacarpalsbe(bsbe, ksbe):
    bsbe=bsbe+" "
    csbe=0; wsbe=""; vsbe=""
    elesbe=len(bsbe)
    for isbe in range(1, elesbe+1):
        ysbe=bsbe[isbe-1:isbe]
        if ysbe==" ":
            csbe=csbe+1
            if csbe==ksbe:
                wsbe=vsbe
            vsbe=""
        else:
            vsbe=vsbe+ysbe
    return wsbe
def contravocsbe(wsbe):
    csbe=0
    elesbe=len(wsbe)
    for isbe in range(1,elesbe+1):
        ysbe=wsbe[isbe-1:isbe]
        if esvocalsbe(ysbe)==1:
            csbe=csbe+1
    return csbe
def elivocsbe(wsbe,ksbe):
    csbe=0; vsbe=""
    elesbe=len(wsbe)
    for isbe in range(1, elesbe+1):
        ysbe=wsbe[isbe-1:isbe]
        if esvocalsbe(ysbe)==1:
            csbe=csbe+1
            if csbe==ksbe:
                ysbe=""
        vsbe=vsbe+ysbe
    return vsbe

bsbe=input("Introduce la frase: ")
ksbe=int(input("Introduce k: "))
cpsbe=contrapalsbe(bsbe)
wsbe=""
for isbe in range(1,cpsbe+1):
    palsbe=sacarpalsbe(bsbe,isbe)
    if isbe==ksbe:
        cvsbe=contravocsbe(palsbe)
        palsbe=elivocsbe(palsbe,cvsbe)
        palsbe=elivocsbe(palsbe,1)
    wsbe=wsbe+palsbe+ " "
print("\n Nueva; ", wsbe)