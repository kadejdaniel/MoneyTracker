# Simple Budget Tracker (Java)

Lekka, konsolowa aplikacja w Javie do śledzenia przychodów i wydatków oraz monitorowania salda konta.

---

### Spis Treści

* [Wstęp](#wstęp)
* [Kluczowe Funkcje](#kluczowe-funkcje)
* [Instalacja i Uruchomienie](#instalacja-i-uruchomienie)
* [Użycie](#użycie)
* [Struktura Transakcji](#struktura-transakcji)

---

### Wstęp

Ten projekt implementuje podstawowy system zarządzania finansami osobistymi (Personal Finance Management - PFM) jako aplikację konsolową w języku Java. Umożliwia użytkownikowi rejestrowanie transakcji typu `INCOME` (Przychód) i `EXPENSE` (Wydatek) w różnych walutach i kategoriach.

### Kluczowe Funkcje

* **Śledzenie Salda:** Bieżący podgląd salda konta (`balance`).
* **Rejestracja Transakcji:** Dodawanie przychodów (np. `SALARY`, `INVESTMENT`) i wydatków (np. `GROCERIES`, `RENT`).
* **Obsługa Walut:** Transakcje są rejestrowane z oznaczeniem waluty (`PLN`, `EUR`, `USD`, `JPY`).
* **Historia:** Wyświetlanie listy wszystkich zarejestrowanych transakcji.
* **Walidacja:** Blokowanie wydatków, jeśli saldo jest niewystarczające.



### Instalacja i Uruchomienie

1.  **Sklonuj repozytorium:**
    ```bash
    git clone [https://github.com/TWOJ_USERNAME/NAZWA_TWOJEGO_PROJEKTU.git](https://github.com/TWOJ_USERNAME/NAZWA_TWOJEGO_PROJEKTU.git)
    cd NAZWA_TWOJEGO_PROJEKTU
    ```

2.  **Kompilacja i Uruchomienie:**
    * W większości IDE (np. IntelliJ IDEA, gdzie jest to projekt konsolowy), wystarczy otworzyć projekt i uruchomić główną klasę: `Main.java`.
    * **Z Linii Komend (CLI):**
        ```bash
        # Kompilacja wszystkich plików
        javac *.java

        # Uruchomienie głównej klasy
        java Main
        ```

### Użycie

Po uruchomieniu aplikacji, zobaczysz proste menu konsolowe, obsługiwane za pomocą numerów:
- Dodaj przychod
- Dodaj wydatek
- Pokaz saldo
- Pokaz wszystkie transakcje
- Wyjdz Wybierz:

- **Przykłady transakcji:**

Transakcje są wyświetlane w formacie:
`[DATA] | [TYP] | [KWOTA] [WALUTA] | [KATEGORIA]`

### Struktura Transakcji

Transakcje wykorzystują predefiniowane kategorie i waluty za pomocą typów `enum`:

| Typ | Enum | Przykładowe wartości |
| :--- | :--- | :--- |
| **Typ Transakcji** | `TransactionType` | `INCOME`, `EXPENSE` |
| **Waluty** | `CurrencyCode` | `PLN`, `EUR`, `USD`, `JPY` |
| **Przychody** | `TransactionCategory` | `SALARY`, `BONUS`, `INVESTMENT`, `REFUND`, `GIFT` |
| **Wydatki** | `TransactionCategoryExpense` | `GROCERIES`, `RENT`, `TRANSPORT`, `BILLS`, `ENTERTAINMENT`, itp. |


### Możliwości Rozwoju

W kodzie istnieje wstępnie zdefiniowana klasa `moneyCalc.java`, która sugeruje przyszłe funkcje analityczne, takie jak:

* Średnie wydatki/przychody (dzienne, tygodniowe, miesięczne).
* Analiza, na co idzie najwięcej środków.
