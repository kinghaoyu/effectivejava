package com.why.p8equals;

/**
 * 描述:
 * 传递性----equals 同时兼容子类和父类
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)){
            return false;
        }
        Point p = (Point) obj;
        return p.x == x && p.y == y;
    }



    public static class ColorPoint extends Point{
        private final Color color;
        public ColorPoint(int x, int y, Color color){
            super(x, y);
            this.color = color;
        }

        /**
         * 违反了 对称性
         */
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof ColorPoint)){
                return false;
            }
            return super.equals(obj) && ((ColorPoint) obj).color == color;
        }

//        /**
//         * 违反了传递性
//         */
//        @Override
//        public boolean equals(Object obj) {
//            if (!(obj instanceof Point)){
//                return false;
//            }
//            if(!(obj instanceof ColorPoint)){
//                return obj.equals(this);
//            }
//            return super.equals(obj) && ((ColorPoint) obj).color == color;
//        }
    }

    enum Color{
        RED,BLUE;
    }

    public static void main(String[] args) {
        //* 违反了 对称性 测试
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        System.out.println(cp.equals(p));
        System.out.println(p.equals(cp));







        //违反了传递性 测试
//        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
//        Point p2 = new Point(1, 2);
//        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
//        System.out.println(p1.equals(p2));
//        System.out.println(p2.equals(p3));
//        System.out.println(p1.equals(p3));
    }


    //怎么解决呢？








    //我们无法在扩展可实例化的类的同时，既增加新的值组件，同时又保
    // 留 equals 约定， 除非愿意放弃面向对象的抽象所带来的优势
}
