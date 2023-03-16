bsbe=input("Introduce la frase: ")
elesbe=len(bsbe)
wsbe=""
for isbe in range(1, elesbe+1):
    ysbe=bsbe[isbe-1:isbe]
    if ysbe!=" ":
        asbe=ord(ysbe)
        a1sbe=asbe+32
        xsbe=chr(a1sbe)
        ysbe=""; ysbe=ysbe+xsbe
    wsbe=wsbe+ysbe
print("\n ", wsbe)