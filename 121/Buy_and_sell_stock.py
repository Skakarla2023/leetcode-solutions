nums=[ 7, 1, 5, 3, 6, 4 ]
bestbuy=nums[0]
max_profit=0

for i in range(len(nums)):
    if(nums[i]<bestbuy):
        bestbuy=min(bestbuy,nums[i])
    else:
        profit=nums[i]-bestbuy
        max_profit=max(profit,max_profit)
        
print(max_profit)
