# Refactoring `OrdersWriter`

## Źródło
Oryginalny kod źródłowy znajduje się w repozytorium https://github.com/stanlylau/refactoring-kata 

## Aplikacja

W aplikacji znajdują się następujące klasy:
- `Product` - przechowuje informacje o produkcie (`code`, `color`, `size`, `price`, `currency`)
- `Order` - przechowuje informacje o zamówieniu, czyli identyfikator oraz listę produktów
- `Orders` - lista zakupów
- `OrdersWriter` - główna klasa w aplikacji, dokonuje zamiany `Orders` na format JSON
- `OrdersWriterTest` - testy jednostkowe dla klasy `OrdersWriter`

## Uruchomienie testów

Wykonaj polecenie
```
mvn test
```

## Zadania

W zadaniu należy dokonać refaktoryzacji klasy `OrdersWriter` (jak również innych klas):
- wykorzystaj technikę wyodrębniania metody do podziału metody `getContent` na mniejsze elementy
- utwórz odpowiednią klasę zamiast metody `getSizeFor`
- utwórz odpowiednią klasę zamiast metody `getColorFor`
- wykorzystaj typ `BigDecimal` dla pola `price`
- wykorzystaj typ `Currency` dla pola `currency`

