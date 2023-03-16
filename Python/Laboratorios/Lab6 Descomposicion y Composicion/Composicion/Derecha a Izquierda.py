nsbe=int(input("Introduce nsbe: "))
ysbe=0; posbe=1
for isbe in range(nsbe):
    dsbe=int(input("Introduce dsbe: "))
    ysbe=dsbe*posbe+ysbe
    posbe=posbe*10
print("ysbe=", ysbe)