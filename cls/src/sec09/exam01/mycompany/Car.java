package sec09.exam01.mycompany;

import sec09.exam01.hankook.*;  // 두개 다 선택하려면 * 사용
import sec09.exam01.kumho.*;
import sec09.exam01.hyundai.Engine;

public class Car {
    //필드
    Engine engine = new Engine();
    SnowTire snowtire = new SnowTire();
    BigWidthTire bigWidthTire = new BigWidthTire();

    // Tire 클래스가 두개 존재
    sec09.exam01.kumho.Tire tire = new sec09.exam01.kumho.Tire();
    sec09.exam01.hankook.Tire tire2 = new sec09.exam01.hankook.Tire();
}
