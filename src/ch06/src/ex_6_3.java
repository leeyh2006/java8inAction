package ch06.src;

import ch04.src.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Name:ex_6_3
 * Desc :
 * Developer :82108
 * Date : 2019-06-09
 * Time : 오후 6:35
 */
public class ex_6_3 {
    public enum CalroricLevel  {DIET,NORMAL,FAT}

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish(800,"prok",false, Dish.Type.MEAT),
                new Dish(700,"p5ok",false, Dish.Type.MEAT),
                new Dish(600,"p3ok",false, Dish.Type.MEAT),
                new Dish(400,"te",false, Dish.Type.OTHER),
                new Dish(200,"fish",false, Dish.Type.FISH)
        );
        Map<Dish.Type, List<Dish>> dishesByType= menu.stream().collect(Collectors.groupingBy(i->i.getType()));

        Map<Dish.Type, Long> typesCount = menu.stream().collect(
                Collectors.groupingBy(Dish::getType, Collectors.counting())
        );

        System.out.println(typesCount);


    }
}
