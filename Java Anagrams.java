static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()){
            return false;}
            
        String x = a.toLowerCase();
        String y = b.toLowerCase();
        char arr1[] = x.toCharArray();
        char arr2[] = y.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        return java.util.Arrays.equals(arr1,arr2)?true:false;
        
        
    }
