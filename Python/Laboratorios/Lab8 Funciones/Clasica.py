def clasicasbe(wsbe):
    tsbe=1; psbe=1
    for isbe in range(wsbe):
        ksbe=tsbe
        psbe=psbe+1
        if psbe>tsbe:
            tsbe=tsbe+1
            psbe=1
    return ksbe

nsbe=int(input("Introduce nsbe: "))
ssbe=0
for isbe in range(1, nsbe+1):
    ssbe=ssbe+clasicasbe(isbe)
    print(clasicasbe(isbe), end=" + ")
print("=", ssbe)