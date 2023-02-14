package lesson_57_TreeSet.homeTask.controller;

import lesson_57_TreeSet.homeTask.model.Post;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Post> posts = new TreeSet<>();
        posts.add(new Post(33, "first post", 3));
        posts.add(new Post(23, "second post", 4));
        posts.add(new Post(43, "third post", 6));
        posts.add(new Post(53, "fourth post", 7));
        posts.add(new Post(63, "fifth post", 8));
        posts.add(new Post(73, "sixth post", 9));
        System.out.println(posts);
        System.out.println("*".repeat(100));
        TreeSet<Post> posts1 = new TreeSet<>(new Comparator<Post>() {
            @Override
            public int compare(Post o1, Post o2) {
                return Integer.compare(o1.getLikesNumber(), o2.getLikesNumber());
            }
        }.thenComparing(new Comparator<Post>() {
            @Override
            public int compare(Post o1, Post o2) {
                return Integer.compare(o1.getText().length(),o2.getText().length());
            }
        }));
        posts1.add(new Post(33, "first post", 3));
        posts1.add(new Post(23, "second post", 4));
        posts1.add(new Post(43, "third post", 6));
        posts1.add(new Post(53, "fourth post", 7));
        posts1.add(new Post(63, "fifth post", 8));
        posts1.add(new Post(73, "sixth post", 9));
        System.out.println(posts1);
        System.out.println("*".repeat(100));

    }
}