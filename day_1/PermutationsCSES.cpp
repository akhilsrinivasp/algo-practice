#include<iostream>
using namespace std;

// Problem Link: https://cses.fi/problemset/task/1070

int main() {
    int n; cin>>n;
    if(n==1) {
        cout<<"1";
    }
    else if(n<4) {
        cout<<"NO SOLUTION";
    }
    else {
        for(int i=2; i<=n; i+=2) cout<<i<<" ";
        for(int i=1; i<=n; i+=2) cout<<i<<" ";
    }
    return 0;
}