package com.example.ioc;

public class IngredientsFactory {
    public Ingredient getIngredient(String menu){
        return switch (menu) {
            case "치킨" -> new Chicken("국내산 닭");
            case "스테이크" -> new Pork("국내산 돼지");
            default -> throw new RuntimeException("너가 해먹어");
        };
    }
}
