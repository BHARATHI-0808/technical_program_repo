num=[5,3,7,1,8,9,2]

for i in range(len(num)):
    min=num[i]
    index=i
    j=i+1
    while(j<len(num)):
        if(num[j]<min):
            min=num[j]
            index=j
        j+=1
    if(index!=i):
        temp=num[i]
        num[i]=num[index]
        num[index]=temp

print(num)