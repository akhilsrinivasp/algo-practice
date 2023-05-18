#include <iostream>
using namespace std;

// Problem Statement: https://www.codechef.com/problems/LUCKFOUR
// Problem Statement: https://www.codechef.com/problems/LUCKYFR

int main() {
	// your code goes here
	int n; cin>>n;
	while(n--){
	    int inp; cin>>inp;
	    int cnt=0;
	    while(inp!=0) {
	        if(inp%10==4) cnt++;
	        inp/=10;
	    }
	    cout<<cnt<<endl;
	}
	return 0;
}
