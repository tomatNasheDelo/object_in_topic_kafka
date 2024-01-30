package com.example.demo;

import org.springframework.stereotype.Component;



//Class 

@Component
public class Book2 { 

 // Class data members 
 private String bookName; 
 private String isbn; 
 private  int booktId;
 private String stageId;

 // Constructor 1 
 public Book2() {} 

 // Constructor 2 
 public Book2(String bookName, String isbn, int bookId, String stageId) 
 { 
     this.bookName = bookName; 
     this.isbn = isbn; 
     this.booktId = bookId;
     this.stageId = stageId; 
 } 

 
 
 // Getter 
 public String getBookName() { return bookName; } 

 // Setter 
 public void setBookName(String bookName) 
 { 
     this.bookName = bookName; 
 } 

 // Getter 
 public String getIsbn() { return isbn; } 

 // Setter 
 public void setIsbn(String isbn) { this.isbn = isbn; }

public int getBooktId() {
	return booktId;
}

public void setBooktId(int booktId) {
	this.booktId = booktId;
}

public String getStageId() {
	return stageId;
}

public void setStageId(String stageId) {
	this.stageId = stageId;
}

@Override
public String toString() {
	return "Book [bookName=" + bookName + ", isbn=" + isbn + ", booktId=" + booktId + ", stageId=" + stageId + "]";
} 


 
}