package chap06.section3;

// 자바에서 최상위 함수 접근하기
public class PackageLevelAccess {
    public static void main(String[] args) {
//      PackageLevelFunctionKt.packageLevelFunc();
        PKLevel.packageLevelFunc(); // 변경된 이름으로 접근 가능
    }
}
