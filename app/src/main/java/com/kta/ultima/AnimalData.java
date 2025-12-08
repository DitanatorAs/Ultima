package com.kta.ultima;


public class AnimalData {
    public final int[] names = {
            R.string.cat,
            R.string.dog,
            R.string.cow,
            R.string.frog,
            R.string.duck
    };

    public final int[] images = {
            R.drawable.cat,
            R.drawable.dog,
            R.drawable.cow,
            R.drawable.frog,
            R.drawable.duck
    };

    public final int[] sounds = {
            R.string.cat_sounds,
            R.string.dog_sounds,
            R.string.cow_sounds, // ← вы, кажется, написали cat_sounds дважды!
            R.string.frog_sounds,
            R.string.duck_sounds
    };
}