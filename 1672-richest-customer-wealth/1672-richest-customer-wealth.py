class Solution(object):
    def maximumWealth(self, accounts):
        wealth=[]
        for i in range(0,len(accounts)):
            sums = 0
            for j in range(0,len(accounts[i])):
                sums=sums+accounts[i][j]
            wealth.append(sums)
        wealth.sort()
        return wealth[-1]


        