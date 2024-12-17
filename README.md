# Java ile Depo Otomasyonu Projesi

## Proje Açıklaması
Bu proje, **depo ve bayi yönetimi** için geliştirilmiş bir **JavaFX tabanlı otomasyon sistemidir**. Depo yöneten kullanıcıların ürün ve bayi işlemlerini hızlı, güvenli ve kolay bir şekilde gerçekleştirmesini sağlar. Kullanıcılar, ürün fiyatları ve satış bilgilerine kolayca erişebilir.

---

## Programın Amacı
- **Veri Yönetimi**: 
  - Ürün ve bayi verilerinin pratik şekilde kaydedilip güncellenmesi.  
- **Uyarı Sistemi**: 
  - Gerekli alanlar boş bırakıldığında kullanıcıyı uyarma.  
- **Güvenlik**: 
  - Kullanıcı adı ve şifre ile admin ve personel yetkilendirmesi.  
- **Veri Saklama**: 
  - Tüm veriler .txt dosyalarında güvenli şekilde tutulur.  

---

## Kullanıcı Rolleri
1. **Admin Girişi**:  
   - Ürün ve bayi tablolarına tam erişim.  
   - Verileri ekleme, güncelleme, silme yetkisi.  

2. **Personel Girişi**:  
   - Ürün tablosunda ürün ekleme, düzenleme.  
   - Bayi tablosunu sadece görüntüleme yetkisi.  

---

## Özellikler
- **Giriş Sistemi**:  
   - Admin ve personel girişleri için ayrı şifreler.  
   - Hatalı girişlerde bilgilendirme mesajları.  

- **Ürün İşlemleri**:  
   - Ürün ekleme, silme, güncelleme.  
   - Ürün verilerini tabloya otomatik aktarma ve manuel kaydetme.  

- **Bayi İşlemleri**:  
   - Bayi ekleme, silme, güncelleme (sadece admin yetkisi).  
   - Bayi iletişim bilgileri düzenleme.  

- **Veri Saklama**:  
   - Ürün ve bayi verileri .txt dosyalarında saklanır.  

---

## Sınıflar ve İçerikleri
1. **PrimaryController**:  
   - Login işlemleri (Admin ve personel girişleri).  
2. **AdmingirisController**:  
   - Admin paneli: Ürün ve bayi işlemlerine erişim.  
3. **UrunIslemleriController**:  
   - Ürün ekleme, silme, güncelleme, kaydetme ve bayi işlemlerine geçiş.  
4. **BayiUrunIslemleriController**:  
   - Bayi ekleme, silme, güncelleme, kaydetme ve ürün işlemlerine geçiş.  
5. **PersonelgirisController**:  
   - Personel paneli: Ürün işlemleri ve bayi görüntüleme.  
6. **PersonelUrunListesiDuzenleController**:  
   - Ürün ekleme, güncelleme, görüntüleme yetkisi.  
7. **PersonelBayiListesiGoruntuleController**:  
   - Bayi tablosunu görüntüleme yetkisi.  
8. **tablo.java**:  
   - Ürün bilgilerini tutan sınıf.  
9. **bayi.java**:  
   - Bayi bilgilerini tutan sınıf.  
10. **tablokontrol.java**:  
    - Ürün ve bayi tablolarında işlemleri tanımlayan arayüz.  

---

## Proje Yapısı
src/  
│  
├── controller/  
│   ├── PrimaryController.java  
│   ├── AdmingirisController.java  
│   ├── UrunIslemleriController.java  
│   ├── BayiUrunIslemleriController.java  
│   ├── PersonelgirisController.java  
│   ├── PersonelUrunListesiDuzenleController.java  
│   └── PersonelBayiListesiGoruntuleController.java  
│  
├── model/  
│   ├── bayi.java  
│   └── tablo.java  
│  
├── interface/  
│   └── tablokontrol.java  
│  
├── resources/  
│   └── FXML dosyaları  
│  
└── App.java


---

## Kurulum Adımları
1. **Projeyi Klonlayın**:  
   
bash
   git clone https://github.com/MuratZGunes/Java-ile-Depo-Otomasyonu-Projesi.git

2. **JavaFX SDK Kurulumu**:  
   - JavaFX SDK'yı indirin ve IDE ayarlarından projeye ekleyin.  
3. **IDE'de Açın**:  
   - IntelliJ IDEA, Eclipse veya NetBeans kullanılabilir.  
4. **Projeyi Çalıştırın**:  
   - App.java dosyasını çalıştırarak uygulamayı başlatın.  

---

## UML Diyagramı
Projenin genel yapısını gösteren UML diyagramı:  
![uml](https://github.com/user-attachments/assets/488a6087-54f6-46c9-b0e3-3b4872b0dc7a) 

---

## Gereksinimler
- **Java JDK 11 veya üzeri**  
- **JavaFX SDK**  

---

## Katkıda Bulunma
Projeye katkı sağlamak isterseniz:  
1. Forklayın  
2. Değişikliklerinizi yapın  
3. Pull Request gönderin  

---


## Lisans  
Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için [LICENSE](LICENSE) dosyasına bakabilirsiniz.

---

## İletişim
**Proje Sahibi**: Murat S. Güneş  
- **GitHub**: [MuratZGunes](https://github.com/MuratZGunes)  
- **E-posta**: muratsegunes@gmail.com
