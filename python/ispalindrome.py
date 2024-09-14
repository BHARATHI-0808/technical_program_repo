def is_palindrome(str1):
    str2=str1[::-1]
    if(str2==str1):
        return True
    return False
str1=input("enter the string: ")

if(is_palindrome(str1)):
    print(str1," is palindrome")
else:
    print(str1," is not palindrome")