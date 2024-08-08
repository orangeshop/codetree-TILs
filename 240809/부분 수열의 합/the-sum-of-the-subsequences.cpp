#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int N,M;
vector<int> V;

int dp[10005];

int main() {
    cin >> N >> M;

    fill(dp, dp + 10005, 1e9);

    for(int i =0; i < N; i++){
        int a = 0;
        cin >> a;
        V.push_back(a);
    }

    dp[0] = 0;

    for(int i =0; i < V.size(); i++){
        for(int k = 10000; k >= 0; k--){
            if(dp[k - V[i]] == 0 && k - V[i] >= 0){
                dp[k] = 0;
            }
        }

        // for(int i =0; i < 15; i++){
        //     cout << dp[i] << endl;
        // }

        // cout << endl;
    }

    


    if(dp[M] == 0){
        cout << "Yes";
    }else{
        cout << "No";
    }

    return 0;
}