import java.util.*;
class Book{
  private String Bookname;
  private int NoOfBooks;
  Book(){
    Bookname = null;
    NoOfBooks = 0;
  }
  Book(String Bn,int nb) {
    Bookname=Bn;
    NoOfBooks=nb;
  }
  public void SetBookname(String bn){
    Bookname = bn;
  }
  public String GetBookname(){
    return Bookname;
  }
  public void SetNoofBooks(int n){
    NoOfBooks = n;
  }
  public int GetNoOfBooks(){
    return NoOfBooks;
  }
}
class Main{
  static Scanner kbd = new Scanner(System.in);
  public static void main(String[] args){
    ArrayList<Book> B = new ArrayList<>();
    String name;
    int tot;
    for(int i = 0;i < 2;i++) {
      System.out.println("Enter the name of the Book: ");
      name = kbd.nextLine();
      System.out.println("Total no of books which has the same name: ");
      tot = kbd.nextInt();
      kbd.nextLine();
      B.add(new Book(name,tot));
    }
    for(Book s:B) {
      System.out.println("Book name :"+s.GetBookname());
      System.out.println("No.of.Books :"+s.GetNoOfBooks());
    }
  }
}