# MoneyTracker (Java)

Lekka, konsolowa aplikacja w Javie do śledzenia przychodów i wydatków oraz monitorowania salda konta.

---

### Spis Treści

* [Wstęp](#wstęp)
* [Kluczowe Funkcje](#kluczowe-funkcje)
* [Struktura Transakcji](#struktura-transakcji)

---

### Wstęp

Ten projekt implementuje podstawowy system zarządzania finansami osobistymi (Personal Finance Management - PFM) jako aplikację konsolową w języku Java. Umożliwia użytkownikowi rejestrowanie transakcji typu `INCOME` (Przychód) i `EXPENSE` (Wydatek) w różnych walutach i kategoriach.

### Kluczowe Funkcje

* **Śledzenie Salda:** Bieżący podgląd salda konta (`balance`) aktualizowany po każdej transakcji.
* **Rejestracja Transakcji:** Dodawanie przychodów (`INCOME`, np. `SALARY`, `INVESTMENT`) oraz wydatków (`EXPENSE`, np. `GROCERIES`, `RENT`).
* **Historia Transakcji:** Wyświetlanie pełnej listy wszystkich zarejestrowanych operacji finansowych.
* **Obsługa Walut:** Rejestrowanie transakcji w walutach (`PLN`, `EUR`, `USD`, `JPY`).
* **Currency Converter:** Wbudowany mechanizm przeliczania walut na `PLN`.
* **Kategorie jako Enumy:** Wykorzystanie typów `enum` do definiowania kategorii przychodów i wydatków oraz walut.
* **Obliczenia Statystyczne:** Obliczanie średnich przychodów oraz średnich wydatków.
* **Walidacja Operacji:** Blokowanie dodania wydatku w przypadku niewystarczającego salda.


### Struktura Transakcji

Transakcje wykorzystują predefiniowane kategorie i waluty za pomocą typów `enum`:

| Typ | Enum | Przykładowe wartości |
| :--- | :--- | :--- |
| **Typ Transakcji** | `TransactionType` | `INCOME`, `EXPENSE` |
| **Waluty** | `CurrencyCode` | `PLN`, `EUR`, `USD`, `JPY` |
| **Przychody** | `TransactionCategory` | `SALARY`, `BONUS`, `INVESTMENT`, `REFUND`, `GIFT` |
| **Wydatki** | `TransactionCategoryExpense` | `GROCERIES`, `RENT`, `TRANSPORT`, `BILLS`, `ENTERTAINMENT`, itp. |


- **Przykłady transakcji:**

Transakcje są wyświetlane w formacie:
`[DATA] | [TYP] | [KWOTA] [WALUTA] | [KATEGORIA]`

### Możliwości Rozwoju

W kodzie istnieje wstępnie zdefiniowana klasa `moneyCalc.java`, która sugeruje przyszłe funkcje analityczne, takie jak:

* Średnie wydatki/przychody (dzienne, tygodniowe, miesięczne).
* Analiza, na co idzie najwięcej środków.
