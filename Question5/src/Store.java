public class Store {
    Goods goods;


    public void Exchange(Student student,Goods goods){
        if (student.getScore() >= goods.getNeedScore()){
            int t = student.getScore() - goods.getNeedScore();student.setScore(t);
            System.out.println("成功兑换！");
            System.out.println("剩余积分为："+t);

        }else {
            System.out.println("积分不足，无法兑换！");
        }

    }
}
