#include<iostream>
using namespace std;

typedef long long ll;

int main(){
    int n; cin>>n;
    while(n--){
        ll x, y; cin>>x>>y;
        ll m = (x>y) ? x:y;
        ll ans = m*m-m+1;
        if(m%2==0) cout<<ans-(y-x);
        else cout<<ans+(y-x);
        cout<<endl;
    }
    return 0;
}