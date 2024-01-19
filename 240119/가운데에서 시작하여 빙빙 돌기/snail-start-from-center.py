from collections import deque
n = int(input())

board = [[0 for _ in range(n)] for _ in range(n)]
vis = [[False for _ in range(n)] for _ in range(n)]

Q = deque()
Q.append([n-1,n-1])
vis[n-1][n-1] = True

# 0,0 0,1 0,2
# 1,0 1,1 1,2
# 2,0 2,1 2,2
dx = [0,-1,0,1]
dy = [-1,0,1,0]
now_dir = 0
out = 0
cnt = n * n
board[n-1][n-1] = cnt
cnt -= 1;
while(len(Q) != 0):
    if(out == 2 * n * n):
        break
    cur = Q.popleft()
    # print(cur)
    nx = cur[0] + dx[now_dir]
    ny = cur[1] + dy[now_dir]
    
    if(nx < 0 or nx >= n or ny < 0 or ny >= n or vis[nx][ny] == True):
        now_dir += 1
        out += 1
        if(now_dir >= 4):
            now_dir = 0

        Q.append(cur)
        
        continue

    Q.append([nx,ny])
    vis[nx][ny] = True
    
    board[nx][ny] = cnt
    cnt -= 1
    out += 1

for i in range(n):
    for k in range(n):
        print(board[i][k], end = ' ')
    print()