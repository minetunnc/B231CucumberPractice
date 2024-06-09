# Kullanici Medunna web sitesine gider
# Kullanici simgesine tiklar
# Giris Yap secenegine tiklar
# Kullanici adi alanina kullanici adini girer
# Sifre alanina sifreyi girer
# Girisi Yap dugmesine tiklar
# Ogeler ve Basliklar secenegine tiklar
# Oda secenegine tiklar
# Yeni Oda Olustur dugmesine tikar
# Oda Numarasi alanina oda numarasini girer
# Oda Turu menusunden SUIT secer
# Durum onay kutusunu isaretler
# Fiyat alanina fiyat girer
# Aciklama alanina aciklama girer
# Kaydet dugmesine tiklar
#  Bir odanin basarili bir sekilde olusturuldugunu dogrular
# Uygulamayi kapatir

  @US002
Feature: US002 Creating a room on medunna

  Scenario Outline: TC01 Positive scenario
    Given the user navigates to the "medunnaUrl" website
    When the user clicks on the user icon
    And clicks on the sign in option
    And enters the username in the username field
    And enters the password in the password field
    And clicks on the sign in button
    And clicks on the Items and Titles option
    And clicks on the room option
    And click on the Create a new room button
    And enters a room number in the room number field
    And selects SUITE from the room type menu
    And clicks on the status checkbox
    And enters "<price>" in the Price field
    And enters a "<description>" in the Description field
    And clicks on the save button
    Then verify A new Room is created succesfully
    And closes the application
    Examples:
      | price | description                        |
      | 100   | Created for room validation via ui |

















