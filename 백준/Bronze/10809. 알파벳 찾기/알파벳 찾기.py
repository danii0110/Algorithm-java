s = input()
alphabets = list('abcdefghijklmnopqrstuvwxyz')
res = [-1] * 26

for j, i in enumerate(alphabets):
    if i in s:
        res[j] = s.find(i)
print(' '.join(map(str, res)))