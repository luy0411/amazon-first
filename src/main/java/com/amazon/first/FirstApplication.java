package com.amazon.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {

		String[] entry = {
			"raincoat", "rain", "coat",	"cup",
			"cake",	"cupcake",	"fireman", "fire",
			"man", "sunglasses", "sun", "glasses",
			"blackboard", "black", "board","football",
			"foot",	"ball",	"moonlight",
			"moon",	"toothbrush","tooth",
			"brush","starfish",	"star",	"fish",	"wheelchair",
			"wheel", "chair", "lighthouse", "light",
			"house", "firefly",	"fly", "rockstar", "rock",
			"rockstars", "tar", "rocks"
		};

		Set<String> words = Set.of(entry);
        List<List<String>> groups = new ArrayList<>();

		words.stream().forEach(word -> {
			StringBuffer partialWord = new StringBuffer();

            List<String> group = new ArrayList<>();

            List<Character> letters = Pattern.compile("")
                                             .splitAsStream(word)
                                             .map(i -> i.charAt(0))
                                             .collect(Collectors.toList());

            for (Character letter : letters) {
                partialWord.append(letter);

                if (words.contains(partialWord.toString())){
                    group.add(partialWord.toString());
                    partialWord = new StringBuffer();
                }

			}

            if (group.size() > 1) {
                groups.add(group);
            }

			System.out.println("");
		});

        System.out.println("Finito");

    }

}
