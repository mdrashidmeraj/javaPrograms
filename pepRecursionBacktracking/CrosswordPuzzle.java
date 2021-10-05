package pepRecursionBacktracking;

import java.io.*;
import java.util.*;

public class CrosswordPuzzle {
		public static void solution(char[][] arr, String[] words, int vidx){
			if(vidx == words.length) {
				print(arr);
				return;
			}
			
			String word = words[vidx];
			
			for(int i=0;i<arr.length;i++) {
				for(int j = 0;j<arr[i].length;j++) {
					if(arr[i][j] == '-' || arr[i][j] == word.charAt(0)) {
						if(canHorizontally(arr,i,j,word)) {
							boolean[] wePlaced = placeHorizontally(arr,i,j,word);
							solution(arr,words,vidx+1);
							removeHorizontally(arr,i,j,wePlaced);
						}

						if(canvertically(arr,i,j,word)) {
							boolean[] wePlaced = placevertically(arr,i,j,word);
							solution(arr,words,vidx+1);
							removevertically(arr,i,j,wePlaced);
						}
					}
				}
			}

		}
		
		private static void removevertically(char[][] arr, int i, int j, boolean[] wePlaced) {
			for(int ii = 0;ii<wePlaced.length;ii++) {
				if(wePlaced[ii] == true) {
					arr[i+ii][j] = '-';
				}
			}
			
		}

		private static boolean[] placevertically(char[][] arr, int i, int j, String word) {
			boolean[] wePlaced = new boolean[word.length()];
			
			for(int ii = 0;ii<word.length();ii++) {
				if(arr[i+ii][j] == '-') {
					arr[i+ii][j] = word.charAt(ii);
					wePlaced[ii] = true;
				}
			}
			return wePlaced;
			
		}

		private static void removeHorizontally(char[][] arr, int i, int j, boolean[] wePlaced) {
			for(int jj = 0;jj<wePlaced.length;jj++) {
				if(wePlaced[jj] == true) {
					arr[i][jj+j] = '-';
				}
			}
			
		}

		private static boolean[] placeHorizontally(char[][] arr, int i, int j, String word) {
			boolean[] wePlaced = new boolean[word.length()];
			
			for(int jj = 0;jj<word.length();jj++) {
				if(arr[i][j+jj] == '-') {
					arr[i][j+jj] = word.charAt(jj);
					wePlaced[jj] = true;
				}
			}
			return wePlaced;
		}

		public static boolean canHorizontally(char[][] arr, int i, int j, String word) {
			
			if(j-1 >= 0 && arr[i][j - 1] != '+') return false;
			if(j+word.length() < arr[0].length && arr[i][j+word.length()] != '+') return false;
		
			for(int jj = 0;jj<word.length();jj++) {
				if(j+jj >= arr[0].length) return false;
				
				if(arr[i][j+jj] == '-' || arr[i][j+jj] == word.charAt(jj)) {
						continue;
				}else return false;
			}
			return true;
			
		}
		
		public static boolean canvertically(char[][] arr, int i, int j, String word) {
			
			if(i-1 >= 0 && arr[i-1][j] != '+') return false;
			if(i+word.length() < arr.length && arr[i+word.length()][j] != '+') return false;
		
			for(int ii = 0;ii<word.length();ii++) {
				if(i+ii >= arr.length) return false;
				
				if(arr[i+ii][j] == '-' || arr[i+ii][j] == word.charAt(ii)) {
						continue;
				}else return false;
			}
			return true;
		}
		
		public static void print(char[][] arr){
			for(int i = 0 ; i < arr.length; i++){
				for(int j = 0 ; j < arr.length; j++){
					System.out.print(arr[i][j]);
				}
	                  System.out.println();
			}
			
		}
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			char[][] arr = new char[10][10];
			for(int i = 0 ; i < arr.length; i++){
				String str = scn.next();
				arr[i] = str.toCharArray();
			}
			int n = scn.nextInt();
			String[] words = new String[n];
			for(int i = 0 ; i  < words.length; i++){
				words[i] = scn.next();
			}

		}
	
}
