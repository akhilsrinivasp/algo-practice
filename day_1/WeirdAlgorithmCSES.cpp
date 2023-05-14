#include<iostream> 
using namespace std;

// Problem Link: https://cses.fi/problemset/task/1068

int main() {
    long long n;
    cin>>n;
    while(n!=1){
        cout<<n<<" ";
        if(n%2==0){
            n=n/2;
        }
        else{
            n=n*3+1;
        }
    } 
    cout<<n<<" ";
    return 0;
}