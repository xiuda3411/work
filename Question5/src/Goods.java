public class Goods extends Store {
    private int needScore;

    Goods(int needScore){
        this.needScore = needScore;
        System.out.println("这是一个需要"+needScore+"积分的商品");
    }

    public int getNeedScore() {
        return needScore;
    }

    public Goods setNeedScore(int needScore) {
        this.needScore = needScore;
        return this;
    }
}
