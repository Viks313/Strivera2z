#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int count=0;
    int lastdigit;
    while(n>0){
        lastdigit=n%10;
        n=n/10;
        count+=1;
    }
    cout<<count;
    }