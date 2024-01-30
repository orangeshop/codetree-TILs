from collections import deque

n, m = map(int, input().split())

board = [[0 for _ in range(n)] for _ in range(n)]

for i in range(n):
    tmp = input().split()
    for k in range(n):
        board[i][k] = tmp[k]


def clac(k,m, x,y, board, n):
    cnt = [[-1 for _ in range(n)] for _ in range(n)]
    vis = [[False for _ in range(n)] for _ in range(n)]
    
    Q = deque();
    Q.append([x,y])
    dx = [1,0,-1,0]
    dy = [0,1,0,-1]
    vis[x][y] = True
    cnt[x][y] = 0
    dig_cnt = k * k + (k + 1) * (k  + 1)
    while(len(Q) != 0):
        cur = Q.popleft()
        # print(cur)
        for i in range(4):
            nx = cur[0] + dx[i]
            ny = cur[1] + dy[i]

            # print(f'{nx} {ny}')
            if(nx < 0 or nx >= n or ny < 0 or ny >= n):
                continue
            if(vis[nx][ny] == True):
                continue
            if(cnt[cur[0]][cur[1]]+1 > k):
                continue

            
            cnt[nx][ny] = cnt[cur[0]][cur[1]] + 1
            Q.append([nx,ny])
            vis[nx][ny] = True;

    answer = 0
    for i in range(n):
        for k in range(n):
            if(cnt[i][k] != -1):
                answer += int(board[i][k])

    # print(f"{x} {y} {m*answer} {dig_cnt}")
    if(0 <= ((m*answer) - dig_cnt)):
        return answer
    else:
        return 0



answer1 = 0;
for i in range(n):
    for k in range(n):
        for j in range(0, n):
            answer1 = max(clac(j,m,i,k,board,n), answer1)


print(answer1)

# 1

# 0 1 0
# 1 1 1
# 0 1 0

# 2

# 0 0 1 0 0
# 0 1 1 1 0
# 1 1 1 1 1
# 0 1 1 1 0
# 0 0 1 0 0