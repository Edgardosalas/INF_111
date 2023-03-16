def factosbe(nsbe):
    if nsbe==0:
        return 1
    else:
        return(nsbe*factosbe(nsbe-1))
    
nsbe=int(input("Introduce nsbe: "))
fsbe=factosbe(nsbe)
print("el facto de ", nsbe, " es ", fsbe)