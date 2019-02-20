package com.stackroute.PE4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contains1Example {

    public boolean check(String str)
    {
        Pattern pattern= Pattern.compile("Harry");
        Matcher matcher= pattern.matcher(str);
         return  matcher.find();

    }
}
