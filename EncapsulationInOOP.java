class Bank{
   public  String name;
   protected  String email;
   private  String password;

   public String getPassword(){
    return this.password;
   }

   public void setPassword(String pass){
    this.password = pass;
   }
}

public class EncapsulationInOOP {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.name = "rabbi";
        bank.email = "mohammad@gmail.com";
        bank.setPassword("123as");
        System.out.println(bank.getPassword());

    }
}
