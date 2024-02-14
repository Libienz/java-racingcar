package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("참여 자동차 도메인 테스트")
class CarsTest {

    @DisplayName("참여 중인 자동차 중 전진 거리가 가장 먼 자동차를 뽑는다.")
    @Test
    void testChooseWinnerCarByPosition() {

        Car winner = Car.from("car4", 4);
        Cars cars = Cars.from(
                List.of(Car.from("car1", 1),
                        Car.from("car2", 2),
                        Car.from("car3", 3),
                        winner));

        List<Car> winners = cars.chooseWinner();

        assertThat(winners).containsExactly(winner);
    }
}