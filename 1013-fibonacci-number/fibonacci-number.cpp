class Solution {
    int F(int n, unordered_map<int,int> &ump) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (ump.find(n) == ump.end())
            ump[n] = F(n - 1, ump) + F(n - 2, ump);
        return ump[n];
    }

public:
    int fib(int n) {
        unordered_map<int, int> ump;
        return F(n, ump);
    }
};