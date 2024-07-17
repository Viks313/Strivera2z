#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int revnum,lastdigit;

    while(n>0){
        lastdigit=n%10;
        n=n/10;
        revnum=(revnum*10)+lastdigit;
    }
    cout<<revnum;
}