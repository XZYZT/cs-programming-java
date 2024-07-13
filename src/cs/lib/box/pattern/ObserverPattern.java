package cs.lib.box.pattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        Debit zhangSan = new ZhangSan();
        zhangSan.borrow(new WangWu());
        zhangSan.borrow(new ZhaoSi());
        // state改变
        zhangSan.notifyCredits();
    }
}

interface Debit {
    void borrow(Credit credit);
    void notifyCredits();
}

class ZhangSan implements Debit {
    private List<Credit> allCredits = new ArrayList<>();
    private Integer state = 0;      // 1表示有钱
    @Override
    public void borrow(Credit credit) {
        allCredits.add(credit);
    }

    @Override
    public void notifyCredits() {
        allCredits.forEach(credit -> credit.takeMoney());
    }
    
}

interface Credit {
    void takeMoney();
}

class ZhaoSi implements Credit {
    @Override
    public void takeMoney() {
        System.out.println("赵四要钱！");
    }
}

class WangWu implements Credit {
    @Override
    public void takeMoney() {
        System.out.println("王五要钱！");
    }
}