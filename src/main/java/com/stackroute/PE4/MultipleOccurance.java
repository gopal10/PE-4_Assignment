package com.stackroute.PE4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurance {

    public String check(String str , String input)
    {
        Pattern pattern= Pattern.compile(input);
        Matcher matcher= pattern.matcher(str);
         String res="";
        while(matcher.find())
        {
            res= res+matcher.start()+"-"+matcher.end()+" ";

        }

     //   System.out.println(res);
        return res.trim();
    }
}
