package com.stackroute.PE4;

import java.util.ArrayList;
import java.util.Collections;

public class Paragraph {

    public ArrayList  check(String str)
    {
        ArrayList arrayList= new ArrayList();
         String [] out= str.split(" ");

         for(int i=0; i<out.length;i++)
         {
             arrayList.add(out[i]);
         }

           Collections.sort(arrayList);
        return arrayList;
    }
}
