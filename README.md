# java-lotto-precourse

본 프로젝트는 로또 발매 시스템을 구현하였습니다.  
사용자는 1,000원에 로또1장을 구입할 수 있으며, 당첨 번호와 보너스 번호를 입력받아 발행된 로또 번호들과 비교하여 당첨 여부와 수익률을 계산해 제공합니다.

### 1. 로또 구입

1.1 구입 금액 입력 요청 메시지를 출력한다.
>구입금액을 입력해 주세요.

1.2 구입 금액을 입력 받는다.

1.2.1 예외 상황 처리
- 예외 발생 시
    - `IllegalArgumentException` 을 발생시키고 “*[ERROR]*”로 시작하는 에러 메시지를 출력한 뒤 다시 입력을 받는다.
- 예외 조건
    - 1,000 단위로 나누어지지 않을 경우
    - 빈 값일 경우

1.3 발행한 로또 수량을 출력한다. 
>`수량`개를 구매했습니다.

1.4 입력된 금액에 따라 로또를 발행한다.
- 로또 1장의 가격은 1,000원이다.
- 1부터 45까지의 숫자 중 중복되지 않는 6개의 숫자
- 중복되지 않는 1개의 보너스 번호

1.5 발행된 로또 번호를 출력한다.
- 번호는 오름차순으로 정렬되어 출력한다.
>[`발행번호1`, `발행번호2`, `발행번호3`, `발행번호4`, `발행번호5`, `발행번호6`]

### 2. 당첨 번호 입력

2.1 당첨 번호 입력 요청 메시지를 출력한다.

>당첨 번호를 입력해 주세요.

2.2 당첨 번호를 입력받는다.

- 쉼표로 구분하여 6개의 숫자를 입력받는다.

2.2.1 예외 상황 처리

- 예외 발생 시
    - `IllegalArgumentException` 를 발생시키고 “*[ERROR]*”로 시작하는 에러 메시지를 출력한 뒤 다시 입력을 받는다.
- 예외 조건
    - 입력한 숫자가 6개가 아닐 경우
    - 1에서 45 사이의 숫자가 아닐 경우
    - 양의 정수가 아닐 경우
    - 숫자와 쉼표 외 다른 문자가 있을 경우
    - 공백이 포함된 경우
    - 빈 값일 경우
    - 중복된 숫자가 있을 경우

2.3 보너스 번호 입력 요청 메시지를 출력한다.

>보너스 번호를 입력해 주세요.

2.4 보너스 번호를 입력받는다.

- 1개의 숫자를 입력한다.

2.4.1 예외 상황 처리

- 예외 발생 시
    - `IllegalArgumentException` 를 발생시키고 “*[ERROR]*”로 시작하는 에러 메시지를 출력한 뒤 다시 입력을 받는다.
- 예외 조건
    - 입력한 숫자가 1개가 아닐 경우
    - 1에서 45까지의 숫자가 아닐 경우
    - 양의 정수가 아닐 경우
    - 숫자 외 다른 문자가 존재할 경우
    - 공백이 포함될 경우
    - 빈 값일 경우
    - 당첨 번호와 중복된 값이 존재할 경우

### 3. 당첨 결과 확인

3.1 사용자가 구매한 로또 번호와 당첨 번호를 비교한다.

3.2 당첨 여부와 상금을 계산한다.

|    순위    |      1등       |        2등         |    3등     |    4등    |    5등    |
|:--------:|:-------------:|:-----------------:|:---------:|:--------:|:--------:|
|  당첨 조건   |   6개 번호 일치    | 5개 번호 + 보너스 번호 일치 | 5개 번호 일치  | 4개 번호 일치 | 3개 번호 일치 |
|  상금 (원)  | 2,000,000,000 |    30,000,000     | 1,500,000 |  50,000  |  5,000   |

3.3 당첨 내역을 출력한다.

3.3.1 “*당첨 통계*” 메시지를 출력한다.

3.3.2 구분선 “*---*”을 출력한다.

3.3.3 당첨 내역을 출력한다.

- 당첨 개수가 없을 경우 0으로 표시된다.

>“3개 일치 (5,000원) - `당첨 개수`개”  
“4개 일치 (50,000원) - `당첨 개수`개”  
“5개 일치 (1,500,000원) - `당첨 개수`개”  
“5개 일치, 보너스 볼 일치 (30,000,000원) - `당첨 개수`개”  
“6개 일치 (2,000,000,000원) - `당첨 개수`개”

3.4 수익률을 출력한다.

3.4.1 수익률은 소수점 둘째 자리에서 반올림하여 출력한다.

>총 수익률은 `수익률`%입니다.

3.5 로또 게임을 종료한다.