package com.jordivh.hololive_infoapp

object VtuberData {
    val vtuberDatas: ArrayList<Vtuber>
        get() {
            return arrayListOf<Vtuber>(
                    Vtuber("Tokino Sora", "Tokino Sora is a female Japanese Virtual YouTuber and the founder member of hololive.",
                            "ときのそら", arrayListOf("Sora (そら)", "Tokki~ (とっきー)", "〇〇's Sora (〇〇のそら)", "Sora-chan"), "2017/09/07", "SoraCh. ときのそらチャンネル", "https://www.youtube.com/channel/UCp6993wxpyDPHUpavwDFqgg", "Female", "20 years old", "15 May 2000", "160 cm", "そらとものみんな、元気？ときのそらです！(How are you, all of my Sorafriends? It's Tokino Sora!)", "How's it going, Soratomos! It is Tokino Sora!\n" +
                            "\n" +
                            "Debuting on September 7, 2017, she is the first Virtual Idol of Hololive Production.\n" +
                            "\n" +
                            "She loves singing and horror games, and her dream has been to “hold a live concert at Yokohama Arena” since the very beginning.\n" +
                            "\n" +
                            "She had her major debut at Victor Entertainment in March 2019. On her road to pro idol, she played a role in the TV show “Watanuki-san Chi” while also running a podcast known as “SoraAoto!” She also takes an active role in other genres. On October 6, 2019, she held her own live concert “Dream!”",R.drawable.tokino_sora_list_pic,R.drawable.tokino_sora_detail_pic),
                    Vtuber("Hoshimachi Suisei",
                            "Hoshimachi Suisei (星街すいせい) is a female Japanese Virtual YouTuber associated with hololive.",
                            "星街すいせい",
                            arrayListOf("Sui-chan","Suicopath","Meteor"),
                            "2018/03/22",
                            "Suisei Channel",
                            "https://www.youtube.com/channel/UC5CwaMl1eIgY8h02uZw7u8A",
                            "Female",
                            "18 years old(forever)",
                            "22 March",
                            "160 cm (5'3)","すいちゃんは今日もかわいい！(Sui-chan is cute today!)",
                            "\"It's your shooting star, your diamond in the rough, idol VTuber Hoshimachi Suisei!\"\n" +
                                    "\n" +
                                    "A forever 18 VTuber who deeply loves singing and idols.\n" +
                                    "\n" +
                                    "Her dream is to one day hold a live concert in Tokyo Budokan.",
                            R.drawable.suisei_list_pic,
                            R.drawable.suisei_detail_pic),
                    Vtuber("Shirakami Fubuki",
                            "Shirakami Fubuki (白上フブキ) is a female Japanese Virtual Youtuber associated with hololive, as part of its first generation of VTubers",
                            "白上フブキ",
                            arrayListOf("Buki","Fubuki-chan","FBK","Kurokami Fubuki","FUBUKI the White Fox","Nazo Nazo Kamen","Fox Burger King","Fubuking","Friend"),
                            "2018/06/01",
                            "フブキCh。白上フブキ",
                            "https://www.youtube.com/channel/UCdn5BQ06XqgXoAxIhbqw5Rg",
                            "Female",
                            "18 years old",
                            "5 October",
                            "155 cm","コンコンき〜つね〜 (Kon Kon Kitsune~)",
                            "\"Foxy day to you! I'm Shirakami Fubuki!\"\n" +
                                    "\n" +
                                    "A white haired kemomimi (animal-eared) highschool student. Although she is shy and mostly calm, she likes to talk to people. She would be very happy if you pay attention to her.",
                            R.drawable.fubuki_list_pic,
                            R.drawable.fubuki_detail_pic),
                    Vtuber("Akai Haato",
                            "Akai Haato (赤井はあと), also known by her Haachama (はあちゃま) personality, is a female Japanese Virtual YouTuber associated with hololive, as part of its first generation of VTubers",
                            "赤井はあと",
                            arrayListOf("Haachama (はあちゃま)","Red-kun"),
                            "2018/06/02",
                            "Akaihaato Ch. 赤井はあと",
                            "https://www.youtube.com/channel/UC1CfXB_kRs3C-zaeTG3oGyg",
                            "Female",
                            "19 years old",
                            "10 August",
                            "154 cm","はあちゃまちゃま~ (Haachama-chama~)",
                            "\"Welcome to your rouge awakening! This is Akai Haato!\"\n" +
                                    "\n" +
                                    "A sassy kouhai. She is often prickly, however she manages to demand lots of attention from those with whom she has been getting along well. She loves red ribbons and heart shapes.",
                            R.drawable.haato_list_pic,
                            R.drawable.haato_detail_pic),
                    Vtuber("Inugami Korone",
                            "Inugami Korone (戌神ころね) is a female Japanese Virtual YouTuber associated with hololive, and is a member of the subgroup hololive Gamer",
                            "戌神ころね",
                            arrayListOf("Koro-san","Koronen","Doggo","DOOG","DOOG Slayer","God Dog","Rap Dog"),
                            "2019/04/13",
                            "Korone Ch. 戌神ころね",
                            "https://www.youtube.com/channel/UChAnqc_AY5_I3Px5dig3X1Q",
                            "Female",
                            "90 years old (dog years)",
                            "1 October",
                            "156 cm (5'1\")","ゆび！ゆび！(Finger! Finger!)",
                            "\"G'morning! Fingers! Give me your fingers!!\"\n" +
                                    "\n" +
                                    "The dog from a random bakery. She likes to play games when she has free time while watchdogging.",
                            R.drawable.korone_list_pic,
                            R.drawable.korone_detail_pic),
                    Vtuber("Amane Kanata",
                            "Amane Kanata (天音かなた) is a female Japanese Virtual YouTuber associated with hololive, as part of its fourth generation of VTubers",
                            "天音かなた",
                            arrayListOf("Kanatan","PP Tenshi","Kabaya","Gorilla"),
                            "2019/12/27",
                            "Kanata Ch. Kanata Amane",
                            "https://www.youtube.com/channel/UCZlDXzGoo7d44bwdNObFacg",
                            "Female",
                            "18 years old (angel age)",
                            "22 April",
                            "149 cm","こんかなた~ (Kon-kanata~)",
                            "An angel from the Angelic-Realm Institution. She is now studying how to heal people.\n" +
                                    "\n" +
                                    "To hide her shyness, she pretends to be cool.\n",
                            R.drawable.kanata_list_pic,
                            R.drawable.kanata_detail_pic),
                    Vtuber("Kiryu Coco",
                            "Kiryu Coco (桐生ココ) is a female Japanese Virtual YouTuber associated with hololive, as part of its fourth generation of VTubers",
                            "桐生ココ",
                            arrayListOf("Kaichou (会長)","Coco-chin","Coco-chi"),
                            "2019/12/28",
                            "Coco Ch. 桐生ココ",
                            "https://www.youtube.com/channel/UCS9uQI-jC3DE0L4IpXyvr6w",
                            "Female",
                            "3501 years old",
                            "17 June",
                            "Human form: 180 cm (5'10.8″)\n" +
                                    "Dragon form: 7m (22'11\")","Good morning, motherf***ers!",
                            "A child dragon (3,500 years old is young in dragon years) who is fond of human culture. She traveled from another universe to ours, just to study Japanese in a random language school. Also an honorable and heroic dragon who is filled with justice. She tries really hard to keep her human form.",
                            R.drawable.coco_list_pic,
                            R.drawable.coco_detail_pic),
                    Vtuber("Tsunomaki Watame",
                            "Tsunomaki Watame (角巻わため) is a female Japanese Virtual YouTuber associated with hololive, as part of its fourth generation of VTubers",
                            "角巻わため",
                            arrayListOf("Watame","Watambe-senpai","Sheep","Watamelon"),
                            "2019/12/29",
                            "Watame Ch. 角巻わため",
                            "https://www.youtube.com/channel/UCqm3BQLlJfvkTsX_hvm0UmA",
                            "Female",
                            "4 years old (sheep years)",
                            "6 June",
                            "151 cm","わためは悪くないよねぇ！(Watame did nothing wrong!)",
                            "A sheep bard that goes around everywhere. She loves singing and is fluffy! YES! FLUFFY! Being a herbivore, she loves potato chips.",
                            R.drawable.watame_list_pic,
                            R.drawable.watame_detail_pic),
                    Vtuber("Gawr Gura",
                            "Gawr Gura is an English Virtual YouTuber associated with hololive, as part of its English (EN) branch first generation of VTubers",
                            "がうる・ぐら",
                            arrayListOf("Gura","Apex Predator","Same-chan","City Pop Shark"),
                            "2020/09/13",
                            "Gawr Gura Ch. hololive-EN",
                            "https://www.youtube.com/channel/UCoSrY_IQQVpmIRZ9Xf-y93g",
                            "Female",
                            "between 9,000 and 10,000 years old (has forgotten exact number after ~5,000 years)",
                            "20 June",
                            "141 cm (4'7\")","a",
                            "Gura is a descendant of the Lost City of Atlantis, who swam to Earth while saying \"It's so boring down there LOLOLOL!\" She bought her clothes (and her shark hat) in the human world and she really loves them. In her spare time, she enjoys talking to marine life.\n" +
                                    "\n" +
                                    "Gura is over nine thousand years old, however she has forgotten her exact age some time after reaching five thousand. When asked, she will produce a random number in the nine thousands",
                            R.drawable.gura_list_pic,
                            R.drawable.gura_detail_pic),
                    Vtuber("Amelia Watson",
                            "Watson Amelia is an English Virtual YouTuber associated with hololive, as part of its English (EN) branch first generation of VTubers",
                            "ワトソン・アメリア",
                            arrayListOf("Ame","Amechan"),
                            "2020/09/13",
                            "Watson Amelia Ch. hololive-EN",
                            "https://www.youtube.com/channel/UCyl1z3jo3XHR1riLFKG5UAg",
                            "Female",
                            "-",
                            "6 January",
                            "150 cm (4'11)","Nothing beats a ground pound.",
                            "Amelia heard strange rumors surrounding Hololive online: talking foxes, magical squirrels, superhuman dogs, and more. Soon after beginning her investigation on Hololive, and just out of interest, she decided to become an idol herself! She loves to pass her time training her reflexes with FPS games, and challenging herself with puzzle games. It's elementary, right?",
                            R.drawable.amelia_list_pic,
                            R.drawable.amelia_detail_pic),
                    Vtuber("Ayunda Risu",
                            "Ayunda Risu (アユンダ・リス) is a female Indonesian Virtual YouTuber associated with hololive, as part of its Indonesian (ID) branch first generation of VTubers",
                            "Tupaia Splendidula",
                            arrayListOf("Risu","Ayunda","Alter Risu","Tupaisen","Okakoro Children"),
                            "2020/04/10",
                            "Ayunda Risu Ch. hololive-ID",
                            "https://www.youtube.com/channel/UCOyYb1c43VlX9rc_lT6NKQw",
                            "Female",
                            "17 years old",
                            "15 January",
                            "153 cm (5'0\")","Puru-Puru Ganbari Risu~",
                            "A squirrel girl who comes from the magicial forest.\n" +
                                    "\n" +
                                    "She once lost her way in the human realm, but was then saved by a kind-hearted woman with whom she is now living. She treats this woman as her big sis.\n" +
                                    "\n" +
                                    "She debuted as a VTuber just to repay her.",
                            R.drawable.risu_list_pic,
                            R.drawable.risu_detail_pic),
                    Vtuber("Moona Hoshinova",
                            "Moona Hoshinova (ムーナ・ホシノヴァ) is a female Indonesian Virtual YouTuber associated with hololive, as part of its Indonesian (ID) branch first generation of VTubers",
                            "Moona Hoshinova",
                            arrayListOf("Moona","Mama Moona","Moona-Simpai","NPC Moona"),
                            "2020/04/11",
                            "Moona Hoshinova hololive-ID",
                            "https://www.youtube.com/channel/UCP0BspO_AMEe3aQqqpo89Dg",
                            "Female",
                            "-",
                            "15 February",
                            "165 cm (5'5\")","Hello, Kalian Para Moonafic— ! (Hello, Moonafics!)",
                            "A university student who is also a model and idol.\n" +
                                    "\n" +
                                    "She became a VTuber as she was attracted by the virtual world.\n" +
                                    "\n" +
                                    "She seems to be calm and cool-headed, but scary things are not her cup of tea.",
                            R.drawable.moona_list_pic,
                            R.drawable.moona_detail_pic),
                    Vtuber("Ookami Mio",
                            "Ookami Mio (大神ミオ) is a female Japanese Virtual YouTuber associated with hololive, as part of a group of VTubers inside called as hololive Gamers (ホロライブゲーマーズ)",
                            "大神ミオ",
                            arrayListOf("Mio","Mion","Mio-mama","Kurokami Omi","Miosha"),
                            "2018/12/07",
                            "Mio Channel 大神ミオ",
                            "https://www.youtube.com/channel/UCp-5t9SrOQwXMU7iIjQfARg",
                            "Female",
                            "-",
                            "20 August",
                            "155 cm","こんばんみぉーん！ (Konbanmion!)",
                            "\"Hellooowl! It is Ookami Mio!\"\n" +
                                    "\n" +
                                    "A black haired kemomimi girl who appeared on our radar randomly. She often shows up around shrines. She likes gaming",
                            R.drawable.mio_list_pic,
                            R.drawable.mio_detail_pic),
                    Vtuber("Ninomae Ina'nis",
                            "Ninomae Ina'nis is an English Virtual YouTuber associated with hololive, as part of its English (EN) branch first generation of Vtubers",
                            "一伊那尓栖/にのまえいなにす",
                            arrayListOf("Ina","Tako"),
                            "2020/09/13",
                            "Ninomae Ina'nis Ch. hololive-EN",
                            "https://www.youtube.com/channel/UCMwGHR0BTZuLsmjY_NT5Pwg",
                            "Female",
                            "████ (somebody spilled ink on the page!!)",
                            "20 May",
                            "157 cm (5'2) [with shoes]","Ina ina inaa~~. Tako bout inacent inaff...",
                            "One day, Ina'nis picked up a strange book and then started to gain the power of controlling tentacles. To her, tentacles are just a part in her ordinary life; it has never been a big deal for her. However, her girly mind does want to get them dressed up and stay pretty.\n" +
                                    "\n" +
                                    "After gaining power, she started hearing Ancient Whispers and Revelations. Hence, she began her VTuber activities to deliver random sanity checks on humanity, as an ordinary girl.",
                            R.drawable.ina_list_pic,
                            R.drawable.ina_detail_pic),
                    Vtuber("Tokoyami Towa",
                            "Tokoyami Towa (常闇トワ) is a female Japanese Virtual YouTuber associated with hololive, as part of its fourth generation of VTubers",
                            "常闇トワ",
                            arrayListOf("Towa-sama","Towa Maji-Tenshi","Towa Maji-Daitenshi","Towa Chou Akuma/Towa Cute Angel","∞/∞ETERNAL∞/∞ Devil"),
                            "2020/01/03",
                            "Towa Ch. 常闇トワ",
                            "https://www.youtube.com/channel/UC1uv2Oq6kNxgATlCiez59hw",
                            "Female",
                            "17 years old",
                            "8 August",
                            "150 cm","おはやっぴー！(Ohayappi!)",
                            "In order to become an archdemon, she joined the human society for further studies.\n" +
                                    "\n" +
                                    "She should be studying but is now addicted to gaming. She realized that the method commonly known as “streaming” is also a way to communicate with humans. She is now in the “trial and error” process.",
                            R.drawable.towa_list_pic,
                            R.drawable.towa_detail_pic),




                    )
        }


}