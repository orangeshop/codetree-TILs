#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int N;

int dp[1005];

int main() {
    cin >> N;


    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 3;
    dp[4] = 5;
    dp[5] = 9;
    

    for(int i=6; i < 1001; i++){
        dp[i] = dp[i - 1] + dp[i -2] + dp[i - 5];
        dp[i] %= 10007;
    }
    
    /*
    dp[1] = 1
    dp[2] = 1 + 1, 2
    dp[3] = 1 + 1 + 1, 2 + 1, 1 + 2
    dp[4] = 1 + 1 + 1 + 1, 2 + 1 + 1, 1 + 2 + 1 /  1 + 1 + 2, 2 + 2
    
    1
    2
    3

    
    */


    cout << dp[N] << endl;


    return 0;
}