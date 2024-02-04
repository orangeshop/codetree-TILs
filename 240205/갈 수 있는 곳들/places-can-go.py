from collections import deque
n, m = map(int, input().split())

board = [[0 for _ in range(n)] for _ in range(n)]
vis = [[False for _ in range(n)] for _ in range(n)]

for i in range(n):
    tmp = list(map(int, input().split()))
    for k in range(n):
        board[i][k] = tmp[k]

# print(board)
ls = []
answer = m
for i in range(m):
    ls.append(list(map(int, input().split())))



dx = [0,1,0,-1]
dy = [1,0,-1,0]

Q = deque();
for i in range(m):
    if(board[ls[i][0]][ls[i][1]] == 1):
        answer -= 1
    
    Q.append([ls[i][0],ls[i][1]])
    vis[ls[i][0]][ls[i][1]] = True

    while(len(Q) != 0):
        cur = Q.popleft()

        for dirr in range(4):
            nx = cur[0] + dx[dirr]
            ny = cur[1] + dy[dirr]

            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue
            if board[nx][ny] == 1 or vis[nx][ny] == True:
                continue

            answer+=1
            Q.append([nx,ny])
            vis[nx][ny] = True

print(answer)