/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Comparator;

/**
 *
 * @author Tobias 
 * @modified by Simon
 */
public class Test
{
    public static void main(String[] args)
    {
        MapInterface<Integer, String> map = new MyTreeMap<>();
        // enable normal assertions by adding -ea under Poject->Properties->Run->VM Options
        assert(map.size() == 0);
                
        map.put(11, "Luke Skywalker");
        assert(map.size() == 1);
        map.put(5, "Darth Vader");
        map.put(-22, "The Emperor");
        map.put(3, "Han Solo");
        map.put(10, "C3P0");
        assert(map.size() == 5);
        assert(map.get(666) == null);
        System.out.println("Here comes `" + map.get(-22) + "`");
        System.out.println("Here comes `" + map.get(5) + "`");
        System.out.println("Here comes `" + map.get(3) + "`");
        System.out.println("Here comes `" + map.get(10) + "`");
        
        System.out.println("");
        System.out.println("   /\\_/\\   ");
        System.out.println("  / o o \\  ");
        System.out.println(" (   \"   ) ");
        System.out.println("  \\~(*)~/  ");
        System.out.println("   // \\\\   ");
    }
}
