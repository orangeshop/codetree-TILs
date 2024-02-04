from collections import deque
n, m = map(int, input().split())

board = [[0 for _ in range(m)] for _ in range(n)]
vis = [[False for _ in range(m)] for _ in range(n)]

for i in range(n):
    tmp = list(map(int, input().split()))
    for k in range(m):
        board[i][k] = tmp[k]

# print(board)

dx = [0,1,0,-1]
dy = [1,0,-1,0]

Q = deque();

Q.append([0,0])
vis[0][0] = True

while(len(Q) != 0):
    cur = Q.popleft()

    for dirr in range(4):
        nx = cur[0] + dx[dirr]
        ny = cur[1] + dy[dirr]

        if nx < 0 or nx >= n or ny < 0 or ny >= m:
            continue
        if board[nx][ny] == 0 or vis[nx][ny] == True:
            continue

        Q.append([nx,ny])
        vis[nx][ny] = True


if vis[n-1][m-1] == True:
    print(1)
else:
    print(0)