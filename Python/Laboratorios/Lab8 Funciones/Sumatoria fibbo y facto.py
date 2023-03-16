def factosbe(wsbe):
    fsbe=1
    for isbe in range(1,wsbe+1):
        fsbe=fsbe*isbe
    return isbe

def fibosbe(wsbe):
    asbe=-1; bsbe=1
    for isbe in range(wsbe):
        dsbe=asbe+bsbe; asbe=bsbe; bsbe=dsbe
    return dsbe

nsbe=int(input("Introduce nsbe: "))
xsbe=int(input("Introduce xsbe: "))
ssbe=0; sigsbe=1
for isbe in range(1,nsbe+1):
    ssbe=ssbe+sigsbe*(xsbe**fibosbe(isbe)/factosbe(isbe))
    print("", sigsbe, "*", xsbe, "^", fibosbe(isbe), "/", isbe, "!", end="+")
    if isbe%2==0:
        sigsbe=sigsbe*(-1)
print("=", ssbe)