package simple.example.buah;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.buah.model.Hijau;
import simple.example.buah.model.Kuning;

import simple.example.buah.model.Buah;
import simple.example.buah.model.Merah;

public class DataProvider {
    private static List<Buah> buahs = new ArrayList<>();

    private static List<Kuning> intDataKuning(Context ctx) {
        List<Kuning> kunings = new  ArrayList<>();
        kunings.add(new Kuning ("pisang",
                "Pisang adalah nama umum yang diberikan pada tumbuhan terna raksasa berdaun besar memanjang dari suku Musaceae. ",R.drawable.pisangh));
        kunings.add(new Kuning ("lemon",
                "Buah Lemon\n" +
                        "memiliki nama ilmiah Citrus limon. Lemon merupakan buah dengan ukuran terkecil di antara buah lain dalam genus Citrus. Tetapi, jangan melihat dari bentuknya, sebab walau ukurannya kecil, ternyata khasiat lemon sangatlah besar.\n" +
                        "Buah yang konon berasal dari kaki bukit Himalaya, timur laut India ini kemudian tersebar ke seluruh daerah Timur Tengah, Cina, Burma, benua Eropa, Amerika, bahkan juga sampai benua Afrika. Sedangkan di Irak dan Mesir, mulai 700 tahun sebelum Masehi.\n",
                R.drawable.lemon));
        kunings.add (new Kuning ("buahbiwa",
                "Biwa adalah buah rendah kalori, tapi bisa bisa memberikan banyak vitamin dan mineral untuk tubuh kita. Buah ini tinggi karotenoid yang bisa mencegah kerusakan sel dan dapat melindungi kita dari penyakit. Karotenoid juga merupakan bahan baku vitamin A , yang bisa membantu untuk fungsi penglihatan, fungsi kekebalan tubuh, dan pertumbuhan sel.\n" +
                        "Selain itu, biwa mengandung folat dan vitamin B6, yang penting untuk memproduksi energi dan pembentukan sel darah.\n",R.drawable.buahbiwa));
        kunings.add (new Kuning ("kiwi",
                "Kiwi adalah sejenis buah beri yang dapat dimakan dari tanaman merambat berkayu dalam genus Actinidia. Actinidia asli berasal dari Shaanxi, Tiongkok.\n" +
                        "Buah kiwi yang normal berbentuk oval, kira-kira sebesar telur ayam (5–8 cm / 2–3 in dan diameter 4.5–5.5 cm / 1¾–2 ). Buah ini kaya serat, kulit berwarna hijau-kecokelatan dan daging buah berwarna hijau terang atau keemasan dengan biji kecil, hitam, dan bisa dimakan. \n",R.drawable.kiwi));

        return kunings;
    }
    private static List<Hijau> intDataHijau(Context ctx) {
        List<Hijau> hijaus = new ArrayList<> ();
        hijaus.add(new Hijau ("nangka",
                "Nangka diyakini berasal dari India, yakni wilayah Ghats bagian barat, di mana jenis-jenis liarnya masih didapati tumbuh tersebar di hutan hujan di sana. Kini nangka telah menyebar luas di berbagai daerah tropik, terutama di Asia Tenggara, Pohon nangka umumnya berukuran sedang, sampai sekitar 20 m tingginya, walaupun ada yang mencapai 30 meter. Batang bulat silindris, sampai berdiameter sekitar 1 meter. Tajuknya padat dan lebat, melebar dan membulat apabila di tempat terbuka. Seluruh bagian tumbuhan mengeluarkan getah putih pekat apabila dilukai.",R.drawable.nangka));
        hijaus.add(new Hijau ("jujubehijau",
                "Jujube (Ziziphus Jujuba) adalah tanaman bersemak ukuran kecil asal Asia Selatan yang memiliki buah-buahan dengan ukuran yang sama persis seperti kurma, disebut-sebut juga dengan “kurma merah”. Tumbuhan ini memiliki tinggi 5-12 meter.\n" +
                        "\n" +
                        "Buah mudanya berwarna hijau dan akan berubah menjadi kuning atau kemerahan saat sudah matang. Buahnya juga dapat makan dimakan segar, mentah, dimasukan ke dalam teh, bahkan dijadikan jus. Masyarakat Korea Selatan biasanya mengkonsumsi jujube untuk dijadikan sebagai menu sarapan.\n",R.drawable.jujubehijau));
        hijaus.add(new Hijau ("pepayahijau",
                "Pepaya (Carica papaya L.), atau betik adalah tumbuhan yang berasal dari Meksiko bagian selatan dan bagian utara dari Amerika Selatan, dan kini menyebar luas dan banyak ditanam di seluruh daerah tropis untuk diambil buahnya. C. papaya adalah satu-satunya jenis dalam genus Carica. Nama pepaya dalam bahasa Indonesia diambil dari bahasa Belanda, \"papaja\", yang pada gilirannya juga mengambil dari nama bahasa Arawak, \"papaya\". Dalam bahasa Jawa pepaya disebut \"katès\" dan dalam bahasa Sunda \"gedang\".\n",R.drawable.pepayahijau));
        hijaus.add(new Hijau ("sirsak",
                "Sirsak, nangka belanda, atau durian belanda[2] (Annona muricata L.) adalah tumbuhan berguna yang berasal dari Karibia, Amerika Tengah dan Amerika Selatan. Di berbagai daerah Indonesia dikenal sebagai nangka sebrang, nangka landa (Jawa), nangka walanda, sirsak (Sunda), nangka buris, nangkelan (Madura), srikaya jawa (Bali), boh lôna (Aceh), durio ulondro (Nias), durian betawi (Minangkabau), serta jambu landa (di Lampung, \"Nangko Belando\" (Palembang). Penyebutan \"belanda\" dan variasinya menunjukkan bahwa sirsak (dari bahasa Belanda: zuurzak, berarti \"kantung asam\") didatangkan oleh pemerintah kolonial Hindia Belanda ke Nusantara, yaitu pada abad ke-19, meskipun bukan berasal dari Eropa.\n",R.drawable.sirsakhijau));
        return hijaus;
    }
    private static List<Merah> intDataMerah(Context ctx) {
        List<Merah> merahs = new ArrayList<> ();
        merahs.add(new Merah ("delimamerah",
                "Rasulullah SAW memuji delima sebagai penyembuh bagi tubuh. Dalam surah al-An’am ayat ke-99, Allah menyebut buah delima, setelah zaitun, anggur, dan kurma, dan berpesan bahwa “Sesungguhnya pada yang demikian itu ada tanda-tanda (kekuasaan Allah) bagi kaum yang beriman.” Demikian pula pada surah al-An’am ayat 141. Bahkan, dalam surah ar-Rahman ayat 68, Allah mengungkapkan bahwa delima adalah salah satu dari buah-buahan di surga. \n",R.drawable.manggis));
        merahs.add(new Merah ("manggis",
                "Buah manggis adalah salah satu jenis buah yang berasal dari Indonesia. Manggis merupakan buah tropis khas dari Kepulauan Sunda dan Maluku. Selain di Indonesia, buah yang memiliki nama ilmiah Garcinia mangostana ini juga banyak tumbuh dan dibudidayakan di daerah Malaysia, Thailand dan Filipina.\n",R.drawable.manggis));
        merahs.add(new Merah ("rambutan",
                "Rambutan adalah tanaman tropis yang tergolong ke dalam suku lerak-lerakan atau Sapindaceae, berasal dari daerah kepulauan di Asia Tenggara. Kata \"rambutan\" berasal dari bentuk buahnya yang mempunyai kulit menyerupai rambut.\n",R.drawable.rambutan));
        merahs.add(new Merah ("buahnaga",
                "Buah naga (Inggris: Pitaya) adalah buah dari beberapa jenis kaktus dari marga Hylocereus dan Selenicereus. Buah ini berasal dari Meksiko, Amerika Tengah dan Amerika Selatan namun sekarang juga dibudidayakan di negara-negara Asia seperti Taiwan, Vietnam, Filipina, Indonesia dan Malaysia.\n",R.drawable.buahnaga));


        return merahs;
    }



    private static void iniAllBuah(Context ctx) {
        buahs.addAll(intDataKuning (ctx));
        buahs.addAll(intDataHijau (ctx));
        buahs.addAll(intDataMerah (ctx));
    }

    public static List<Buah> getAllBuah(Context ctx) {
        if (buahs.size() == 0) {
            iniAllBuah (ctx);
        }
        return  buahs;
    }

    public static List<Buah> getBuahByTipe(Context ctx, String jenis) {
        List<Buah> buahsByType = new ArrayList<>();
        if (buahs.size() == 0) {
            iniAllBuah (ctx);
        }
        for (Buah h : buahs) {
            if (h.getJenis().equals(jenis)) {
                buahsByType.add(h);
            }
        }
        return buahsByType;
    }

}