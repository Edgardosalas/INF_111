def factosbe(wsbe):
    fsbe=1
    for isbe in range(1,wsbe+1):
        fsbe=fsbe*isbe
    return fsbe

def sumasbe(wsbe):
    ssbe=0
    for isbe in range(1,wsbe+1):
        ssbe=ssbe+isbe
    return ssbe

nsbe=int(input("Introduce nsbe: "))
for isbe in range(nsbe):
    xsbe=int(input("Introduce xsbe: "))
    while xsbe!=0:
        dsbe=xsbe%10
        xsbe=xsbe//10
        if dsbe%2==0:
            fsbe=factosbe(dsbe)
            print(fsbe)
        else:
            ssbe=sumasbe(dsbe)
            print(ssbe)