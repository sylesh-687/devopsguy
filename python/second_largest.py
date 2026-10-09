
def second_largest(alist):
    first=second=None
    for n in alist:
        if first is None or n > first:
            first, second=n, first
        elif n !=first and (second is None or n> second):
            second=n
    return second

def main():
  x=[22,44,22,33,22,55,33,44,11]
  second=second_largest(x)
  print(second)

if __name__=="__main__":
  main()
