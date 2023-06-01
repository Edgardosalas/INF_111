k=int(input())
S=str(input())
ele=len(S)
w=""
for i in range(1,ele+1):
    y=S[i-1:i]
    if y!=" ":
        y=ord(y)
        if (y<96):
            y=y+32
        if (y-k)>=97:
            y=y-k
            y=chr(y)
            w=w+y
        else:
            y=122-(y-97)
            y=chr(y)
            w=w+y
    else:
        y=y+" "    
print (w)