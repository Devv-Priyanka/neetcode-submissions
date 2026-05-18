class Solution {
    public boolean isAnagram(String s, String t) {
           int n = s.length();
           int m = t.length();

           if(n!=m){
            return false;
           }

           Map<Character, Integer> map = new HashMap<>();
           for(int i=0; i<n; i++){
             Character sc = s.charAt(i);
             Character st = t.charAt(i);
             map.put(sc , map.getOrDefault(sc, 0) +1);
             map.put(st , map.getOrDefault(st, 0) -1);
}

             for(int i: map.values()){
               if(i!=0){
                return false;
               }
             }
             return true;
    }
}
