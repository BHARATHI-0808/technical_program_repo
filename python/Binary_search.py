

arr = list(map(int, input("Enter the array with separated space: ").split()))

def sort(arr):
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)): 
            if arr[i] > arr[j]: 
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
    return arr

def indexof(arr, target_val):
    low = 0
    high = len(arr) - 1 
    while low <= high:  
        mid = (low + high) // 2
        if arr[mid] == target_val:
            return mid  
        elif arr[mid] < target_val:
            low = mid + 1
        else:
            high = mid - 1 
    return -1 

arr = sort(arr)
print("Sorted array:", arr)

target_val = int(input("Enter the target value: "))
result = indexof(arr, target_val)

if result != -1:
    print("Value found at index:", result)
else:
    print("Value not found in the array.")
