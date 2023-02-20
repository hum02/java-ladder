# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 설계 그래프
```mermaid
graph TD
CM[Command] -.-> A
A[LadderGame] --> B(Ladder)
A --> RS[Results] --> R[Result]
R --> N
R --> S
B --> C[Line]
D[Players] --> P[Player]
P --> S[Position]
P --> N[Name]
B --> H[Height]
A -.-> LS[LineStrategy]
A --> D
B -.-> LS
C --> LS
```

## 입력
- [x] 참여자 이름을 입력받는다.
  - [x] 이름은 쉼표로 구분되어 입력받는다.

- [x] 최대 사다리 높이를 입력받는다.
  - [x] 사다리 높이는 숫자가 아닌 문자이면 예외를 던진다.
  - [x] 입력받은 높이가 integer 최댓값을 넘기면 예외를 던진다.

- [x] 실행결과를 입력 받는다.
  - [x] 실행결과는 쉼표로 구분되어 입력받는다.
  - [x] 입력되는 실행결과의 개수는 참여자의 개수 이하이어야 한다.
  
## 출력
- [x] 이름과 사다리를 출력한다.
  - [x] 사다리의 폭은 5이다.
- [ ] 플레이어와 실행결과의 매핑 결과를 출력한다.
  - [ ] 플레이어 이름에 해당하는 실행결과를 출력한다.
  - [ ] all이 입력되면 모든 플레이어의 실행결과를 출력한다.
  
# 사다리 게임
- [x] 플레이어, 실행결과, 사다리 높이로부터 사다리 게임을 생성한다.
- [x] 실행결과를 계산한다.
  - [x] 플레이어의 도착점에 해당하는 실행결과를 반환한다.
  - [ ] 입력된 플레이어를 찾을 수 없는 경우 예외를 던진다.
  
## 플레이어 - 실행결과
### 이름
- [x] 플레이어와 실행결과의 이름은 최소 1글자 최대 5글자이다.
- [x] 플레이어와 실행결과의 이름이 빈 문자이면 예외를 던진다.
### 플레이어
- [x] 중복된 이름이 입력되면 예외를 던진다.
### 실행결과
- [x] 실행결과의 개수가 플레이어의 개수보다 적은 경우, 그 차이만큼 자동으로 '꽝'으로 채워 게임을 생성한다.
### Position
- [x] 위치는 0 이상이어야 한다.


## 사다리
- [x] 입력 받은 높이만큼 사다리 라인들을 생성한다.
- [x] 첫 층 라인에서 사다리를 따라 마지막 라인의 도칙점을 계산한다.
### 사다리 높이 
- [x] 사다리 높이가 음수이면 예외를 던진다.
- [x] 최대 사다리 높이가 1 이하이면 예외를 던진다.
### 라인
- [x] 라인을 생성한다.
  - [x] 라인은 랜덤하게 생성한다.
  - [x] 연속으로 겹치지 않게 생성한다.
- [x] 시작점에서부터 라인을 따라 움직인 도착점을 계산한다.
  - [x] 라인의 범위를 벗어난 시작점에 대하서는 예외를 던진다. 
