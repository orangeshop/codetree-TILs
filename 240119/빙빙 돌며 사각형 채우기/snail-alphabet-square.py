from collections import deque

n,m = map(int, input().split())

board = [["" for _ in range(m)] for _ in range(n)]

alphabet = ["A"
            , "B"
            , "C"
            , "D"
            , "E"
            , "F"
            , "G"
            , "H"
            , "I"
            , "J"
            , "K"
            , "L"
            , "M"
            , "N"
            , "O"
            , "P"
            , "Q"
            , "R"
            , "S"
            , "T"
            , "U", "V", "W", "X", "Y", "Z"]


dx = [0,1,0,-1]
dy = [1,0,-1,0]


# 0,0 0,1 0,2
# 1,0 1,1 1,2
# 2,0 2,1 2,2

Q = deque([])
vis = [[False for _ in range(m)] for _ in range(n)]
Q.append([0,0])
vis[0][0] = True
board[0][0] = alphabet[0]
cnt = 1;
now_dir = 0
out = 0
while(len(Q) != 0):
    if(out > 2 * n * m):
        break
    cur = Q.popleft()
    # print(cur)
    # print(vis)
    nx = cur[0] + dx[now_dir]
    ny = cur[1] + dy[now_dir]

    if(nx < 0 or  nx >= n or ny < 0 or ny >= m or vis[nx][ny] == True):
        now_dir+=1
        if(now_dir >= 4):
            now_dir = 0
        
        out+=1
        Q.append(cur)

        continue
    

    board[nx][ny] = alphabet[cnt];
    vis[nx][ny] = True
    
    cnt += 1
    if(cnt >= len(alphabet)):
        cnt = 0
    out += 1
    Q.append([nx,ny])

for i in range(n):
    for k in range(m):
        print(board[i][k], end = ' ')
    print()