#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int N, M;

vector<int> V;

int dp[10005];

int main() {
    
    cin >> N >> M;

    fill(dp, dp + 10005, -100);

    for(int i =0; i < N; i++){
        int a = 0;
        cin >> a;
        V.push_back(a);
    }

    dp[1] = 0;

    for(int i =0; i < 10005; i++){
        for(int k = 0; k < V.size(); k++){
            if(i - V[k] > 0){
                dp[i] = max(dp[i], dp[i - V[k]] + 1);
            }
        }
    }
    
    if(dp[M] == -100){
        cout << -1;
    }else{
        cout << dp[M];
    }

    return 0;
}