#include<iostream>
#include<string>
using namespace std;

// Problem Link: https://cses.fi/problemset/result/6061641/

int main(){
    string s;
    cin>>s;
    long count = 1;
    long max = 1;
    for(int i=0;i<s.length();i++){
        if(s[i] == s[i+1]){
            count++;
        }
        else{
            if(count > max){
                max = count;
            }
            count = 1;
        }
    }
    cout<<max<<endl;
}