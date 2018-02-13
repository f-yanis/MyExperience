package ru.fyanis.fjava.chapter12.test1;


public class Test5 {}


class BaseballExeption extends Exception {}
class Foul extends BaseballExeption {

    }
class Strike extends BaseballExeption {

    }

abstract class Inning {
        public Inning() throws BaseballExeption {}
        public void event() throws BaseballExeption {}
        public abstract void atBat() throws Strike, Foul;
        public void walk(){}
    }

class StormException extends Exception {
}
class RaineOut extends StormException {

}
class PopFoul extends Foul {

}

interface Storm {
    public void event() throws RaineOut;

    public void rainHard() throws RaineOut;
}

class StormyInning extends Inning implements Storm {
    public StormyInning() throws BaseballExeption {

    }


    public void atBat(){

    }

    public void rainHard(){

    }

    @Override
    public void event() {

    }
}