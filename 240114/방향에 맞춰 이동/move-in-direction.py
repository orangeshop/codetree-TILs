n = int(input())

x = 0
y = 0



for _ in range(n):
    tmp = input().split()

    if(tmp[0] == "N"):
        y += int(tmp[1])
    if(tmp[0] == "E"):
        x += int(tmp[1])
    if(tmp[0] == "S"):
        y -= int(tmp[1])
    if(tmp[0] == "W"):
        x -= int(tmp[1])
    
print(f"{x} {y}")