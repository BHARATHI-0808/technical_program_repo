
def ElementIndexOf(arr,target):
    for i in range(len(arr)):
        if(arr[i]==target):
            return i
    return -1
arr=list(map(int,input("enter the array with separated space : ").split()))
target_value = int(input("enter the target value : "))
if(ElementIndexOf(arr,target_value)!=-1):
    print(f"element found at {ElementIndexOf(arr,target_value)} index")
else:
    print("element not found ...")