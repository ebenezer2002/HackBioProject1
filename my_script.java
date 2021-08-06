public class HackBioProject {
    public static void main(String[] args) {
        String email = "enyenwe@xula.edu"; 
        String slackUsername = "@Ebenezer";
        String biostack = "Data Science";
        String twitterHandle = "EbenezerNyenwe";
        int hammingDistance = calculateHammingDistance(slackUsername,twitterHandle);
        System.out.println(email);
        System.out.println(slackUsername);
        System.out.println(biostack);
        System.out.println(twitterHandle);
        System.out.println(hammingDistance);
        
    }
  static int calculateHammingDistance(String str1, String str2){
    int i = 0, count = 0;
    while (i < str1.length())
    {
        if (str1.charAt(i) != str2.charAt(i))
            count++;
        i++;
    }
    return count;
}
}
