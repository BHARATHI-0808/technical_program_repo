class bubble_sort:
    def bubble(self,a):
        for i in range(0,len(a)-1):
            for j in range(0,len(a)-i-1):
                if(a[j]>a[j+1]):
                    temp = a[j]
                    a[j]=a[j+1]
                    a[j+1]=temp
        return a


c = bubble_sort()
a=[2,41,3,7,1,8,4]
print(c.bubble(a))