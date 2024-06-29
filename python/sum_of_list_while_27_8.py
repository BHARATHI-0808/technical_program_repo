def SumOfList(a):
    sum=0
    n=len(a)
    while(n>0):
        sum+=a[n-1]
        n=n-1
    return sum
a=[1,2,3,4,5]
print("sum =",SumOfList(a))