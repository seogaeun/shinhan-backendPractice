package com.example.ioc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Chef {
    private final IngredientsFactory ingredientsFactory;
    public String cook(String menu){
        //재료 준비
        Ingredient ingredient = ingredientsFactory.getIngredient(menu);

        //요리...뚝딱뚝딱

        
        //결과 반환
        return ingredient.getName() + "으로 만든 "+menu; //기대 값
    }
}
