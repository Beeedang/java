package sec03.exam01;

import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        // 1일 때 일요일, 2일 때 월요일, 3일 때 화요일, ... 7일 때 토요일
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1: // 일요일
                today = Week.SUNDAY; break;
            case 2: // 월요일
                today = Week.MONDAY; break;
            case 3: // 화요일
                today = Week.TUESDAY; break;
            case 4: // 수요일
                today = Week.WEDNESDAY; break;
            case 5: // 목요일
                today = Week.THURSDAY; break;
            case 6: // 금요일
                today = Week.FRIDAY; break;
            case 7: // 토요일
                today = Week.SATURDAY; break;
        }

        System.out.println("오늘 요일은 " + today);

        if (today == Week.SUNDAY){
            System.out.println("일요일에는 축구를 합니다.");
        } else{
            System.out.println("열심히 공부를 합니다.");
        }
    }
}
