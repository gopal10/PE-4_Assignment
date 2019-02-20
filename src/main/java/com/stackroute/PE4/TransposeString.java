package com.stackroute.PE4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TransposeString {

    public  String check(String str)
    {
        String [] out= str.split(" ");

        String res="";
        for(int i=0; i<out.length; i++)
        {
            List<String> str2= Arrays.asList(out[i].split(""));
            Collections.reverse(str2);
            res=res+String.join("",str2)+" ";

        }
        return res.trim();
    }
}
