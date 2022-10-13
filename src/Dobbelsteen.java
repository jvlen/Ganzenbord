public class Dobbelsteen {

    public static int dobbelsteen1 = 0;
    public static int dobbelsteen2 = 0;


    public static int gooiDobbelsteen1() { //gooit de eerste dobbelsteen
        dobbelsteen1 = (int) (Math.random() * (6) + 1);
        return dobbelsteen1;
    }

    public static int gooiDobbelsteen2() { //gooit de tweede dobbelsteen
        dobbelsteen2 = (int) (Math.random() * (6) + 1);
        return dobbelsteen2;
    }

    public static int dobbelsteenSum() { //telt beide worpen bij elkaar op
        return (dobbelsteen1 + dobbelsteen2);
    }

    public static int laatsteWorp() {
        return dobbelsteenSum();
    }
}
