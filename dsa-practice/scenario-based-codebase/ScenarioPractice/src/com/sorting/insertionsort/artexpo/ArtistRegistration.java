package com.sorting.insertionsort.artexpo;

import java.util.ArrayList;

import java.util.List;
public class ArtistRegistration {
	static List<Registration> artist = new ArrayList<>();
	
	public void addArtist(Registration newArtist) {
		artist.add(newArtist);
		System.out.println("Artist added");
	}
	
	
    public static void insertionSort() {
        int n = artist.size();

        for (int i = 1; i < n; i++) {
            Registration key = artist.get(i);
            int j = i - 1;

            while (j >= 0 && artist.get(j).getTime().isAfter(key.getTime())) {
                artist.set(j + 1, artist.get(j));
                j--;
            }
            j++;
            artist.set(j, key);
        }
        System.out.println("Artist sorted successfully: ");
    }
    public void showArtist() {
    	if(artist.isEmpty()) {
    		System.out.println("Empty artist");
    		return;
    	} 
    	
    	for(Registration at: artist) {
    		System.out.println(at);
    	}
    }
}
