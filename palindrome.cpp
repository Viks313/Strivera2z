#include<iostream>
using namespace std;
int main(){

    int lastdigit;
    int n;
    cin >>n;
    int revnum=0;
    int duplicate=n;
    while (n>0){
        lastdigit=n%10;
        n=n/10;
        revnum=(revnum*10)+lastdigit;

    }
    if(duplicate==revnum){
        cout<<"true";
    }else{
        cout<<"False";
    }
}