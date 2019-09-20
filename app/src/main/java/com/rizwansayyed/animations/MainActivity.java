package com.rizwansayyed.animations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    mainadapter adapter;
    Context context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerview);


        query();
    }

    private void query() {

        List<users> data = fill_with_data();

        mainadapter adapter = new mainadapter(context, data);
        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
    }


    public List<users> fill_with_data() {

        List<users> data = new ArrayList<>();

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        data.add(new users(R.drawable.ic_girl, "Ruby Wall", "It’s important to know what matters to you and why you decided to begin your startup journey in the first place"));
        data.add(new users(R.drawable.ic_user, "David Oliver", "Business can be a confidence game. Irrespective of whether that confidence is right or wrong, I would always have more confidence than non at all. What do you think?"));
        data.add(new users(R.drawable.ic_student, "Madison Nolen", "I know of a great group for women that help build self-confidence on FB."));
        data.add(new users(R.drawable.ic_man, "Logan Axe", "Worried that not everyone will like your business idea? Great! It means you’re trying something unprecedented, something innovativeness or possibly something that they market doesn’t know they’re ready for yet."));

        return data;
    }
}
