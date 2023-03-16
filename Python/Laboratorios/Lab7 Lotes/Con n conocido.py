nsbe=int(input("Introducir nsbe: "))
psbe=1; swsbe=0; ssbe=0
for isbe in range(1,nsbe+1):
    xsbe=int(input("Introducir xsbe: "))
    if swsbe==0:
        ksbe=xsbe; psbe=1
        ssbe=0; swsbe=1
    else:
        ssbe=ssbe+xsbe; psbe=psbe+1
        if psbe>ksbe:
            print(ssbe)
            swsbe=0