/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.signin;

/**
 * Class to hold a post on an online thread
 * @author Andrew
 */
public class WebPost 
{
    public WebPost()
    {
        title = "NO TITLE";
        author = "NO AUTHOR";
        date = "NO DATE";
        content = "NO CONTENT";
    }
    
    public WebPost(String t, String a, String d, String c)
    {
        title = t;
        author = a;
        date = d;
        content = c;
    }
    
    public String writeFormat()
    {
        String writeMe = "";
        writeMe += (title + "\n");
        writeMe += (author + "\n");
        writeMe += (date + "\n");
        writeMe += (content + "\n");
        writeMe += ("<endPost>");
        
        return writeMe;
    }
    
    public String debugFormat()
    {
        String writeMe = "";
        writeMe += ("Title: " + title + "\n");
        writeMe += ("Author: " + author + "\n");
        writeMe += ("Date: " + date + "\n");
        writeMe += ("Content: " + content);
        
        return writeMe;
    }
    
    private String title;
    private String author;
    private String date;
    private String content;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}
