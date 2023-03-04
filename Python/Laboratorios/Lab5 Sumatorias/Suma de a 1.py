nse=int(input("Introduce nse: "))
sse=0
for ise in range(nse):
    sse=sse+(ise+1)
    print(ise+1,end="+")
print(" = ",sse)