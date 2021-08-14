package com.spring.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="BOOKS")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "BOOK_TITLE")
    private String bookTitle;
    @Column(name = "BOOK_COUNT")
    private int count;
    @Column (name = "BOOK_PRICE")
    private int price;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Temporal(TemporalType.DATE)
    @Column(name = "BOOK_DATE")
    private Date dateOfIssue=new Date(System.currentTimeMillis());

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Book(String bookTitle, int count, int price, Date dateOfIssue) {
        this.bookTitle = bookTitle;
        this.count = count;
        this.price = price;
        this.dateOfIssue = dateOfIssue;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", dateOfIssue=" + dateOfIssue +
                '}';
    }
}
