def MoverTorresbe(alturasbe, origensbe, destinosbe, intermediosbe):
    if alturasbe>=1:
        MoverTorresbe(alturasbe-1, origensbe, intermediosbe, destinosbe)
        MoverDiscosbe(origensbe, destinosbe)
        MoverTorresbe(alturasbe-1, intermediosbe, destinosbe, origensbe)

def MoverDiscosbe(desdesbe, haciasbe):
    print("mover disco de", desdesbe, "a", haciasbe)
    
MoverTorresbe(3,"A","B","C")