// package JavaModule01.ex00;
// import JavaModule01.ex00.User;

class Program {
    public static void main(String args[]){
        User othmane = new User("othmane", 500);
        User simo    = new User("simo", 100);

        othmane.sendMoney(simo, 300);
        System.out.println("othmane now has " + othmane.getBalance());
        System.out.println("simo now has " + simo.getBalance());
    }
}