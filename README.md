# java-racingcar

자동차 경주 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 요구사항

### 입출력

- [ ] 자동차 이름들을 입력받는 기능
- [ ] 경주 시도 회수 입력받는 기능
- [ ] 매 횟수 마다 자동차 전진 상태 출력 기능
- [ ] 최종 우승자 출력 기능 (한 명 이상 가능)
    
    > 예외 처리에 대한 토론 : 동일한 예외 처리의 중복을 줄이고자, 가장 중요한 부분인 도메인에서만 예외처리를 진행하였다.

### 기능

- [ ] 입력된 자동차 이름 더미를 ,(쉼표)로 분리하는 기능
    - 예외) 자동차가 단 한대일 경우
    - 예외) 자동차 이름이 중복되는 경우
- [x] 자동차 이름을 부여하는 기능
    - 예외) 자동차 이름이 다섯 글자가 넘을 경우
    - 예외) 자동차 이름이 공백일 경우
- [ ] 시도 횟수만큼 자동차 경주를 진행하는 기능
    - 예외) 0 이하일 경우
    - 예외) int형의 최대값을 넘는 경우
    - 예외) 정수 이외의 값을 입력하는 경우
    - 예외) 숫자 사이에 공백이 있는 경우
    - 예외) 숫자가 0으로 시작할 경우
- [ ] 0에서 9사이의 랜덤숫자를 발생시키는 기능
- [ ] 숫자에 따라 전진(4 이상) 혹은 정지(3 이하)를 하는 기능
  - [ ] 자동차의 현재 위치를 저장하는 기능
- [ ] 자동차들의 현재 위치를 통해 우승자를 정하는 기능