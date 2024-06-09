#http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
#Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
#Tüm yapılacakların üzerini çiz.
#Tüm yapılacakları sil.
#Tüm yapılacakların silindiğini doğrulayın.

@US001
Feature: US001 Todo List

  Scenario: Verify todo list application
    Given go to the url
    When add todo list
      | Kahvaltiyi hazirla     |
      | Bulasiklari yika       |
      | Bebekle ilgilen        |
      | Cocugun odevine yardim |
      | Selenium tekrar et     |
      | uyu                    |
    And cross off all todo items
    And delete all todo items
    Then verify that all todo items have been deleted



