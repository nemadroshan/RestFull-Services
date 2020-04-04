package com.micropo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Book  implements Serializable {
    @JsonProperty
    private String isbn;
    @JsonProperty
    private String title;
    @JsonProperty
    private String author;
    @JsonProperty
    private Double price;

    public Book(){
        System.out.println("Book :: zero param constructor");
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
