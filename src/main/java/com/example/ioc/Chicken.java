package com.example.ioc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter //
@Setter
@RequiredArgsConstructor //final 하지 않은 컬럼들만 생성자로 만들겠다.

public class Chicken implements Ingredient {
    private final String name;
}
