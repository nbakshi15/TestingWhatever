package com.company;

/**
 * Created by nini on 1/18/2017.
 */
public class UGH {
    public static void bc(int p, int q)
    {
        if (p/q == 0)
        {
            System.out.println(p + q + 1);
        }
else
        {
            System.out.println(p);
            bc(p/q, q);
        }
    }

}
