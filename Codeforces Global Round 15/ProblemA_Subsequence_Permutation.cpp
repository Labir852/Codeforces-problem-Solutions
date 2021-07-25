#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t,i,n,j,k=0,p,temp;
    cin>>t;
    for ( i = 0; i < t; i++)
    {
        cin>>n;
        string s,s1;
        cin>>s;
        s1=s;
        int count =0;
        
        sort(s.begin(),s.end());
        for (p = 0; p < n; p++)
        {
            if(s[p]!=s1[p])
            {
                count++;
            }
        }
        
        cout<<count<<"\n";
        count =0 ;
    }
    
    

    return 0;
}