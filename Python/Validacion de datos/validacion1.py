#validacion del usuario
def ususario(w):
    l=len(w)
    if l>=1:
        for i in range (1, l):
            a=w[i-1:i]
            if a==" ":
                s=False
                return s
            else:
                s=True
    else:
            s=False
    return s
#Validacion de contraseña
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