package org.vital.telegrambot.constant;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VarConstant {
    //sendMessage
    public static final String saladMenuMessage = "select your salad!";
    public static final String burgerMenuMessage = "select your burger!";
    public static final String drinkMenuMessage = "select your drink";
    public static final String desertMenuMessage = "select your desert!";
    public static final String greetingMessage = "Hello, motherfucker!" +
            " choose your meal";
    public static final String incorrectCommandMessage = "IncorrectCommand";

    //MainMenu
    public static final String START = "/start";
    public static final String HELLO = "hello";
    public static final String BACK = "back";
    public static final String DRINKS = "drinks";
    public static final String DESERTS = "deserts";
    public static final String BURGERS = "burgers";
    public static final String SALADS = "salads";

    //MealsMenu
    public static final String JUICE = "juice";
    public static final String TEA = "tea";
    public static final String WATER = "water";
    public static final String BEER = "beer";
    public static final String COFFEE = "coffee";
    public static final String CAKE = "cake";
    public static final String CHEESECAKE = "cheesecake";
    public static final String COOKIE = "cookie";
    public static final String TIRAMISU = "tiramisu";
    public static final String CESAR = "cesar";
    public static final String VITAMIN = "vitamin";
    public static final String VEGAN = "vegan";
    public static final String SUMMER = "summer";
    public static final String CHICKEN = "chicken";
    public static final String EPIC = "epic";
    public static final String VEGETARIAN = "vegetarian";
    public static final String BEEF = "beef";

    public List<String> InterfaceConstants() {
       return List.of(DESERTS,DRINKS,HELLO,BURGERS,SALADS,BACK,START);
    }
    public List<String> MenuConstants(){
        return List.of(JUICE, TEA, WATER, BEER, COFFEE,
                CAKE, CHEESECAKE, COOKIE, TIRAMISU
                ,CESAR,VITAMIN,VEGAN,SUMMER,
                CHICKEN, EPIC,VEGETARIAN,BEEF);
    }
}
