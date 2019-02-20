package com.stackroute.PE4;

public class FindCount {

    public int Countof(String string, String ch)
    {
        return string.length()-(string.replaceAll(ch,"")).length();

    }
}
