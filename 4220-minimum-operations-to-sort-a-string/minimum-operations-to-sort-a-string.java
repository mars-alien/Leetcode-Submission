class Solution {
    public int minOperations(String s) {
        int n =s.length();
         char[] arr = s.toCharArray();
          char[] sorted = arr.clone();
          Arrays.sort(sorted);

          if(Arrays.equals(arr,sorted)) return 0;
          if(n==2) return -1;

          int l=0,r=n-1;
          while(arr[l] ==sorted[l]) l++;
          while(arr[r] == sorted[r]) r--;

          if(l>0 || r<n-1) return 1;

          char maxOfRest = arr[1];    
         for (int i = 2; i < n; i++) if (arr[i] > maxOfRest) maxOfRest = arr[i];

         char minOfRest = arr[0];       
        for (int i = 1; i < n - 1; i++) if (arr[i] < minOfRest) minOfRest = arr[i];

        if (arr[0] > maxOfRest && arr[n-1] < minOfRest) return 3;
          return 2;
    }
}