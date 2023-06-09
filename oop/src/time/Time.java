package time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    public Time nextSecond() {
        if (this.second == 59) {
            second = 0;
            if (this.minute == 59) {
                minute = 0;
                if (this.hour == 23) {
                    hour = 0;
                } else {
                    hour++;
                }
            } else {
                minute++; //증가
            }
        } else {
            this.second++;
        }
        return this;  // 내 자신의 객체를 반환한다.
    }
    public Time previousSecond() {
        if (this.second == 00) {
            second = 59;
            if (this.minute == 00) {
                minute = 59;
                if (this.hour == 00) {
                    hour = 23;
                } else {
                    hour--;
                }
            } else {
                minute--;
            }
        } else {
            this.second--;
        }
        return this;  // 내 자신의 객체를 반환한다.
    }
}
