from collections import deque


def back(depth, board, n, m, i_d, k_d, st, result):
    if depth == m:
        
        # for i in range(n):
        #     print(board[i])

        # print()

        bfs(st,board,n, result)
        return


    for i in range(n):
        for k in range(n):
            if(board[i][k] == 1):
                board[i][k] = 0
                back(depth + 1, board, n,m,i,k, st, result)
                board[i][k] = 1


def bfs(st, board, n,result):
    Q = deque()
    dx = [0,1,0,-1]
    dy = [1,0,-1,0]
    answer = 0
    vis = [[False for _ in range(n)] for _ in range(n)]
    for i in range(len(st)):
        x = int(st[i][0])-1
        y = int(st[i][1])-1
        
        Q.append([x, y])

        while(len(Q) != 0):
            
            cur = Q.popleft()
            for dirr in range(4):
                nx = dx[dirr] + cur[0]
                ny = dy[dirr] + cur[1]

                if(nx < 0 or nx >= n or ny < 0 or ny >= n):
                    continue
                if(board[nx][ny] == 1):
                    continue
                if(vis[nx][ny] == True):
                    continue
                
                Q.append([nx,ny])
                vis[nx][ny] = True;

    for i in range(n):
        for k in range(n):
            if(vis[i][k] == True):
                answer += 1

    # print(answer)
    result.append(answer)           
        


n, k, m = map(int, input().split())

board = [[0 for _ in range(n)] for _ in range(n)]

for i in range(n):
    tmp = list(map(int, input().split()))
    for j in range(n):
        board[i][j] = tmp[j]

st = []

for i in range(k):
    tmp = list(map(int, input().split()))
    st.append(tmp)



result = []
back(0,board,n,m,0,0, st, result)
print(max(result))