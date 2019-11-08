package leetcode;

class coin_change {
    public int coinChange(int[] coins, int amount) {
        int num = coins.length;
        int[] subamount = new int[amount+1];
        subamount[0] = 0;
        int change;
        for(int i=1;i<amount+1;i++){
            change = (1<<31)-1;
            for(int j=0;j<num;j++){
                if(i==coins[j]){
                    change = Math.min(change,1);
                }else if(i-coins[j]>0 && subamount[i-coins[j]]!=0){
                    change = Math.min(change,1+subamount[i-coins[j]]);
                }
            }
            if(change==(1<<31)-1) subamount[i] = 0;
            else subamount[i] = change;
        }
        return (subamount[amount]!=0)?subamount[amount]:-1;
    }
}
