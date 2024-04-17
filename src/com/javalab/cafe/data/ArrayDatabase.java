package com.javalab.cafe.data;

import com.javalab.cafe.domain.Category;
import com.javalab.cafe.domain.Employee;
import com.javalab.cafe.domain.Order;
import com.javalab.cafe.domain.Product;

/**
 * 데이터베이스 클래스
 * - 카테고리, 상품, 사원, 주문데이터 저장 전용 클래스
 * - 4개의 배열을 인스턴스변수(속성)으로 갖는다.
 * - 데이터전용 클래스이므로 모든 데이터를 담고있다. 그래서 세터 메소드가 필요 없음.
 */
public class ArrayDatabase {
    // 정보를 저장할 배열을 인스턴스 변수(필드, 속성)로 선언
    private Category[] categories = new Category[6];       // 카테고리 배열
    private Product[] products = new Product[28];           // 상품 배열
    private Employee[] employees = new Employee[5];         // 직원 배열
    private Order[] orders = new Order[74];                 // 주문 배열


    // 생성자
    public ArrayDatabase() {
        categories[0] = new Category(1, "Coffee", "\t\tAll types of coffee drinks");
        categories[1] = new Category(2, "Latte", "\t\tVarious kinds of lattes");
        categories[2] = new Category(3, "Ade/Shake", "\tFresh ades and shakes");
        categories[3] = new Category(4, "Smoothie/Juice", "Healthy smoothies and juices");
        categories[4] = new Category(5, "Bakery", "\t\tFresh baked goods" );
        categories[5] = new Category(6, "Tea", "\t\t\tTraditional and herbal teas");

        // 상품 데이터 초기화
        products[0] = new Product(1, "카라멜마끼아또", 1, 5000);
        products[1] = new Product(2, "홍차라떼\t", 2, 5000);
        products[2] = new Product(3, "초코라떼\t", 2, 5000);
        products[3] = new Product(4, "오레오\t", 3, 5000);
        products[4] = new Product(5, "카라멜마끼아도", 1, 5000);
        products[5] = new Product(6, "초코라떼\t", 2, 4500);
        products[6] = new Product(7, "복숭아스무디", 4, 5000);
        products[7] = new Product(8, "커피콩빵\t", 5, 3000);
        products[8] = new Product(9, "바나나라떼", 1, 5000);
        products[9] = new Product(10, "매실차\t", 6, 4500);
        products[10] = new Product(11, "깔라만시\t", 6, 4500);
        products[11] = new Product(12, "카페라떼\t", 1, 4000);
        products[12] = new Product(13, "헤이즐넛라떼", 1, 5000);
        products[13] = new Product(14, "카라멜마끼아또", 1, 5000);
        products[14] = new Product(15, "아메리카노", 1, 4000);
        products[15] = new Product(16, "캐모마일\t", 6, 4500);
        products[16] = new Product(17, "아포가또\t", 3, 5500);
        products[17] = new Product(18, "비엔나커피", 1, 5000);
        products[18] = new Product(19, "베이글\t", 5, 3500);
        products[19] = new Product(20, "카푸치노\t", 1, 4000);
        products[20] = new Product(21, "허니브래드", 5, 6000);
        products[21] = new Product(22, "카페모카\t", 1, 5000);
        products[22] = new Product(23, "얼그레이\t", 6, 4500);
        products[23] = new Product(24, "히비아이스트", 3, 5000);
        products[24] = new Product(25, "플레인 와플", 5, 6000);
        products[25] = new Product(26, "요거트\t", 3, 5500);
        products[26] = new Product(27, "유자스무디", 4, 5000);
        products[27] = new Product(28, "딸기스무디", 4, 5000);

        // 직원 데이터 초기화
        employees[0] = new Employee(201, "Alice", "사원", 30000);
        employees[1] = new Employee(202, "Bob", "\t대리", 40000);
        employees[2] = new Employee(203, "Charlie", "과장", 50000);
        employees[3] = new Employee(204, "David", "사원", 32000);
        employees[4] = new Employee(205, "Eve", "\t대리", 42000);

        // 주문 데이터 초기화
        orders[0] = new Order(38167668, "2017-09-13 10:15", 1 ,1, 1);
        orders[1] = new Order(89217297, "2017-09-13 10:20", 2 ,12, 1);
        orders[2] = new Order(39178816, "2017-09-13 10:40", 3 ,13, 1);
        orders[3] = new Order(63105816, "2017-09-13 10:05", 4 ,14, 1);
        orders[4] = new Order(47018158, "2017-09-13 11:15", 5 ,15, 1);
        orders[5] = new Order(46078737, "2017-09-13 11:25", 6 ,16, 1);
        orders[6] = new Order(32215456, "2017-09-13 11:35", 7 ,17, 1);
        orders[7] = new Order(60728464, "2017-09-13 11:45", 8 ,18, 1);
        orders[8] = new Order(99145980, "2017-09-13 11:50", 9 ,10, 1);
        orders[9] = new Order(65700654, "2017-09-13 12:00", 8 , 2, 1);
        orders[10] = new Order(65700654, "2017-09-13 12:00", 7 ,3, 1);
        orders[11] = new Order(65700654, "2017-09-13 12:00", 6 ,4, 1);
        orders[12] = new Order(65700654, "2017-09-13 12:00", 5 ,5, 1);
        orders[13] = new Order(54449843, "2017-09-13 12:10", 4 ,6, 1);
        orders[14] = new Order(66578200, "2017-09-13 12:15", 3 ,7, 1);
        orders[15] = new Order(79287280, "2017-09-13 12:35", 3 ,8, 1);
        orders[16] = new Order(56679560, "2017-09-13 12:50", 6 ,11, 1);
        orders[17] = new Order(39865396, "2017-09-13 12:55", 4 ,12, 1);
        orders[18] = new Order(49791945, "2017-09-13 13:15", 6 ,13, 1);
        orders[19] = new Order(49791945, "2017-09-13 13:15", 8 ,14, 1);
        orders[20] = new Order(49791945, "2017-09-13 13:15", 11,15, 1);
        orders[21] = new Order(49791945, "2017-09-13 13:15", 12,2, 1);
        orders[22] = new Order(73592627, "2017-09-13 13:30", 13,2, 1);
        orders[23] = new Order(57111296, "2017-09-13 13:45", 14,2, 1);
        orders[24] = new Order(57111296, "2017-09-13 13:45", 15,3, 1);
        orders[25] = new Order(57111296, "2017-09-13 13:45", 16,3, 1);
        orders[26] = new Order(57111296, "2017-09-13 13:45", 17,3, 1);
        orders[27] = new Order(69598408, "2017-09-13 13:05", 18,3, 1);
        orders[28] = new Order(69598408, "2017-09-13 13:05", 19,4, 1);
        orders[29] = new Order(69598408, "2017-09-13 13:05", 20,4, 1);
        orders[30] = new Order(69598408, "2017-09-13 13:05", 23,5, 1);
        orders[31] = new Order(67173436, "2017-09-13 14:30", 22,6, 1);
        orders[32] = new Order(67173436, "2017-09-13 14:30", 23,7, 1);
        orders[33] = new Order(67173436, "2017-09-13 14:30", 24,8, 1);
        orders[34] = new Order(67173436, "2017-09-13 14:30", 25,9, 1);
        orders[35] = new Order(36320862, "2017-09-13 14:35", 26,1, 1);
        orders[36] = new Order(71781108, "2017-09-13 14:05", 27,2, 1);
        orders[37] = new Order(55756203, "2017-09-13 14:55", 28,3, 1);
        orders[38] = new Order(55756203, "2017-09-13 14:55", 19,4, 1);
        orders[39] = new Order(55756203, "2017-09-13 14:55", 20,5, 1);
        orders[40] = new Order(55756203, "2017-09-13 14:55", 22,6, 1);
        orders[41] = new Order(22817525, "2017-09-13 15:00", 23,7, 1);
        orders[42] = new Order(55183914, "2017-09-13 15:15", 11,8, 1);
        orders[43] = new Order(39118494, "2017-09-13 15:40", 12,9, 1);
        orders[44] = new Order(56152549, "2017-09-13 15:45", 13,1, 1);
        orders[45] = new Order(44004393, "2017-09-13 16:45", 14,1, 1);
        orders[46] = new Order(57522351, "2017-09-13 16:55", 15,2, 1);
        orders[47] = new Order(57522351, "2017-09-13 16:55", 17,2, 1);
        orders[48] = new Order(57522351, "2017-09-13 16:55", 19,2, 1);
        orders[49] = new Order(57522351, "2017-09-13 16:55", 29,3, 1);
        orders[50] = new Order(97267860, "2017-09-13 17:40", 28,3, 1);
        orders[51] = new Order(23534034, "2017-09-13 17:55", 27,3, 1);
        orders[52] = new Order(91629257, "2017-09-13 18:20", 26,3, 1);
        orders[53] = new Order(37776984, "2017-09-13 19:15", 25,4, 1);
        orders[54] = new Order(46888645, "2017-09-13 19:20", 24,4, 1 );
        orders[55] = new Order(47293154, "2017-09-13 19:25", 13,4, 1 );
        orders[56] = new Order(34402591, "2017-09-13 20:25", 1 ,4, 1 );
        orders[57] = new Order(75967086, "2017-09-13 20:45", 2 ,4, 1 );
        orders[58] = new Order(41288267, "2017-09-13 20:55", 3 ,5, 1 );
        orders[59] = new Order(38559076, "2017-09-13 21:25", 4 ,5, 1 );
        orders[60] = new Order(16229001, "2017-09-13 21:40", 5 ,5, 1 );
        orders[61] = new Order(59480814, "2017-09-13 22:00", 14,5, 1 );
        orders[62] = new Order(96791246, "2017-09-13 22:10", 15,12, 1);
        orders[63] = new Order(50021775, "2017-09-13 22:35", 16,10, 1);
        orders[64] = new Order(55861805, "2017-09-13 22:40", 17,12, 1);
        orders[65] = new Order(68585789, "2017-09-13 22:50", 18,13, 1 );
        orders[66] = new Order(92127744, "2017-09-13 22:55", 21,1 , 1 );
        orders[67] = new Order(92127744, "2017-09-13 22:55", 22,2 , 1 );
        orders[68] = new Order(92127744, "2017-09-13 22:55", 23,3 , 1 );
        orders[69] = new Order(92127744, "2017-09-13 22:55", 24,4, 1);
        orders[70] = new Order(94113278, "2017-09-13 23:15", 15,5, 1);
        orders[71] = new Order(17708771, "2017-09-13 23:20", 16,6, 1);
        orders[72] = new Order(71621027, "2017-09-13 23:25", 17,7, 1);
        orders[73] = new Order(49305845, "2017-09-13 23:45", 12,8, 1 );
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }
}