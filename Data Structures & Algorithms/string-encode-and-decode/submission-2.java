class Solution {

    public String encode(List<String> strs) {
            String  s ="";
            for(int i=0; i<strs.size(); i++){
                s = s + strs.get(i)+"~";
            }  
            System.out.println(s);
            return s;
 }

    public List<String> decode(String str) {

        List<String> decodedString = new ArrayList<>();
        String temp ="";
        for(int i=0; i<str.length(); i++){
          if(str.charAt(i) == '~'){
                decodedString.add(temp);
                temp ="";
            }
            else{
            temp=temp+str.charAt(i);
            }
         }
        System.out.println(decodedString);

        return decodedString; 
    }
}