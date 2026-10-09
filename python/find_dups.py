def find_dups(alist):
  unique, dups=[],[]
  for item in alist:
    if item in unique:
      dups.append(item)
    else:
      unique.append(item)
  return dups

def main():
  x=[22,44,22,33,22,55,33,44,11]
  dups=find_dups(x)
  print(dups)

if __name__=="__main__":
  main()
