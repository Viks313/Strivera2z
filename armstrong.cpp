#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int lastdigit;
    int sum=0;
    int dup=n;
    while(n>0){
        lastdigit=n%10;
        n=n/10;
        sum=sum+(lastdigit*lastdigit*lastdigit);
    }
    
    if(sum==dup){
        cout<<"number is a armstrong number";
    }else{
        cout<<"not an armstrong number";
    }

}