n,m = map(int, input().split())

board = [[0 for _ in range(m)] for _ in range(n)]

for i in range(n):
    tmp = input().split()
    for k in range(m):
        board[i][k] = tmp[k]

# 0,0 0,1 0,2
# 1,0 1,1 1,2
# 2,0 2,1 2,2
x = 0
y = 0
ls =    [[[x-1,y], [x,y], [x, y+1]]
        , [[x,y+1], [x,y], [x+1,y]]
        , [[x,y-1], [x,y], [x+1,y]]
        , [[x,y-1], [x,y], [x-1,y]]
        , [[x,y-1], [x,y], [x,y+1]]
        , [[x-1,y], [x,y], [x+1,y]] ]
answer = 0
for i in range(n):
    for k in range(m):
        for j in range(6):
            answer_tmp = 0
            for l in range(3):
                nx = i + ls[j][l][0]
                ny = k + ls[j][l][1]

                if(nx < 0 or nx >= n or ny < 0 or ny >= m):
                    continue

                answer_tmp += int(board[nx][ny])


            answer = max(answer, answer_tmp)
                


print(answer)
# print(board)