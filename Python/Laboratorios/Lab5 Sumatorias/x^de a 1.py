nse=int(input("Introduce nse: "))
xse=int(input("Introduce xse: "))
sse=0
for ise in range(nse):
    sse=sse+xse**(ise+1)
    print(xse,"^", ise+1,end=" + ")
print(" = ",sse)