package sec09.exam02.package2;

import sec09.exam02.package1.A;
import sec09.exam02.package1.B;

public class C {
    // 패키지가 다른 A 클래스는 접근 제한자가 default이기 때문에 접근 불가능.
    //A a;

    // 패키지가 다른 B 클래스는 접근 제한자가 public 이기 때문에 접근 가능.
    B a;
}
