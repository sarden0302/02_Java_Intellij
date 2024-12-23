package package3.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Cat extends Animal {
    private String location;
    private String color;

    public Cat(String name, String kinds, String location, String color) {
        super(name, kinds);
        this.location = location;
        this.color = color;
    }

    @Override
    public void speak() {
        System.out.println(super.toString() + location + "에 서식하며, 색상은 " + color + "입니다.");
    }
}
