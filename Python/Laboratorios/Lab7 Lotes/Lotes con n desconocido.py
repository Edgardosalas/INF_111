asbe=-1; bsbe=1; dsbe=asbe+bsbe
xsbe=int(input("Introduce xsbe: "))
while xsbe!=-1:
    if xsbe==dsbe:
        print(xsbe)
        asbe=bsbe; bsbe=dsbe; dsbe=asbe+bsbe
    xsbe=int(input("Introduce xsbe: "))