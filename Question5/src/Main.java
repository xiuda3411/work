public class Main {
    public static void main(String[] args) {
        //测试
        Store store = new Store();

        Goods goods = new Goods(30);

        Student student = new Student();

        SuperStudent superStudent = new SuperStudent();

        superStudent.MannageGood(student,50);

        store.Exchange(student,goods);

    }
}
