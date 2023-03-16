nsbe=int(input("Introduce nsbe: "))
csbe=0; ysbe=0; posbe=1
while nsbe!=0:
    dsbe=nsbe%10
    nsbe=nsbe//10
    csbe=csbe+1
    if csbe!=4:
        ysbe=dsbe*posbe+ysbe
        posbe=posbe*10
print("ysbe=", ysbe)