package package3.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Animal {
    String name;
    String kinds;
    @Override
    public String toString() {
        return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
    }

    public abstract void speak();
}
