import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Asosiy meny🍽️");
        System.out.println("2.Bizning ijtimoiy tarmoqlarimiz🌐");
        System.out.println("3.Qayta aloqa💬");
        int a = s.nextInt();
        switch (a) {
            case 1 -> {
                System.out.println("KFC GA XUSH KELIBSIZ!🍗");
                System.out.println("1.Menyu🍔🍗🍹");
                System.out.println("2.Fillianlarimiz");
                System.out.println("3.Oshxona boylab ekskursiya 🚩");
                System.out.println("4.Karyera👨🏻‍");
                System.out.println("5.Orqaga⬅️");
                int main_1 = s.nextInt();
                switch (main_1) {
                    case 1 -> {
                        System.out.println("Ouqatni tanlang🍔🍟🥤");
                        System.out.println("1.Burgerlar🍔");
                        System.out.println("2.Tovuq1🍗");
                        System.out.println("3.Basketlar🍿");
                        System.out.println("4.Sneklar🍟");
                        System.out.println("5.Salatlar🥗");
                        System.out.println("6.Shirinliklar🍰");
                        System.out.println("7.Salqin ichimliklar🍹");
                        System.out.println("8.Souslar🥫");
                        System.out.println("9.Lanchbokslar🍟🍔🥤");
                        System.out.println("10.Orqaga⬅️");
                        int menu = s.nextInt();
                        switch (menu) {
                            case 1 -> {
                                System.out.println("🍔Burgerlar🍔\n\n");
                                System.out.println("1.Tvister Junior🌯");
                                System.out.println("2.Ay-Tvister Чиз🌯");
                                System.out.println("3.Longer🌯");
                                System.out.println("4.Achiq Tvister🌯");
                                System.out.println("5.Original Tvister🌯");
                                System.out.println("6.Tvister Vedji🌯");
                                System.out.println("7.Cheeseburger🍔");
                                System.out.println("8.Cheeseburger De Lux🍔");
                                System.out.println("9.Chefburger🍔");
                                System.out.println("10.Achiq Chefburger🍔");
                                System.out.println("11.Boxmaster🌮");
                                System.out.println("12.O'rqaga⬅️");
                                int hum = s.nextInt();


                                switch (hum) {
                                    case 1 -> {
                                        System.out.println("\n\ntwister junior\n\n" +
                                                "pishloqli\n" +
                                                "tort,\n" +
                                                "ikki\n" +
                                                "suvli\n" +
                                                "original tovuq chiziqlari\n" +
                                                "non, xantal, ketchup, pishloq,\n" +
                                                "tuzlangan bodring\n" +
                                                "Va\n" +
                                                "piyoz\n" +
                                                "mukammal gazak\n\n");
                                        System.out.println("10000 so'm");
                                    }
                                    case 2 -> {
                                        System.out.println("\n\ni-twister pishloq\n\n" +
                                                "yumshoq pishloqli suvli tovuqning ta'mi va\n" +
                                                "kfc da i-twister pishloqidagi pishloq sousi!\n" +
                                                "birinchi luqmadagi haqiqiy sevgi\n\n");
                                        System.out.println(9000);
                                    }
                                    case 3 -> {
                                        System.out.println("\n\nLonger\n\n" +
                                                "suvli tovuq, tuzlangan bodring\n" +
                                                "va ishtahani ochadi\n" +
                                                "harakat qilib ko'ring\n\n");
                                        System.out.println("9000" + "sum");
                                    }
                                    case 4 -> {
                                        System.out.println("\n\nAchiq tvister\n\n" +
                                                "ta'mi bilan o'ralgan! tender bo'laklari\n" +
                                                "çıtır achchiq yoki tovuq filesi\n" +
                                                "suvli bilan original non tayyorlash\n" +
                                                "salat, pomidor bo'laklari va\n" +
                                                "biz uni nozik sous bilan o'rab oldik\n" +
                                                "bug'doy keki va qovurilgan\n" +
                                                "tushdi mashinasi. bu yerda hammasi barbod bo'ldi\n\n");
                                        System.out.println(15000 + "sum");
                                    }
                                    case 5 -> {
                                        System.out.println("\n\nJudayam shirin va hamyon bob Tvister\n\n");
                                        System.out.println("15000" + "sum");
                                    }
                                    case 6 -> {
                                        System.out.println("\n\nTvister Vadji\n\n" +
                                                "o'ralgan\n" +
                                                "co\n" +
                                                "tatib ko'ring! kartoshka\n" +
                                                "hash jigarrang, pishloq tilim,\n" +
                                                "suvli salat barglari va bo'laklari\n" +
                                                "o'ralgan nozik sousda pomidor\n" +
                                                "bug'doy _keki, qovurilgan\n" +
                                                "tushdi mashinasi.\n" +
                                                "\n" +
                                                "o'ralgan\n" +
                                                "co\n" +
                                                "tatib ko'ring! kartoshka\n" +
                                                "hash jigarrang, pishloq tilim,\n" +
                                                "suvli salat barglari va bo'laklari\n" +
                                                "o'ralgan nozik sousda pomidor\n" +
                                                "bug'doy _keki, qovurilgan\n" +
                                                "tushdi mashinasi\n\n");
                                        System.out.println("15000 so'm");
                                    }
                                    case 7 -> {
                                        System.out.println("\n\ncheeseburger\n\n" +
                                                "baharatlı xantal sousi, ketchup, suvli\n" +
                                                "asl nondagi chiziqlar, piyoz,\n" +
                                                "cheddar pishloq, bug'doy ustida bodring\n" +
                                                "makkajo'xori solingan bulochka.\n" +
                                                "\n" +
                                                "baharatlı xantal sousi, ketchup, suvli\n" +
                                                "asl nondagi chiziqlar, piyoz,\n" +
                                                "cheddar pishloq, bug'doy ustida bodring\n" +
                                                "makkajo'xori solingan bulochka\n\n");
                                        System.out.println(12500 + "sum");
                                    }
                                    case 8 -> {
                                        System.out.println("\n\nDe Lux cheeseburger\n\n\n" +
                                                "baharatlı xantal sousi, ketchup, suvli\n" +
                                                "asl nonda fileto, piyoz, pishloq\n" +
                                                "cheddar, bug'doyli bulochkada bodring\n" +
                                                "makkajo'xori to'plami, yangi salat va\n" +
                                                "pomidor bo'laklari\n\n");
                                        System.out.println(15000 + "so'm");
                                    }
                                    case 10 -> {
                                        System.out.println("\n\nachchiq chefburger\n\n" +
                                                "dan yangi noyob burgerni sinab ko'ring\n" +
                                                "xo'jayin!\n" +
                                                "• achchiq nonli tovuq\n" +
                                                "issiq va achchiq,\n" +
                                                "suvli\n" +
                                                "sutcho'p,\n" +
                                                "achchiq tuzlangan bodring, piyoz,\n" +
                                                "imzo burger sousi va bulochka\n" +
                                                "kunjut. mmmm\n\n");
                                        System.out.println(14000 + "sum");
                                    }
                                    case 11 -> {
                                        System.out.println("\n\nbox master\n\n" +
                                                "to'liq qayta ishga tushirish! kuchli zaryad\n" +
                                                "bizning boks ustamizda energiya! suvli\n" +
                                                "original yoki baharatlı tovuq filesi\n" +
                                                "_non pishirish,\n" +
                                                "qizg'ish\n" +
                                                "tilim\n" +
                                                "pishloq, bo'laklar\n" +
                                                "issiqda pomidor, salat va yumshoq sous\n" +
                                                "tortilla - dinamik va mazali\n\n");
                                        System.out.println("14000" + "sum");
                                    }
                                    case 9 -> {
                                        System.out.println("\n\nchefburger\n\n" +
                                                "dan yangi noyob burgerni sinab ko'ring\n" +
                                                "xo'jayin! suvli tovuq, pomidor, yangi\n" +
                                                "marul, tsezar sousi va mazali bulochka.\n" +
                                                "siz buni hali sinab ko'rmadingiz\n\n");
                                        System.out.println("20000 so'm");
                                    }
                                    case 12 -> {
                                        main(args);
                                    }
                                    default -> {
                                        System.out.println("ERROR404");
                                        main(args);
                                    }
                                }
                            }


                            case 2 -> {
                                System.out.println("\n\n🍗КУРИЦА🍗\n\n");
                                System.out.println("Выбери свою🍗");
                                System.out.println("1.1-Ножка🍗");
                                System.out.println("2.2-Ножки🍗");
                                System.out.println("3.3-Ножки🍗");
                                System.out.println("4.3-Крыла🍗");
                                System.out.println("5.6-крыльев🍗");
                                System.out.println("6.9-крыльев🍗");
                                System.out.println("7.3-Стрипса-Острые🍗");
                                System.out.println("8.3-Стрипса-Оригинальные🍗");
                                System.out.println("9.6-Стрипсов-Острых🍗");
                                System.out.println("10.6-Стрипсов-Оригинальных🍗");
                                System.out.println("11.9-Стрипсов-острых🍗");
                                System.out.println("12.9-Стрисов-Оригинальных🍗");
                                System.out.println("13.Байтсы малые острые🍗");
                                System.out.println("14.Байтся средние острые🍗");
                                System.out.println("15.Байтся большые острые🍗");
                                System.out.println("16.Байтся Терияки🍗");
                                System.out.println("17.Назад⬅️");
                                int chik = s.nextInt();
                                switch (chik) {
                                    case 1 -> {
                                        System.out.println("\n\n1ta tovuq oyog'i\n" +
                                                "eng shirin luqma\n" +
                                                "tovuqlar, bolalikdan sevimli.\n" +
                                                "Endi sizda boshqa mazali taom bor\n" +
                                                "kfc ga borish sababi: tovuq oyoqlari bilan\n" +
                                                "original ta'mi, pishirilgan\n" +
                                                "polkovnikning maxfiy retsepti bo'yicha\n" +
                                                "Sandersning 11 ta o't va ziravorlar.\n" +
                                                "kfc da mazali tovuq\n");
                                        System.out.println(7000 + "sum");
                                    }
                                    case 2 -> {
                                        System.out.println("\n\n2ta tovuq oyochalari\n" +
                                                "eng shirin luqma\n" +
                                                "tovuqlar, bolalikdan sevimli.\n" +
                                                "Endi sizda boshqa mazali taom bor\n" +
                                                "kfc ga borish sababi: tovuq oyoqlari bilan\n" +
                                                "original ta'mi, pishirilgan\n" +
                                                "polkovnikning maxfiy retsepti bo'yicha\n" +
                                                "Sandersning 11 ta o't va ziravorlar.\n" +
                                                "kfc da mazali tovuq\n\n");
                                        System.out.println(14000 + "sum");
                                    }
                                    case 3 -> {
                                        System.out.println("3 ta tovuq oyochalari\n" +
                                                "eng shirin luqma\n" +
                                                "tovuqlar, bolalikdan sevimli.\n" +
                                                "Endi sizda boshqa mazali taom bor\n" +
                                                "kfc ga borish sababi: tovuq oyoqlari bilan\n" +
                                                "original ta'mi, pishirilgan\n" +
                                                "polkovnikning maxfiy retsepti bo'yicha\n" +
                                                "Sandersning 11 ta o't va ziravorlar.\n" +
                                                "kfc da mazali tovuq");
                                        System.out.println(21000 + "sum");
                                    }
                                    case 4 -> {
                                        System.out.println("\n\n3 qanot\n" +
                                                "ichida olov! farishtalardan uzoqda\n" +
                                                "qanotlar*! bizning achchiq tovuq\n" +
                                                "tiniq non bo'laklarida qanotlar\n" +
                                                "issiq ziravorlar - haqiqiy olov!\n" +
                                                "* qanot - bitta-phalanx qismi yoqilgan\n" +
                                                "bir yoki ikkita suyak\n\n");
                                        System.out.println(12000 + "sum");
                                    }
                                    case 5 -> {
                                        System.out.println("\n\n6 qanot\n" +
                                                "ichida olov! farishtalardan uzoqda\n" +
                                                "qanotlari*|\n" +
                                                "bizning keskin\n" +
                                                "•tovuq\n" +
                                                "tiniq non bo'laklarida qanotlar\n" +
                                                "issiq ziravorlar - haqiqiy olov!\n" +
                                                "bitta falanjli\n" +
                                                "qismi ustida\n" +
                                                "bir yoki ikkita suyak\n\n");
                                        System.out.println(24000 + "sum");
                                    }
                                    case 6 -> {
                                        System.out.println("\n\n9 qanot\n" +
                                                "ichida olov! farishtalardan uzoqda\n" +
                                                "qanotlar*!\n" +
                                                "bizning keskin\n" +
                                                "tiniq non bo'laklarida qanotlar\n" +
                                                "issiq ziravorlar - haqiqiy olov!\n" +
                                                "bir falanjli qism\n" +
                                                "bir yoki ikkita suyak\n\n");
                                        System.out.println(33000 + "sum");
                                    }
                                    case 7 -> {
                                        System.out.println("\n\n3 ta achchiq strips\n" +
                                                "faqat mening sevimli lazzatim\n" +
                                                "- va hech narsa\n" +
                                                "ortiqcha. ajoyib yumshoq tovuq\n" +
                                                "fileto biz qo'lda pishiramiz va pishiramiz\n" +
                                                "noyob retsepti bo'lgan restoran\n" +
                                                "polkovnik\n" +
                                                "silliqlash mashinalari.\n" +
                                                "mukammal\n\n");
                                        System.out.println("14000" + "sum");
                                    }
                                    case 8 -> {
                                        System.out.println("\n\n3 ta asl strips\n" +
                                                "faqat mening sevimli lazzatim\n" +
                                                "-\n" +
                                                "va hech narsa\n" +
                                                "ortiqcha. ajoyib yumshoq tovuq\n" +
                                                "fileto biz qo'lda pishiramiz va pishiramiz\n" +
                                                "restoran _noyob retsept bo'yicha\n" +
                                                "polkovnik\n" +
                                                "silliqlash mashinalari.\n" +
                                                "mukammal\n" +
                                                "ta'mi\n\n");
                                        System.out.println("14000 so'm");
                                    }
                                    case 9 -> {
                                        System.out.println("\n\n6 ta achiq strips\n" +
                                                "faqat mening sevimli lazzatim\n" +
                                                "va hech narsa\n" +
                                                "ortiqcha. ajoyib yumshoq tovuq\n" +
                                                "fileto biz qo'lda pishiramiz va pishiramiz\n" +
                                                "noyob retsepti bo'lgan restoran\n" +
                                                "polkovnik\n" +
                                                "silliqlash mashinalari.\n" +
                                                "mukammal\n\n");
                                        System.out.println(28000 + "sum");
                                    }
                                    case 10 -> {
                                        System.out.println("6 ta asl strips\n" +
                                                "original\n" +
                                                "faqat mening sevimli lazzatim\n" +
                                                "_\n" +
                                                "va hech narsa\n" +
                                                "ortiqcha. ajoyib yumshoq tovuq\n" +
                                                "fileto biz qo'lda pishiramiz va pishiramiz\n" +
                                                "noyob retsept bo'yicha\n" +
                                                "polkovnik\n" +
                                                "• silliqlash mashinalari.\n" +
                                                "mukammal");
                                        System.out.println("28000" + "sum");
                                    }
                                    case 13 -> {
                                        System.out.println("\n\nbayts kichik va achiq\n" +
                                                "yangi suvli tovuq bo'laklari\n" +
                                                "b\n" +
                                                "issiq çıtır non bo'laklari quvur\n" +
                                                "ta'mi\n" +
                                                "Uchun\n" +
                                                "hayajon izlovchilar\n\n");
                                        System.out.println(10000 + "sum");
                                    }
                                    case 14 -> {
                                        System.out.println("\n\nbayts o'rtacha achiq\n" +
                                                "yangi suvli tovuq bo'laklari\n" +
                                                "b\n" +
                                                "issiq çıtır non bo'laklari quvur\n" +
                                                "issiq va achchiq. uchun lazzat portlashi\n" +
                                                "hayajon izlovchilar\n\n");
                                        System.out.println(15000 + "sum");
                                    }
                                    case 11 -> {
                                        System.out.println("\n\n9 ta achchiq strips\n" +
                                                "faqat mening sevimli lazzatim\n" +
                                                "-\n" +
                                                "Hech narsa\n" +
                                                "ortiqcha. ajoyib yumshoq tovuq\n" +
                                                "fileto biz qo'lda pishiramiz va pishiramiz\n" +
                                                "noyob retsepti bo'lgan restoran\n" +
                                                "polkovnik\n" +
                                                "silliqlash mashinalari.\n" +
                                                "mukammal\n" +
                                                "ta'mi\n\n");
                                        System.out.println(38000 + "sum");
                                    }
                                    case 12 -> {
                                        System.out.println("\n\n9 ta asl strips\n" +
                                                "original\n" +
                                                "faqat mening sevimli lazzatim\n" +
                                                "va hech narsa\n" +
                                                "ortiqcha. ajoyib yumshoq tovuq\n" +
                                                "fileto biz qo'lda pishiramiz va pishiramiz\n" +
                                                "noyob retsepti bo'lgan restoran\n" +
                                                "polkovnik\n" +
                                                "silliqlash mashinalari.\n" +
                                                "mukammal\n\n");
                                        System.out.println(38000 + "so'm");
                                    }
                                    case 15 -> {
                                        System.out.println("\n\nbayts teriyaki\n" +
                                                "suvli tovuqning oltin bo'laklari\n" +
                                                "sousda kunjut urug'iga sepilgan fileto\n" +
                                                "teriyaki. ta'mi biroz shirin\n" +
                                                "qalin zanjabil bilan\n" +
                                                "asal\n" +
                                                "soya\n" +
                                                "teriyaki\n" +
                                                "kfc tovuq bilan juda mos keladi!\n" +
                                                "17000 so'm\n\n");
                                        System.out.println(25000 + "sum");
                                    }
                                    case 16 -> {
                                        System.out.println("\n\nbayts katta achiq\n" +
                                                "yangi suvli tovuq bo'laklari\n" +
                                                "b\n" +
                                                "issiq çıtır non bo'laklari quvur\n" +
                                                "issiq va achchiq. ta'mning portlashi\n" +
                                                "Uchun\n" +
                                                "hayajon izlovchilar\n\n");
                                        System.out.println(17000 + "sum");
                                    }
                                    case 17 -> {
                                        main(args);
                                    }
                                    default -> {
                                        System.out.println("ERROR404");
                                        main(args);
                                    }
                                }
                            }
                            case 3 -> {
                                System.out.println("\n\n🍿Basketlar🍿\n\n");
                                System.out.println("\n\nOzinikini tanla🍿");
                                System.out.println("1.Pati Basket🍿");
                                System.out.println("2.Star-Basket🍿");
                                System.out.println("3.Basket Duet Achiq🍿");
                                System.out.println("4.Basket Duet Original🍿");
                                System.out.println("5.Basket 16 qanot🍿");
                                System.out.println("6.Basket 25 qanot🍿");
                                System.out.println("7. O'rqaga⬅️");
                                int bas = s.nextInt();
                                switch (bas) {
                                    case 1 -> {
                                        System.out.println("\n\nparti basket\n" +
                                                "super mega soat mexanizmini sinab ko'ring\n" +
                                                "savat\" fc da. tiniq ishtaha\n" +
                                                "kartoshka, 6 dona bayt va pishloq\n" +
                                                "sous - sizga yoqadi\n");
                                        System.out.println(15000);
                                    }
                                    case 3 -> {
                                        System.out.println("\n\nbasket duet achchiq\n" +
                                                "kfc dan dunyoga mashhur xitlar\n" +
                                                "bizning savatimiz! biz siz uchun yig'dik\n" +
                                                "ajoyib kompaniya - suvli bo'laklar\n" +
                                                "tovuq, issiq qanotlar,\n" +
                                                "tender chiziqlar va frantsuz kartoshka.\n" +
                                                "ko'p emas! savatda\n" +
                                                "o'z ichiga oladi: 2 oyoq, 4 tovuq qanoti*, 4\n" +
                                                "issiq va achchiq nonli chiziqlar, 2\n" +
                                                "ori kartoshka 60 g\n" +
                                                "*qanot\n" +
                                                "bir yoki ikkitasida bitta falanks qismi\n" +
                                                "suyaklar\n");
                                        System.out.println(25000 + "sum");
                                    }
                                    case 5 -> {
                                        System.out.println("\n\nbasket 16 qanot\n" +
                                                "savat 16 o'tkir qanotlari *. 16 tovuq\n" +
                                                "qanotlari, 2 frantsuz kartoshkasi 60 g.\n" +
                                                "kayfiyat\n" +
                                                "b\n" +
                                                "•katta format!\n" +
                                                "kfc dan dunyoga mashhur xitlar\n" +
                                                "bizning savatimiz! biz siz uchun yig'dik\n" +
                                                "ajoyib kompaniya - quvurlar issiq\n" +
                                                "qanotlari. ko'p emas! *qanot -\n" +
                                                "bir yoki ikkitasida bitta falanks qismi\n" +
                                                "suyaklar\n");
                                        System.out.println(60000 + "sum");
                                    }
                                    case 2 -> {
                                        System.out.println("\n\nstar-basket\n" +
                                                "barcha kfc hitlari bitta mini-basketda\n" +
                                                "\"star-basket\":\n" +
                                                "1 oyoq, 2 tovuq\n" +
                                                "qanot*, 1 ta srtips (original), 4\n" +
                                                "bayt, 1 kichik kartoshka fri. endi siz\n" +
                                                "darhol sinab ko'rishingiz mumkin\n" +
                                                "tovuq kfc xilma-xilligi va tanlang\n" +
                                                "sevimli formatingiz!\n" +
                                                "*qanot\n" +
                                                "bir yoki ikkitasida bitta falanks qismi\n");
                                        System.out.println(60000 + "so'm");
                                    }
                                    case 4 -> {
                                        System.out.println("\n\nbasket asl duet\n" +
                                                "original\n" +
                                                "kfc dan dunyoga mashhur xitlar\n" +
                                                "bizning savatimiz! biz siz uchun yig'dik\n" +
                                                "ajoyib kompaniya - suvli bo'laklar\n" +
                                                "tovuq, issiq qanotlar,\n" +
                                                "tender chiziqlar va frantsuz kartoshka.\n" +
                                                "ko'p emas! savatda\n" +
                                                "o'z ichiga oladi: 2 oyoq, 4 tovuq qanoti*, 4\n" +
                                                "asl non tayyorlashdagi chiziqlar, 2\n" +
                                                "frantsuz kartoshkasi 60 g.\n" +
                                                "*qanot\n" +
                                                "bir yoki ikkitasida bitta falanks qismi\n");
                                        System.out.println("60000" + "sum");
                                    }
                                    case 6 -> {
                                        System.out.println("\n\nbasket 25 qanot\n" +
                                                "25 o'tkir qanot *. kayfiyatda\n" +
                                                "katta format! dunyoga mashhur\n" +
                                                "savatimizdagi kfc dan xitlar! biz siz uchunmiz\n" +
                                                "ajoyib kompaniya tuzing\n" +
                                                "kuydiradigan o'tkir qanotlari. unchalik emas\n" +
                                                "Bo'lib turadi! * qanot - bitta falanks qismi\n" +
                                                "bir yoki ikkita suyak ustida\n");
                                        System.out.println(80000 + "sum");
                                    }
                                    default -> {
                                        System.out.println("ERROR404");
                                        main(args);
                                    }
                                }
                            }
                            case 4 -> {
                                System.out.println("\n🍟Sneklar🍟\n");
                                System.out.println("\n O'zinikini Tanla🍟\n");
                                System.out.println("1.Kichkina Fri Kartoshkasi🍟");
                                System.out.println("2.Asl Fri kartoshkasi🍟");
                                System.out.println("3.Fri Baskati🍟");
                                System.out.println("4.O'raqaga⬅️");
                                int snek = s.nextInt();
                                switch (snek) {
                                    case 1 -> {
                                        System.out.println("\n\nkichik fri kartoshkasi\n" +
                                                "yanada mazali! bizning ixtisosimizda\n" +
                                                "bo'laklarni biz ko'proq tejadik\n" +
                                                "sevimli frantsuz kartoshkasining ta'mi. U\n" +
                                                "sizga yoqqan tarzda chiqadi\n" +
                                                "-\n" +
                                                "mazali çıtır qobiq bilan va\n" +
                                                "yumshoq,\n" +
                                                "maydalangan\n" +
                                                "o'rtada.\n" +
                                                "sevimli zavq\n");
                                        System.out.println(7000 + "sum");
                                    }
                                    case 2 -> {
                                        System.out.println("\n\nasl kartoshka fri\n" +
                                                "standart\n" +
                                                "yanada mazali! bizning ixtisosimizda\n" +
                                                "bo'laklarni biz ko'proq tejadik\n" +
                                                "sevimli frantsuz kartoshkasining ta'mi. U\n" +
                                                "sizga yoqqan tarzda chiqadi\n" +
                                                "mazali çıtır qobiq bilan va\n" +
                                                "yumshoq, maydalangan markaz.\n" +
                                                "sevimli zavq\n");
                                        System.out.println(11000 + "sum");
                                    }
                                    case 3 -> {
                                        System.out.println("\n\nbasket kartoshkasi\n" +
                                                "yanada mazali! bizning ixtisosimizda\n" +
                                                "bo'laklarni biz ko'proq tejadik\n" +
                                                "sevimli frantsuz kartoshkasining ta'mi. U\n" +
                                                "sizga yoqqan tarzda chiqadi\n" +
                                                "- mazali çıtır po'stlog'i bilan va\n" +
                                                "maydalangan\n" +
                                                "o'rtada.\n" +
                                                "sevimli zavq\n");
                                        System.out.println(15000 + "sum");
                                    }
                                    case 4 -> {
                                        main(args);
                                    }
                                    default -> {
                                        System.out.println("ERROR404");
                                        main(args);
                                    }
                                }
                            }
                            case 5 -> {
                                System.out.println("\n🥗Salatlar🥗\n");
                                System.out.println("O'zinikini tanla 🥗");
                                System.out.println("1.Sezer Layt Salati🥗");
                                System.out.println("2.O'rqaga⬅️");
                                int salat = s.nextInt();
                                switch (salat) {
                                    case 1 -> {
                                        System.out.println("\n\nSezr salatining yorug'ligi\n" +
                                                "Tsezar salatasi - bu eng yumshoq bo'laklar\n" +
                                                "tovuq filesi\n" +
                                                "original\n" +
                                                "nonli, suvli\n" +
                                                "barglari\n" +
                                                "sutcho'p\n" +
                                                "aysberg,\n" +
                                                "Reggianito pishloq, krutonlar\n" +
                                                "Va\n" +
                                                "ajoyib Sezar sousiichida\n");
                                        System.out.println(13000 + "sum");
                                    }
                                    case 2 -> {
                                        main(args);
                                    }
                                    default -> {
                                        System.out.println("ERROR404");
                                        main(args);
                                    }
                                }
                            }
                            case 6 -> {
                                System.out.println("\n🍰Shirinliklar🍰\n");
                                System.out.println("O'zinikini tangla🍰");
                                System.out.println("1.Muzqaymo'q🍨");
                                System.out.println("2.Muzqaymo'q (Летняя Фантизия)qulupnoy bilan🍨🍓");
                                System.out.println("3.Muzqaymo'q (Летняя Фантизия)karanel bilan bilan🍦");
                                System.out.println("4.Muzqaymo'q (Летняя Фантизия)shokolat bilan🍨🍫");
                                System.out.println("5.Muzqaymo'q (Ice-Dream)qulupnoy bilan🍨🍓");
                                System.out.println("6.Muzqaymo'q (Ice-Dream)qulupnoy bilan🍦");
                                System.out.println("7.Muzqaymo'q (Ice-Dream)qulupnoy bilan🍨🍫");
                                System.out.println("8.Cheese cake New York qulipnoy bilan 🍰🍓");
                                System.out.println("9.Cheese cake New York qulipnoy bilan 🍰");
                                System.out.println("10.Cheese cake New York qulipnoy bilan 🍰🍫");
                                System.out.println("11.Tiromisu🍮");
                                System.out.println("12.Maffin-Toffi🧁");
                                System.out.println("13.Pishiriq Malina-Buta mevasi🥐");
                                System.out.println("14.O'rqaga⬅️");
                                int shi = s.nextInt();
                                switch (shi) {
                                    case 1 -> {
                                        System.out.println("Konus muzqaymog'i");
                                        System.out.println(3000 + "sum");
                                    }
                                    case 2 -> {
                                        System.out.println("Yoz <<YOZ FANTAZIYA>> muzqaymog'i");
                                        System.out.println(7000 + "sum");
                                    }
                                    case 3 -> {
                                        System.out.println("Yoz <<YOZ FANTAZIYA>> karameli muzqaymoq");
                                        System.out.println(7000 + "sum");
                                    }
                                    case 4 -> {
                                        System.out.println("Yoz <<YOZ FANTAZIYA>> karameli muzqaymoq");
                                        System.out.println(7000 + "so'm");
                                    }
                                    case 5 -> {
                                        System.out.println("<<MUZLI TUSH>> qulubnayli muzqaymaoq ");
                                        System.out.println(10000 + "sum");
                                    }
                                    case 6 -> {
                                        System.out.println("<<MUZLI TUSH>>  karameli muzqaymoq");
                                        System.out.println(10000 + "sum");
                                    }
                                    case 7 -> {
                                        System.out.println("<<MUZLI TUSH>>  shokoladli muzqaymoq");
                                        System.out.println(10000 + "sum");
                                    }
                                    case 8 -> {
                                        System.out.println("NEW-YORK pishloq qulupnayli chiskeyk");
                                        System.out.println(17000 + "sum");
                                    }
                                    case 9 -> {
                                        System.out.println("NEW-YORK pishloqli chiskeyk");
                                        System.out.println(17000 + "sum");
                                    }
                                    case 10 -> {
                                        System.out.println("NEW-YORK pishloq shokoladli chiskeyk");
                                        System.out.println(17000 + "sum");
                                    }
                                    case 11 -> {
                                        System.out.println("Tiramisu diserti");
                                        System.out.println(12000 + "sum");
                                    }
                                    case 12 -> {
                                        System.out.println("Maffin Toffi diserti");
                                        System.out.println(14000 + "sum");
                                    }
                                    case 13 -> {
                                        System.out.println("Malinali pirog ");
                                        System.out.println(8000 + "sum");
                                    }
                                    case 14 -> {
                                        main(args);
                                    }
                                    default -> {
                                        System.out.println("ERROR404");
                                        main(args);
                                    }

                                }

                            }
                            case 7 -> {
                                System.out.println("🍹Salqin ichimliklar🍹");
                                System.out.println("1.Olmali Sharbat 0.2🍏");
                                System.out.println("2.Apelsinli Sharbat 0.2🍊");
                                System.out.println("3.O'rqaga");
                                int shar = s.nextInt();
                                switch (shar) {
                                    case 1 -> {
                                        System.out.println("O'lmali Sharbat 0.2🍏");
                                        System.out.println(2000 + "sum");
                                    }
                                    case 2 -> {
                                        System.out.println("Apelsinli Sharbat 0.2🍊");
                                        System.out.println("2000" + "sum");
                                    }
                                    case 3 -> {
                                        main(args);
                                    }
                                    default -> {
                                        System.out.println("ERROR404");
                                        main(args);
                                    }
                                }
                            }
                            case 8 -> {
                                System.out.println("\nSouslar🥫\n");
                                System.out.println("Tomat Ketchup🍅");
                                System.out.println("Teriaki sousi ");
                                System.out.println("Shirin va Nordon Chili Sousi");
                                System.out.println("Chesnokli Sous🧄");
                                System.out.println("Asl sir sousi🧀");
                            }
                            case 9 -> {
                                System.out.println("\n\n Lunchboxlar\n");
                                System.out.println("1.5ta 25.000 evasiga");
                                System.out.println("2.5ta 35.000 evasiga");
                                System.out.println("3.5ta 30.000 evasiga");
                                System.out.println("4.5ta 40.000 evasiga");
                                System.out.println("5.O'rqaga⬅️");
                                int lunch = s.nextInt();
                                switch (lunch) {
                                    case 1 -> {
                                        System.out.println("Chesburger,qanotchalar,kartoshka fri,Coca-Cola 0.3l,sous.");
                                        System.out.println(25000 + "sum");
                                    }
                                    case 2 -> {
                                        System.out.println("Chizburger deluks,2ta mini fri,sous,Coca-Cola 0.5l.");
                                        System.out.println(35000 + "sum");
                                    }
                                    case 3 -> {
                                        System.out.println("Boks master achchiq/oddiy,2ta qanotchalar,kichkina fri donachalari,sous,Coca-Cola 0.5l.");
                                        System.out.println(40000 + "sum");
                                    }
                                    case 4 -> {
                                        System.out.println("Tvister achchiq/oddiy,2ta chiriz orginal/achchiq,fransuz kartoshkasidan kichik fri,sous,Coca-Cola 0.4l.");
                                        System.out.println(30000 + "sum");
                                    }
                                    case 5 -> {
                                        main(args);
                                    }
                                    default -> {
                                        System.out.println("ERROR404");
                                        main(args);
                                    }
                                }
                            }
                            default -> {
                                System.out.println("ERROR404");
                                main(args);
                            }


                        }
                    }
                    case 2 -> {
                        System.out.println("KFC Compass\n" +
                                "\uD83D\uDCCD Ташкент, пересечение улиц ‘Фаргона йули’ и ТКАД\n" +
                                "\n" +
                                "—————————————\n" +
                                "\n" +
                                "KFC Darvoza \n" +
                                "\uD83D\uDCCD Ташкент, Шайхонтохурский район, ул. Каратош, 5 А\n" +
                                "\n" +
                                "—————————————\n" +
                                "\n" +
                                "KFC Oazis \n" +
                                "\uD83D\uDCCD Ташкент, Учтепинский район, пересечение ул. Лутфий и Фархадская, м-в Чиланзар 12 квартал, дом 21А.\n" +
                                "\n" +
                                "—————————————\n" +
                                "\n" +
                                "KFC Rossini\n" +
                                "\uD83D\uDCCD Ташкент, Шайхонтохурский район, ул. А.Кодирий, 20\n" +
                                "\n" +
                                "—————————————\n" +
                                "\n" +
                                "KFC Westminster \n" +
                                "\uD83D\uDCCD Ташкент, Яшнабадский район, ул. Истикбол, 17\n" +
                                "\n" +
                                "—————————————\n" +
                                "\n" +
                                "KFC Yunusobod\n" +
                                "\uD83D\uDCCD Ташкент, Юнусобод тумани, Амир Темур кўчаси, 141 (\"Kefayat\" СМ. Мўлжал - Юнусобод деҳқон бозори)\n" +
                                "\n" +
                                "—————————————\n" +
                                "\n" +
                                "KFC Файз\n" +
                                "\uD83D\uDCCD Ташкент, Мирзо-Улугбекский район, ул.Буюк Ипак йули, напротив дома 105\n" +
                                "\n" +
                                "—————————————\n" +
                                "\n" +
                                "KFC Chilanzar \n" +
                                "\uD83D\uDCCD Ташкент, Чиланзарский район, ул.Бунедкор 52/2\n" +
                                "\n" +
                                "\n" +
                                "—————————————\n" +
                                "*Все рестораны работают по времени указанному ниже.\n" +
                                "*По всем вопросам можете обращаться по номеру телефона указанному внизу.\n" +
                                "\n" +
                                "\uD83D\uDD50 10:00 - 23:00\n" +
                                "\n" +
                                "\uD83D\uDCDE +998 (71) 129-70-00");
                    }
                    case 3 -> {
                        System.out.println("kfc oshxonasiga sayohat - bu restoranda taomlar qanday tayyorlanishini o'z\n" +
                                " ko'zingiz bilan ko'rish, tovuq nonini tayyorlashning noyob texnologiyasi va 11 o't va\n" +
                                " ziravorlar sirini o'rganish, gigiena va peshtaxtalarni o'rganish uchun noyob\n" +
                                " imkoniyatdir.");
                        System.out.println("1.Formani toldiridh");
                        System.out.println("2.O'rqaga");
                        int forma = s.nextInt();
                        switch (forma) {
                            case 1 -> {
                                System.out.println("qaysi shaxarda yashaysiz?");
                                System.out.println("1.Toshkent");
                                System.out.println("2.Samarkand");
                                System.out.println("3.Buxoro");
                                System.out.println("4.Xorazm");
                                int shaxar = s.nextInt();
                                switch (shaxar) {
                                    case 1, 2, 3, 4 -> {
                                        System.out.println("Fillial tanlang");
                                        System.out.println("1.KFC Compass");
                                        System.out.println("2.KFC Darvoza");
                                        System.out.println("3.KFC Oazis");
                                        System.out.println("4.KFC Rossini");
                                        System.out.println("5.KFC Westministr");
                                        System.out.println("6.KFC Yunusobod");
                                        System.out.println("7.KFC Fayz");
                                        System.out.println("8.KFC Chilanzar");
                                        System.out.println("9.O'rqaga⬅️");
                                        int fil = s.nextInt();
                                        switch (fil) {
                                            case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                                                System.out.println("Raqamingizni kiriting");
                                                int raqam_f = s.nextInt();
                                                System.out.println("Tez orada bizning menejirimiz siz bilan ulanishadi☺️");
                                            }
                                            default -> {
                                                System.out.println("ERROR404");
                                                main(args);
                                            }
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                main(args);
                            }
                            default -> {
                                System.out.println("ERROR404");
                                main(args);
                            }
                        }
                    }
                    case 4->{
                        System.out.println("Karyera - mutahasislikni chuqur o'rganish,bir faoliyat sohasida bilimlarni uzoqq" +
                                " vaqt to'plash kerak,kimdur biznesmen kimdur dasturchi va hakazo siz kim bo'lishingizdan qattiy nazar" +
                                " o'z kasbingizni sevib o'rganishingiz kerak bolmasam kasbingizga layoqatsiz bo'lib qolasiz va kasbingiz" +
                                " esa sizni sevib boradi,men sizga aytmoqchimanki sevgan kasbingizni ozlashtiring va uni ustida ko'p " +
                                "ishlan 100% kafolat beramanki siz ishingizni ustasi bo'lib ketasiz;HURMAT ILA KFC BOSHLIG'I palkonik <<DEVID SANDERS>>");

                    } }

            }
            case 2 -> {
                System.out.println("YOU TUBE saytimiz: https://www.youtube.com/KFC");

                System.out.println("INTERNET saytimiz:  https://tashkentkfc.me/?gclid=Cj0KCQjw27mhBhC9ARIsAIFsETE8J4N5zY1TD392QcMSjhOgjA1m9p7RTvL7SSM_CtQToGUEDNljqTgaAsBOEALw_wcB ");

                System.out.println("INSTAGRAM saytimiz: https://www.instagram.com/kfcinuzbekistan/");
            }

            case 3 -> {
                System.out.println("Agar bizga qandaydir sikoyatingiz bo'lasa pasttagi raqamlarga yuzlaning. ");

                System.out.println("Bizning aperetor raqami: 0001");

                System.out.println("Biz hamma sovollarga javob berishga harakat qilamiz");


            }

        }
        System.out.println("😊HURMAT ILA KFC😊");
        main(args);
    }
}