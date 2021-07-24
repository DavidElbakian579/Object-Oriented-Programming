/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro8l7;

/**
 *
 * @author David-pc
 * Правильно унаследуй классы:
    человека — от существа;
    Java-девелопера — от человека.
    Удали дублирующие методы.
    Требования:
    •	Класс Human должен наследоваться от класса Entity.
    •	Класс JavaDeveloper должен наследоваться от класса Human.
    •	Дублирующих методов не должно быть.
 */
public class Entity {

    public void move() {
        System.out.println("Я передвигаяюсь");
    }
    
    public void eat() {
        System.out.println("Я ем");
    }
    
}
