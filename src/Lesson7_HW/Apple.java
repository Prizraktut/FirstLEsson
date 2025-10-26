package Lesson7_HW;

public class Apple {
    private String color;

    public Apple(){
        color = "White";
    }

    public String getColor() {
        return color;
    }

    // Внутренний класс имеет доступ к приватным полям внешнего класса
    public class AppleNew {

        public void colorNew(String newColor) {
            color = newColor; // Прямой доступ к приватному полю
        }
    }

    public AppleNew createChanger() {
        return new AppleNew();
    }
}

