package com.example.demo.archive;

import com.example.demo.hero.Hero;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@RequiredArgsConstructor
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Player {
    int id;
    String name;
    Side side;    // red/ blue
    int kill;
    int assist;
    int death;

    Hero pickedHero;    // 어떤 영웅을 선택해서 Play 했는지
}
