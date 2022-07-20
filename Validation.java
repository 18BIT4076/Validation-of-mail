package email;
import java.util.regex.*;    
import java.util.*;    
public class Validation{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("santhosh@222.com");  
        emails.add("john@220.com");  
        emails.add("funny@1.com");  
        emails.add("Good@123.com");  
        emails.add("@yahoo.com");  
        emails.add("siva#gmail.com");  
        String regex = "^(.+)@(.+)$";     
        Pattern pattern = Pattern.compile(regex);  
        for(String email : emails){  
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}