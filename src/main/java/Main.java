
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 26;
        post.birthday.mount = 3;
        post.birthday.year = 2003;
        post.name = "Петр";
        post.passport = "4231 № 321234";
        post.patronymic = "Иванович";
        post.phone = "+7(915)-421-24-14";
        post.surname = "Петрушкин";
        post.subscription = true;
    }
}