package com.student;

public class Book {

		int bookId;
		String bookName;
		String authorName;
		
		public Book(int bookId, String bookName, String authorName) {
			this.bookId = bookId;
			this.bookName = bookName;
			this.authorName = authorName;
		}
		
		public void bookAvailability() {
			System.out.println("Book "+bookName+" is available in the library.");
		}

		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + "]";
		}
		
}
