public class Main {

    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport = "1333 №456789";
        post.patronymic = "Иванович";
        post.phone = "+7 (968)-882-77-33";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 03;
        post.birthday.year = 1971;
    }
}