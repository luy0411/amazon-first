package com.amazon.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {

		String[] entry = {
			"raincoat", "rain", "coat",	"cup",
			"cake",	"cupcake",	"fireman", "fire",
			"man", "sunglasses", "sun", "glasses",
			"blackboard", "black", "board","football",
			"foot",	"ball",	"moonlight",
			"moon",	"light","toothbrush","tooth",
			"brush","starfish",	"star",	"fish",	"wheelchair",
			"wheel", "chair", "lighthouse", "light",
			"house", "firefly",	"fire",	"fly", "rockstar", "rock",
			"rockstars", "tar", "rocks"
		};

		Set<String> words = Set.of(entry);

		words.stream().forEach(System.out::println);

	}

}
