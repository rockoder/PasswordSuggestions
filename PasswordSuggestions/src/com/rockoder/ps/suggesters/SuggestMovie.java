package com.rockoder.ps.suggesters;

import java.util.Vector;

public class SuggestMovie {
	
	String[] movies = {
			"The Shawshank Redemption", 
			"The Godfather",
			"The Godfather: Part II",
			"The Dark Knight",
			"Pulp Fiction",
			"Schindler's List"
	};
	
	Vector<String> suggestMovies = null;
	
	public SuggestMovie()
	{
		suggestMovies = new Vector<>();
		
		for (String movie : movies)
		{
			convert(movie);
		}
	}
	
	public Vector<String> getMovieSuggestions()
	{
		return suggestMovies;
	}
	
	private void convert(String text)
	{
		StringBuilder str = new StringBuilder(text);
		
		for (int i = 0; i < text.length(); ++i)
		{
			switch (text.charAt(i))
			{
			case 'a':
				str.setCharAt(i, '@');
				break;

			case 'e':
				str.setCharAt(i, '3');
				break;

			case 'i':
				str.setCharAt(i, '1');
				break;

			case 'o':
				str.setCharAt(i, '0');
				break;

			case 'u':
				str.setCharAt(i, '&');
				break;
			}
		}
		
		suggestMovies.add(str.toString());
	}
}
