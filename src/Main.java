public class Main {
	public static void main(String[] args) {
		System.out.println("Задача 1");
		byte one = 126;
		System.out.println("Значение переменной  one с типом   byte равно " + one);
		short two = 300;
		System.out.println("Значение переменной  two с типом   short равно " + two);
		int three = 52000;
		System.out.println("Значение переменной  three с типом   int равно " + three);
		long four = 1230L;
		System.out.println("Значение переменной  four с типом   long равно " + four);

		System.out.println("Задача 2");

        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int h = 27897;
        byte w = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(h);
        System.out.println(w);

        System.out.println("Задача 3");

        byte studentsLyudmila = 23;
        short studentsAnna = 27;
        int studentsKati = 30;
        int totalSheets = 480;
        int sheetStunets =totalSheets/ (studentsLyudmila + studentsAnna + studentsKati);
        System.out.println("На каждого ученика рассчитано "+ sheetStunets + " листов бумаг ");

        System.out.println("Задача 4");
        int bottles2minutes=16;
        int minutes2= 2;
        int minutes20 = 20;
        int bottles20minutes=(minutes20/minutes2)*bottles2minutes;
        System.out.println("За 20 минут машина произвела "+ bottles20minutes+ " штук бутылок");
        int hoursDay = 24;
        int minutesHoursDay = hoursDay*60;
        int bootlesHoursDay = (minutesHoursDay/minutes2)*bottles2minutes;
        System.out.println("За сутки  машина произвела "+ bootlesHoursDay+ " штук бутылок");
        int threeDay = 3;
        int bottlesThreDay= bootlesHoursDay*threeDay;
        System.out.println("За 3 дня  машина произвела "+ bottlesThreDay+ " штук бутылок");
        int month = 30;
        int bottlesMonth= bootlesHoursDay*month;
        System.out.println("За месяц  машина произвела "+ bottlesMonth + " штук бутылок");
        System.out.println("Задача 5");
        int repairSchoolBank = 120;
        int potBankClassWhite=2;
        int potBankClassBrown=4;
        int bankClass1=potBankClassWhite+potBankClassBrown; // Посчитаем сколько банок уходит на покраску одного класса
        int totalClass = repairSchoolBank/bankClass1; // Посчитаем сколько всего классов
        int bankWhite = totalClass*potBankClassWhite; //Посчитаем количество белой красски на 20 классов
        int bankBrown= totalClass*potBankClassBrown; // Посчитаем количество коричневой краски на 20 классов
        System.out.println("В школе, где " +totalClass+ " классов, нужно " + bankWhite + " банок белой краски и " +bankBrown+" банок коричневой краски");
        System.out.println("Задача 6");
        int banana=5;
        int banana1=80;// вес 1 банана 80 грамм
        int totalBanana=banana*banana1;
        int milk=200;// По условию миллитры
        int milk100= 105;// в 100 миллилитрах 105 грамм молока
        int tootalGrammMilk = milk100+milk100;// Считаем сколько грамм в 200 мл , также можно просто умножить на 2
        int iceCream = 2;// 2 брикета по условиям
        int iceCream1Gramm= 100;
        int totalIceCream2Gramm= iceCream1Gramm*iceCream;//на 2 брикеты количество грамм
        int eggs=4;
        int eggs1=70; //в 1 яйце грамм
        int totalEggs=eggs*eggs1;// на 4 яйца грамм
        int totalCocktail=totalBanana+tootalGrammMilk+totalIceCream2Gramm+totalEggs;
        // Переводим общий вес в килограммы
        float totalKg=(float) totalCocktail/1000;
        System.out.println("Вес спортивного завтрака составил  " + totalCocktail+" грамм = "+ totalKg+" кг");
        System.out.println("Задача 7");
        int goalKg = 7;// Цель 7 кг скинуть
        // Переводим цель из кг в граммы
        int goalGramm= goalKg*1000;
                int losinhWeight250=250;
        int losingWeight500=500;
        int days250=goalGramm/losinhWeight250;
        int days500=goalGramm/losingWeight500;
        double averageDay= (days250+days250)/2;// Считаем среднее количество дней
            System.out.println(days250+ " Дней понадобиться спортсмену для похудения, теряя в день 250 грамм");
            System.out.println(days500+ " Дней понадобиться спортсмену для похудения, теряя в день 500 грамм");
            System.out.println("В среднем дней понадобиться спортсмену для похудения " + averageDay);
            System.out.println("Задача 8");
            // Текушие зарплаты сотрудников из условия
            double mashaSalary=67760;
            double denisSalary=83690;
            double krisSalary=76230;
            double percentRaised=10;//Процент повышения зарплаты
            //Считаем зарплаты  после повышения
            double newMashaSalary=mashaSalary+(mashaSalary*percentRaised/100);
            double newDenisSalary=denisSalary+(denisSalary*percentRaised/100);
            double newKrisSalary = krisSalary+(krisSalary*percentRaised/100);


            //Рассчитываем разницу зарплаты в годовом доходе

        double yearDifferenceMasha=(  newMashaSalary*12)-(mashaSalary*12);
        double yearDifferenceDenis=(newDenisSalary*12)-(denisSalary*12);
        double yearDifferenceKris=(newKrisSalary*12)-(krisSalary*12);

            System.out.println("Маша теперь получает "+ newMashaSalary+ " рублей. Годовой доход вырос на "+ yearDifferenceMasha);
            System.out.println("Денис теперь получает "+ newDenisSalary+ " рублей. Годовой доход вырос на "+ yearDifferenceDenis);
            System.out.println("Кристина теперь получает "+ newKrisSalary+ " рублей. Годовой доход вырос на "+ yearDifferenceKris);


    }

}