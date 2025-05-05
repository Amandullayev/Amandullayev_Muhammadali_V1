## 1.Thread nima? 
``Thread bu ->`` procces ichida mustaqil ishlovchi kichik mehanizm u bizga parallel ishlashga yordam beradi. 

## 2.Multithreading va Multitaskingni farqi nimada?

``Multitasking bu ->`` Bir nechta dasturlarni parallel ishlashi

``Multithreading bu ->`` bir dastur ichida nechta threadlarning parallel ishlashi;

``Ikkalasining farqi ->`` Multitasking bu bir nechta dasturlar birgalikda ishlashi va Multithread bu o'sha dastur ichidagi mustaqil ishlovchi kichik mehanizm!

## 3.ThreadPool nima?
``Thread pool bu ->`` oldindan yaratib qo'yilgan threadlar to'plami. Thread pool yaratishning 4 xil usuli mavjud bolib bular =>

``1 => ``Executors.newFixedThreadPool(int n) – belgilangan sondagi thread bilan.

``2 => ``Executors.newCachedThreadPool() – kerak bo‘lganda yangi thread yaratadi, ishlatilmagani bo‘shatiladi.

``3 => ``Executors.newSingleThreadExecutor() – faqat bitta thread ishlaydi.

``4 => ``Executors.newScheduledThreadPool(int n) – rejalashtirilgan (schedule qilingan) ishlar uchun.

## 4.Callable va Runnable farqi va qachon nima uchun ishlatilinadi?
``Callable va Runnable farqi =>``
Runnable qiymat qaytarmaydi; Callable qiymat qaytaradi va exception otishi mumkin.

``Nima uchun ishlatilinadi`` 
bularni qachon ishlatamiz? Agar bizga qiymat kerak bolsa Callable agar kerak bo'lmasa Runnable ishlatsak boladi.

## 5.Future nima va qachon ishlatiladi?
``Future =>`` Callable natijasini kelajakda olishga imkon beradi.
## 6.Future va CompetableFuture ning farqi?
Future bloklanadi; CompletableFuture esa asinxron ishlashga va chainingga imkon beradi.

## 7.Volatile non-access modificatori haqida malumot bering. Nima uchun ishlatilinadi.
threadlar o‘zgaruvchining yangilangan qiymatini ko‘rishi uchun ishlatiladi.

## 8.Immutable classlar nima uchun kerak va immutable class yaratishimiz uchun qanday shartlar bajarilishi kerak?

``Immutable classlar nima uchun kerak =>`` bu classlar bizga ma'lumotlarni o'zgartirilishini chekalsh va bu classda meros olishni cheklash uchun kerak boladi

``immutable class yaratishimiz uchun qanday shartlar bajarilishi kerak`` buning uchun class type final va fieldlari ham final boladigan class kerak boladi va bu classda setter bolmaydi biz buni faqat chaqirib ishlatish imkoniyatini beradi chunki o'zgartirish uchun setterlar bo'lmaydi.

## 9.Asynchrone programming nima?

``Asynchrone => ``kod bloklamasdan natija kutmasdan ishlash usuli.

## 10.Atomic classlar qanday algoritim orqali race conditionni oldini oladi? Yoki thread-safe?

## 11.Serialazition/deserialazition nima?

## 12.Serialable/extrenizeble interfacelarining farqlari nima?
``Externalizable Serializable ning bolasi shuni bildm holos``

## 13.ReentrentLock haqida malumot bering.
``ReentrentLock =>`` bu lock qo'yishning mehanik versiyasi bolib unda biz o'zimiz lock qo'yib va ularni o'zimiz ochishimizni ta'minlaydi. ya'ni lock() va unlock() methodlari orqali.

## 14.Logging Nima?
Dasturda hodisalarni yozib borish (masalan, xatoliklar, boshqa ma'lumotlar).

## 15.Daemon thread nima?
``Daemon thread =>`` Bu asosiy threadga aloqador kichik thread bolib. U 2 xil usulda ishlashdan to'xtashi mumkun.

``1 =>`` qachonki o'z ishini tugatsa 

``2 =>`` yoki asosiy thread ishdan to'xtasa  

## 16.Jar file nima?
``?``

## 17.Maven nima?
``?``

## 18.Behavior Parameterization nima?
``?``

## 19.Declarative va Imperative programming nima?
``?``

## 20.Stream nima? Stream va Collection larning farqi nimada?
ma’lumotlar bilan ishlash uchun API; Collection – ma’lumotlar to‘plami.
``Farqi =>`` Stream – ishlov beradi, Collection – saqlaydi.

``Ustoz nimaga ishlamayotganini aniqlay olmadim shuni bir ko'rib beraszda``

``nega qayerda xato borligini ham bilolmayapman shunday bolsa ham run qilmasdan bilganlarimni yozdim ``

