nsbe=int(input("Introduce nsbe: "))
maysbe=0; mensbe=9
while nsbe!=0:
    dsbe=nsbe%10
    nsbe=nsbe//10
    if dsbe>maysbe:
        maysbe=dsbe
    if dsbe<mensbe:
        mensbe=dsbe
print("maysbe=", maysbe, "mensbe=", mensbe)