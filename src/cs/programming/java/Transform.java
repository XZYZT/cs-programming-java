package cs.programming.java;

public class Transform {
    public static char moreThan10(short x) {
        if (x < 10) {
            return (char)(x + '0');
        } 
        char c = switch (x) {
        case 10: {
            yield 'A';
        } case 11: {
            yield 'B';
        } case 12: {
            yield 'C';
        } case 13: {
            yield 'D';
        } case 14: {
            yield 'E';
        } case 15: {
            yield 'F';
        }
        default:
            throw new IllegalArgumentException("Unexpected value: " + x);
        };
        return c;
    }
    
    public static String dayToWeek(int d) {
        String week = switch (d) {
        case 0: {
            yield Week.SUNDAY.getCHNWeek();
        } case 1: {
            yield Week.MONDAY.getCHNWeek();
        } case 2: {
            yield Week.TUESDAY.getCHNWeek();
        } case 3: {
            yield Week.WEDNESDAY.getCHNWeek();
        } case 4: {
            yield Week.THURSDAY.getCHNWeek();
        } case 5: {
            yield Week.FRIDAY.getCHNWeek();
        } case 6: {
            yield Week.SATURDAY.getCHNWeek();
        } 
        default:
            throw new IllegalArgumentException("Unexpected value: " + d);
        };
        return week;
    }
    
    public enum WeekCHN {
        星期日(0), 星期一(1), 星期二(2), 星期三(3), 星期四(4), 星期五(5), 星期六(6);
        private int weekNum;
        private WeekCHN(int weekNum) {
            this.weekNum = weekNum;
        }
        private WeekCHN() {
        }
        public int getWeekNum() {
            return weekNum;
        }
    }
    
    public enum Week {
        SUNDAY(0){
            @Override
            public String getCHNWeek() {
                return "星期日";
            }
        }, MONDAY(1) {
            @Override
            public String getCHNWeek() {
                return "星期一";
            }
        }, TUESDAY(2) {
            @Override
            public String getCHNWeek() {
                return "星期二";
            }
        }, WEDNESDAY(3) {
            @Override
            public String getCHNWeek() {
                return "星期三";
            }
        }, THURSDAY(4) {
            @Override   
            public String getCHNWeek() {
                return "星期四";
            }
        }, FRIDAY(5) {  
            @Override   
            public String getCHNWeek() {
                return "星期五";
            }
        }, SATURDAY(6) {
            @Override
            public String getCHNWeek() {
                return "星期六";
            }
        };
        
        private int weekNum;        
        private Week(int weekNum) { 
            this.weekNum = weekNum; 
        }
        public int getWeekNum() {
            return weekNum;
        }
        public String getWeekCHN() {
            return dayToWeek(weekNum);
        }
        public abstract String getCHNWeek();
        private Week(){ }
    }
    
    public static void main(String[] args) {
//        Week w = Week.MONDAY;
        System.out.println(WeekCHN.星期一.name());
        System.out.println(WeekCHN.星期一.ordinal());
    }
}
