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

def sgtevocsbe(bsbe):
    elesbe=len(bsbe)
    wsbe=""
    for isbe in range(1, elesbe+1):
        ysbe=bsbe[isbe-1:isbe]
        if ysbe=="a":
            ysbe="e"
        elif ysbe=="e":
            ysbe="i"
        elif ysbe=="i":
            ysbe="o"
        elif ysbe=="o":
            ysbe="u"
        elif ysbe=="u":
            ysbe="a"
        wsbe=wsbe+ysbe
    return wsbe

bsbe=input("introduce la frase: ")
cpsbe=contrapalsbe(bsbe)
wsbe=""
for isbe in range(1,cpsbe+1):
    vsbe=sacarpalsbe(bsbe,isbe)
    if isbe==1 or isbe==cpsbe:
        vsbe=sgtevocsbe(vsbe)
    wsbe=wsbe+vsbe+" "
print("\n Nueva; ", wsbe)