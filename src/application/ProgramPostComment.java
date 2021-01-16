package application;

import entities.PostComment.Comment;
import entities.PostComment.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramPostComment {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Comment c1 = new Comment("Have a nice trip!!");
        Comment c2 = new Comment("Wow, that's awesome!");

        Post p1 = new Post(
                sdf.parse("21/06/2019 13:05"),
                "Traveling to new Zelland",
                "I'm going to visit this wonderful country!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        /*
        Post 2
         */

        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(
                sdf.parse("28/07/2019 23:40"),
                "Good night guys",
                "See you tomorrow!",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);



    }
}
