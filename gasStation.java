class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int n = gas.length;
       int start = 0; 
       int checkForStation = 0; 
       int totalFuel = 0; 
       for(int i = 0 ; i<n ; i++){
           totalFuel = totalFuel + gas[i] - cost[i];
           checkForStation = checkForStation + gas[i] - cost[i];
           if(checkForStation <0){
               checkForStation = 0;
               start = i +1;
           }

       }
       if(totalFuel<0){
           return -1;

       }
       else{
       return start;
       }
    }
}
