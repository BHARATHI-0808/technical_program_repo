class insertion_sort:
    def sort(self,arr):
        for i in range(1,len(arr)):
            j=i
            while j>0:
                if arr[j]<arr[j-1]:
                    temp = arr[j]
                    arr[j]=arr[j-1]
                    arr[j-1]=temp
                else:
                    break
                j-=1
        print(arr)

arr=[8,3,5,1,9,2]
a = insertion_sort();
a.sort(arr)