package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author first = new Author("Александр", "Пушкин");
        Author second = new Author("Михаил", "Лермонтов");
        Book firstBook = new Book("Сказки", " Александр Пушкин", 2010);
        Book secondBook = new Book("Стихи", " Михаил Леромонтов", 1995);
        firstBook.setYearOfPublication(2020);
    }
    }

