package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void go() {
        Car car = new Car();

        // 익명 클래스 사용해서 테스트 하기
        car.move(new MoveStrategy() {
            @Override
            public boolean movable() {
                return true;
            }
        });

        // 람다 사용해서 테스트 하기
        // car.move(() -> true);

        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void stop() {
        Car car = new Car();

        // 익명 클래스 사용해서 테스트 하기
        car.move(new MoveStrategy() {
            @Override
            public boolean movable() {
                return false;
            }
        });

        // 람다 사용해서 테스트 하기
        // car.move(() -> true);

        assertThat(car.getPosition()).isEqualTo(0);
    }
}
