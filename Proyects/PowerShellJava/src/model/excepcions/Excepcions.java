package model.excepcions;

public class Excepcions extends Exception {

    public static class CommandNotFoundException extends Throwable {
        String m;

        public CommandNotFoundException(String m) {
            this.m = m;
//            super(m);
        }

    }



}
