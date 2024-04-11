public class Account {
    private int account_no;
    private String name;
    private int age;
    private float balance;

    public Account(){
        account_no = 1;
        name = "Susan Ward";
        age = 35;
        balance = 500;
    }

    public void showData(){
        System.out.println("Account number = " + account_no);
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Balance of this customer is = " + balance);
    }
    public static void main(String[] args)  {
        Account ac = new Account();
        ac.showData();
    }
}
