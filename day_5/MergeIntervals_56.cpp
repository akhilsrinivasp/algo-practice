#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef vector<int> vi;
typedef vector<vector<int>> vvi;
typedef pair<int, int> pi;
typedef vector<pair<int, int>> vpi;
typedef unordered_map<int, int> umii;

#define pb push_back
#define mp make_pair
#define ff first
#define ss second
#define all(x) (x).begin(), (x).end()
#define rall(x) (x).rbegin(), (x).rend()
#define fi(i, a, b) for (int i = a; i < b; i++)
#define fd(i, a, b) for (int i = a; i > b; i--)
#define fastio ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);


// Problem Statement: https://leetcode.com/problems/merge-intervals/

class Solution
{
public:
    vector<vector<int>> merge(vector<vector<int>> &intervals)
    {
        sort(all(intervals));
        vvi mergedIntervals;

        for (const auto &interval : intervals)
        {
            if (mergedIntervals.empty() || mergedIntervals.back()[1] < interval[0])
            {
                mergedIntervals.pb(interval);
            }
            else
            {
                mergedIntervals.back()[1] = max(mergedIntervals.back()[1], interval[1]);
            }
        }

        return mergedIntervals;
    }
};
