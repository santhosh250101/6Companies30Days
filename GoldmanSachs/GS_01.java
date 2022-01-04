class Solution {
    public List<List<String>> Anagrams(String[] words) {
        
        LinkedHashMap<String,List<String>> map=new LinkedHashMap<>();
        
        for(String str:words) {
            char[] letters=str.toCharArray();
            Arrays.sort(letters);
            String sortedStr=new String(letters);
            
            if(!map.containsKey(sortedStr))
            {
                map.put(sortedStr,new ArrayList<String>());
            }
            map.get(sortedStr).add(str);
        }
        
        List<List<String>> res=new ArrayList<>();
        
        for(String key:map.keySet())
        {
            res.add(map.get(key));
        }
        return res;
    }
}