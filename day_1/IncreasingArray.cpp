#include<iostream>
using namespace std;

typedef long long ll;

// Problem Link: https://cses.fi/problemset/task/1094

int main(){
    // int arr[n];
    // for(int i=0;i<n;i++) cin>>arr[i];
    // long long int ans=0;
    // for(int i=1;i<n;i++){
    //     if(arr[i]<arr[i-1]){
    //         ans+=arr[i-1]-arr[i]; // here, we are adding the difference between the previous element and the current element.
    //         arr[i]=arr[i-1];
    //     }
    // }
    // cout<<ans<<endl;
    // for(int i=0;i<n;i++) cout<<arr[i]<<" ";
    // return 0;

    // alternate solution:

    int n;
    cin>>n;
    int p, c;
    cin>>p;
    ll ans=0;
    for(int i=1;i<n;i++){
        cin>>c;
        if(c<p) ans+=p-c;
        else p=c;
    }
    cout<<ans<<endl;
}