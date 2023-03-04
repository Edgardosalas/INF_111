nse=int(input("Introduce nse: "))
xse=int(input("Introduce xse: "))
sse=0; tse=1; pse=1
for ise in range(nse):
    sse=sse+xse**tse
    print(xse,"^",tse,end=" + ")
    pse=pse+1
    if pse>tse:
        tse=tse+1; pse=1
print("=",sse)