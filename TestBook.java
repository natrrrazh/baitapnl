public class TestBook {
    public static void main(String[] args) {
        // Tạo một đối tượng Book
        Book myBook = new Book("example@email.com", 'm');
        System.out.println("Email: " + myBook.getEmail());
        System.out.println("Gender: " + myBook.getGender());
    }
}