package eu.mytthew;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// LAB2 EX1
//        final String currentPassword = "12345";
//        System.out.println("Podaj haslo:");
//        String password = scanner.nextLine();
//        if (password.equals(currentPassword)) {
//            System.out.println("Successfully logged in");
//        }

		// LAB2 EX2
//        int result = 0;
//        for (int i = 0 ; i < 5; i++) {
//            System.out.print("Podaj liczbe: ");
//            int number = scanner.nextInt();
//            result += number;
//            if (result > 33) {
//                System.out.println("Suma liczb wieksza niz 33.");
//            }
//        }

		// LAB2 EX3
//        System.out.print("Podaj maksymalna dlugosc ciagu: ");
//        int maxLenght = scanner.nextInt();
//        System.out.print("Podaj ciag znakow: ");
//        scanner.nextLine();
//        String text = scanner.nextLine();
//        if (text.length() > maxLenght) {
//            System.out.println("Mati twoj kutas jest za dlugi.");
//        }
//        System.out.println("Dlugosc ciagu = " + text.length());

		// LAB2 EX4
//        boolean isDivide = true;
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Podaj liczbe: ");
//            int number = scanner.nextInt();
//            if (number % 2 != 0) {
//                isDivide = false;
//            }
//        }
//        if (isDivide) {
//            System.out.println("Wszystkie liczby sa podzielne przez 2");
//        }

//        // LAB2 EX5
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Podaj ciag znakow: ");
//            String text = scanner.nextLine();
//            if (text.isEmpty()) {
//                System.out.println("Ciag jest pusty.");
//            }
//        }

		// LAB2 EX6
//        System.out.print("Podaj boki (po kolei a,b,c) ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        solveSquareEquation(a, b, c);

		// LAB2 EX7
//        System.out.print("Podaj jeden bok prostokata: ");
//        double a = scanner.nextDouble();
//        System.out.print("Podaj drugi bok prostokata: ");
//        double b = scanner.nextDouble();
//        if (a < 1 || b < 1) {
//            System.out.println("Nie mozna utworzyc prostokata, jeden z bokow jest za krotki.");
//        } else {
//            double field = a * b;
//            System.out.println("Pole prostokata o podanych bokach = " + field);
//        }

		// LAB2 EX8
//        System.out.print("Podaj nazwe miesiaca po angielsku: ");
//        String month = scanner.nextLine();
//        howManyDays(month);

		// LAB2 EX9
//        System.out.print("Podaj liczbe od 1 do 7: ");
//        int number = scanner.nextInt();
//        System.out.println(weekDayName(number));

		// LAB2 EX10
//        System.out.print("Podaj liczbe od 1 do 9: ");
//        int number = scanner.nextInt();
//        System.out.println(numberName(number));

		// LAB2 EX11
//        System.out.print("Podaj pierwsza liczbe: ");
//        double a = scanner.nextDouble();
//        System.out.print("Podaj druga liczbe: ");
//        double b = scanner.nextDouble();
//        System.out.print("Podaj znak dzialania: ");
//        char sign = scanner.next().charAt(0);
//        simpleCalculator(a, b, sign);

		// LAB2 EX13
//        System.out.print("Podaj liczbe punktow otrzymanych na egzaminie: ");
//        int points = scanner.nextInt();
//        if (points > 20) {
//            System.out.println("Bledna liczba punktow!");
//        } else {
//            System.out.print("Twoja ocena to: " + giveGrade(points));
//        }
	}

	private static void solveSquareEquation(int a, int b, int c) {
		double delta = (Math.pow(b, 2)) - (4 * a * c);
		System.out.println("Delta = " + delta);
		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Delta is greater than zero - results:");
			System.out.println("x1 = " + x1 + ", x2 = " + x2 + "\n");
		} else if (delta == 0) {
			float x0 = -b / (2.0f * a);
			System.out.println("Delta equal 0 - result:");
			System.out.println("x0 = " + x0 + "\n");
		} else {
			System.out.println("Delta smaller than 0, no results.\n");
		}
	}

	private static void howManyDays(String month) {
		if (month != null) {
			switch (month) {
				case "january":
				case "march":
				case "may":
				case "july":
				case "august":
				case "october":
				case "december":
					System.out.println(month + " has 31 days\n");
					break;
				case "february":
					System.out.println(month + " has 28 or 29 days\n");
					break;
				case "april":
				case "june":
				case "september":
				case "november":
					System.out.println(month + " has 30 days\n");
					break;
			}
		}
	}

	private static String weekDayName(int weekDay) {
		String nameOfWeekDay = "";
		switch (weekDay) {
			case 1:
				nameOfWeekDay = "Monday";
				break;
			case 2:
				nameOfWeekDay = "Tuesday";
				break;
			case 3:
				nameOfWeekDay = "Wednesday";
				break;
			case 4:
				nameOfWeekDay = "Thursday";
				break;
			case 5:
				nameOfWeekDay = "Friday";
				break;
			case 6:
				nameOfWeekDay = "Saturday";
				break;
			case 7:
				nameOfWeekDay = "Sunday";
				break;
		}
		return nameOfWeekDay;
	}

	private static String numberName(int number) {
		String nameOfNumber = "";
		switch (number) {
			case 1:
				nameOfNumber = "One";
				break;
			case 2:
				nameOfNumber = "Two";
				break;
			case 3:
				nameOfNumber = "Three";
				break;
			case 4:
				nameOfNumber = "Four";
				break;
			case 5:
				nameOfNumber = "Five";
				break;
			case 6:
				nameOfNumber = "Six";
				break;
			case 7:
				nameOfNumber = "Seven";
				break;
			case 8:
				nameOfNumber = "Eight";
				break;
			case 9:
				nameOfNumber = "Nine";
				break;
		}
		return nameOfNumber;
	}

	private static void simpleCalculator(double first, double second, char sign) {
		double result = 0;
		if (second == 0 && sign == '/') {
			System.out.println("You cannot divide by zero ");
		} else if (sign == '+' || sign == '-' || sign == '*' || sign == '/') {
			switch (sign) {
				case '+':
					result = first + second;
					break;
				case '-':
					result = first - second;
					break;
				case '*':
					result = first * second;
					break;
				case '/':
					result = first / second;
			}
			System.out.println("Result: " + result);
		}
	}

	private static float giveGrade(int amountOfPoints) {
		float mark = 2.0f;
		if (amountOfPoints >= 11 && amountOfPoints <= 12) {
			return 3.0f;
		} else if (amountOfPoints >= 13 && amountOfPoints <= 14) {
			mark = 3.5f;
		} else if (amountOfPoints >= 15 && amountOfPoints <= 16) {
			mark = 4.0f;
		} else if (amountOfPoints >= 17 && amountOfPoints <= 18) {
			mark = 4.5f;
		} else if (amountOfPoints >= 19 && amountOfPoints <= 20) {
			mark = 5.0f;
		}
		return mark;
	}
}
