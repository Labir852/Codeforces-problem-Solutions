w = input()
t= input()
def my_function(x):
  return x[::-1]
rev = my_function(w)
if rev == t :
    print("YES")
else:
    print("NO")