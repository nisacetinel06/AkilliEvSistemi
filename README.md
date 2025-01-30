
İşte Akıllı Ev Sistemi projesi için bir GitHub açıklama metni:

Akıllı Ev Sistemi (Java OOP)
Bu projede, Java Nesne Yönelimli Programlama (OOP) prensipleri kullanarak, bir akıllı ev sistemi tasarlanmıştır. Kullanıcı, evindeki çeşitli cihazları açıp kapatabilir, klima sıcaklığını ayarlayabilir, lamba parlaklık seviyesini değiştirebilir ve güvenlik kamerasını izleyebilir.

Proje Özellikleri:
Cihaz Yönetimi: Akıllı cihazları açıp kapatabilme.
Klima Kontrolü: Sıcaklık ayarlarını yapabilme.
Lamba Kontrolü: Parlaklık seviyesini değiştirme.
Güvenlik Kamerası: Güvenlik kamerasını izleme.
Proje Yapısı:
Bu projede soyut sınıflar ve miras alma (inheritance) kullanarak cihazları modelledik.

Cihaz (Soyut Sınıf): Tüm cihazların ortak özellikleri ve fonksiyonları içerir.
Klima: Sıcaklık ayarlama fonksiyonuna sahip bir cihaz.
Lamba: Parlaklık ayarlama fonksiyonuna sahip bir cihaz.
Güvenlik Kamerası: Canlı video izleme fonksiyonu ile kullanıcıyı güvenlik konusunda bilgilendirir.
Proje Akışı:
Cihazları başlatma: Kullanıcı evdeki cihazları açar.
Cihaz Kontrolü: Kullanıcı her cihazın özelliklerini ayarlayabilir.
Güvenlik İzleme: Kullanıcı güvenlik kamerasının canlı yayınını izleyebilir.
Cihazları Kapatma: Kullanıcı, tüm cihazları kapatabilir.
Proje İçeriği:
1. Cihaz.java
Soyut sınıf olup, tüm cihazların ortak özelliklerini tanımlar. Cihaz açma ve kapama işlemleri burada yapılır.

2. Klima.java
Klima sınıfı, sıcaklık ayarlama fonksiyonu sunar. Cihaz sınıfından türetilmiştir.

3. Lamba.java
Lamba sınıfı, parlaklık ayarlarını yapmaya olanak tanır. Cihaz sınıfından türetilmiştir.

4. GuvenlikKamerasi.java
Güvenlik Kamerası sınıfı, kameranın görüntülenmesini sağlar. Cihaz sınıfından türetilmiştir.

5. Main.java
Projenin çalıştırıldığı ana sınıf. Cihazlar açılır, özellikleri ayarlanır ve en son cihazlar kapatılır.

OOP Kullanımı:
Soyutlama (Abstraction): Cihaz sınıfı üzerinden tüm cihazların ortak özellikleri soyutlandı.
Kalıtım (Inheritance): Klima, Lamba ve GuvenlikKamerasi sınıfları, Cihaz sınıfından türedi.
Kapsülleme (Encapsulation): Her cihazın durum bilgileri gizlendi ve kontrollü şekilde erişildi.
Polimorfizm (Polymorphism): Tüm cihazlar, aynı arayüz üzerinden açılabilir ve kapatılabilir.
