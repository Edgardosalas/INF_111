def Contra(w):
    # Comprobar que la entrada tiene al menos 6 caracteres
    if len(w) < 6:
        return False
    # Comprobar que la entrada contiene al menos una letra y un número
    l = False
    num = False
    for i in w:
        if i.isalpha():
            l = True
        elif i.isnumeric():
            num = True
    return l and num

n=input("Introduzca ")
print(Contra(n))