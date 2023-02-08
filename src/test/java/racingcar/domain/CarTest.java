package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Random;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class CarTest {

	@DisplayName("자동차 생성 성공 테스트")
	@ParameterizedTest(name = "carName = {0}")
	@MethodSource("carNameDummy")
	void createCarSuccessTest(String carName) {
		assertThat(new Car(carName)).isNotNull();
	}

	@DisplayName("자동차 생성시 공백 및 빈 이름 실패 테스트")
	@ParameterizedTest(name = "carName = {0}")
	@NullAndEmptySource
	void createCarNameNullOrBlankExceptionTest(String carName) {
		assertThatThrownBy(() -> new Car(carName))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("자동차 생성시 다섯 글자 이상 이름 실패 테스트")
	@ParameterizedTest(name = "carName = {0}")
	@ValueSource(strings = {"123456", "1234567", "aaaaaa", "ㅁㅁㅁㅁㅁㅁㅁ"})
	void createCarNameOverLengthExceptionTest(String carName) {
		assertThatThrownBy(() -> new Car(carName))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("자동차 이동 정상 작동 테스트")
	@Test
	void moveTest() {
		Car car = new Car("이름입니다");
		Assertions.assertDoesNotThrow(car::move);
	}

	static Stream<Arguments> carNameDummy() {
		return Stream.of(
			Arguments.arguments("가"),
			Arguments.arguments("가나"),
			Arguments.arguments("가나다"),
			Arguments.arguments("가나다라"),
			Arguments.arguments("가나다라마")
		);
	}
}