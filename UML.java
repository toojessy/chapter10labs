// Jessica Kamienski
// 10/24
  
public class Book {
  String title;
  String author;
  String pages;
  String genre;

  public Book(String title, String author, String genre) {
    this.title = title;
    this.author = author;
    this.genre = genre;
  }
}
public class BankAccount {
  private double balance;
  private String accountHolder;
  private String accountNumber;

  public BankAccount(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
}
public class Movie {
  String title;
  String rating;
  int playCount;
  double ticketPrice;

  public Movie(String title, String rating, double ticketPrice) {
    this.title = title;
    this.rating = rating;
    this.ticketPrice = ticketPrice;
  }
}
public class Rectangle {
  int width;
  int height;
  int area;
  double perimeter;

  public Rectangle(int width, int area) {
    this.width = width;
    this.area = area;
  }
}

