# ObserverExercise
### Ćwiczenie 2 znajduje się na osobnym branchu o nazwie JDKInterfaces
## Pytania i odpowiedzi
1. W opisanym systemie Producenci i Konsumenci są instancjami różnych klas. Czy istnieje
możliwość stworzenia klasy, która mogłaby występować w obu tych rolach? Jeżeli tak, to jakich zmian wymagałoby to rozwiązanie?
   
   **Wydaje mi się, że udałoby się to osiągnąć poprzez implementację interfejsu lub stworzenie klasy nadrzędnej, zawierającej obydwie klasy.**
2. Jakie zmiany należałoby wprowadzić, aby umożliwić obsługę wielu Magazynów?

   **Należałoby stworzyć klasę nadrzędną lub utworzyć kolekcję.**
3. Jakie powiązania istnieją pomiędzy wszystkimi obiektami w tym systemie? Jaki jest wpływ
Producentów i Konsumentów na siebie nawzajem?
    
    **Pomiędzy Producentami i Konsumentami nie występuje bezpośrednie połączenie, klasy te obserwują obiekt klasy Magazyn.** 
    
