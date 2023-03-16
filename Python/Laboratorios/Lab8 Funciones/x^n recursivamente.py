def exposbe(xsbe,nsbe):
    if nsbe==0:
        return 1
    else:
        return (xsbe*exposbe(xsbe,nsbe-1))
    
nsbe=int(input("Introduce nsbe: "))
xsbe=int(input("Introduce xsbe: "))
esbe=exposbe(xsbe,nsbe)
print("", xsbe, "^", nsbe, "=", esbe)