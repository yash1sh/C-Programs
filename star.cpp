#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
for(int i=1;i<=n;i++)
{
    for(int j=n-i;j>=0;j--)
{
    if(j%5==0)
    cout<<"#"<<" ";
    else
    cout<<"*"<<" ";
}
cout<<endl;
}
for(int i=1;i<=n;i++)
{
    for(int j=n-i;j>=0;j--)
{
    if(j%5==0)
    cout<<"#"<<" ";
    else
    cout<<"*"<<" ";
}
cout<<endl;
}
}