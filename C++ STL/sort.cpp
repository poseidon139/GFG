#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main(){
    vector <int> v={10,2,3,4,80,50};
    sort(v.begin(), v.end());
    for (int x: v){
        cout<<x<<"\n";
    }
}


