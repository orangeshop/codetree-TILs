#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int N, M;
vector<int> V;

int dp[10005];

int main() {
    cin >> N >> M;

    fill(dp, dp + 10005, 1e6);

    for(int i =0; i < N; i++){
        int a = 0;
        cin >> a;
        V.push_back(a);
        
    }

    dp[0] = 0;

    for(int i = 0; i < 10001; i++){
        for(int k =0; k < V.size(); k++){
            if(i + V[k] > 10000) continue;
            dp[i + V[k]] = min(dp[i] + 1, dp[i + V[k]]);
        }
    }

    if(dp[M]== 1e6){
        cout << -1 << endl;
    }
    else{
        cout << dp[M] << endl;
    }

    return 0;
}