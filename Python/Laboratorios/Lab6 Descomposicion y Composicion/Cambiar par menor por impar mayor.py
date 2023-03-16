nsbe=int(input("Introduzca nsbe: "))
ysbe=0; posbe=1; m1sbe=0; m2sbe=9; xsbe=nsbe
while nsbe!=0:
    dsbe=nsbe%10
    nsbe=nsbe//10
    if dsbe%2==0:
        if dsbe<m2sbe:
            m2sbe=dsbe
    else:
        if dsbe>m1sbe:
            m1sbe=dsbe
while xsbe!=0:
    dsbe=xsbe%10
    xsbe=xsbe//10
    if dsbe%2==0:
        if dsbe==m2sbe:
            dsbe=m1sbe
    else:
        if dsbe==m1sbe:
            dsbe=m2sbe
    ysbe=dsbe*posbe+ysbe
    posbe=posbe*10
print(" = ", ysbe)