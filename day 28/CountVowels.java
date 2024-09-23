 class CountVowels {
    public static void main(String[]args){
        String str ="dhanashree";
        int vowelCount = 0;
        int consonantCount = 0;
    for(int i = 0;i<str.length();i++){
        char ch =str.charAt(i);
        if(ch =='a'||ch =='e'||ch =='o'||ch =='u'){
            vowelCount++;
        }
        else{
            consonantCount++;
        }

    }
    System.out.println("vowels: "+ vowelCount+" "+  "consonants : "+ consonantCount);
    }
    
}
