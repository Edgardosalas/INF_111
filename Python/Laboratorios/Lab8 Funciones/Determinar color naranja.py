def jugarsbe(intentosbe=1):
    respuestasbe=input("¿De que color es una naranja? ")
    if respuestasbe!="naranja":
        if intentosbe<3:
            print("\n Fallaste! Intentalo de buevo")
            intentosbe += 1
            jugarsbe(intentosbe)
        else:
            print("\nPerdiste!")
    else:
        print("\nGanaste!")
jugarsbe()