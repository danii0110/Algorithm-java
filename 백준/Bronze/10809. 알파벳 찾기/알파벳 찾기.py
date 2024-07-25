s = input()
alphabets = list('abcdefghijklmnopqrstuvwxyz')
res = [-1] * 26
for i in alphabets:
    if i in s:
        res[ord(i) - ord('a')] = s.find(i)
print(' '.join(map(str, res)))