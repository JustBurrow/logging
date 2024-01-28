# `kr.lul:logging`

Kotlin Multiplatform 로깅 라이브러리.

## 목표

1. Android의 `android.util.Log`는 매번 `tag` 인자를 넘겨줘야 해서 귀찮다.
2. Kotlin Multiplatform 공용 모듈의 로그도 Android와 iOS 모듈과 동일한 방식으로 로그를 출력할 수 있어야 한다.
    - 공용 모듈의 로그도 Android Studio의 Logcat으로 출력할 수 있어야 한다.
    - 공용 모듈의 로그도 Xcode의 Debug area의 Console로 출력할 수 있어야 한다.

## 참고

1. 샘플 : https://github.com/JustBurrow/samples/tree/main/logging/kmp
