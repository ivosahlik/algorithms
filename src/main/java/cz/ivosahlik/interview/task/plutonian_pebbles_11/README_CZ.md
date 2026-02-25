--- Den 11: Plutonské oblázky ---
Starověká civilizace na Plutu byla známá svou schopností manipulovat s časoprostorem a zatímco historici prozkoumávají
jejich nekonečné chodby, všimli jste si podivné sady kamenů, které popírají fyziku.

Na první pohled vypadají jako normální kameny: jsou uspořádány v dokonale rovné linii a každý kámen má vyryté číslo.

Zvláštní je, že pokaždé, když mrknete, se kameny změní.

Někdy se číslo vyryté na kameni změní. Jindy se kámen může rozdělit na dvě části, což způsobí, že se všechny ostatní
kameny trochu posunou, aby uvolnily místo v jejich dokonale rovné linii.

Při chvíli pozorování zjistíte, že kameny mají konzistentní chování. Pokaždé, když mrknete, se kameny současně změní
podle prvního platného pravidla v tomto seznamu:

Pokud je na kameni vyryto číslo 0, je nahrazeno kamenem s vyrytým číslem 1.
Pokud je na kameni vyryto číslo se sudým počtem číslic, je nahrazeno dvěma kameny. Levá polovina číslic je vyryta na
novém levém kameni a pravá polovina číslic je vyryta na novém pravém kameni. (Nová čísla si neuchovávají další úvodní
nuly: z 1000 by se staly kameny 10 a 0.)
Pokud neplatí žádné z ostatních pravidel, kámen je nahrazen novým kamenem; číslo starého kamene vynásobené číslem 2024
je vyryto na novém kameni.
Bez ohledu na to, jak se kameny mění, jejich pořadí se zachovává a zůstávají na své dokonale rovné linii.

Jak se budou kameny vyvíjet, když na ně budete neustále mrkat? Zapište si číslo vyryté na každém kameni v řadě (váš
vstup do hádanky).

Pokud máte uspořádání pěti kamenů s vyrytými čísly 0 1 10 99 999 a jednou mrknete, kameny se transformují takto:

První kámen, 0, se stane kamenem označeným 1.
Druhý kámen, 1, se vynásobí číslem 2024 a získá se tak číslo 2024.
Třetí kámen, 10, se rozdělí na kámen označený 1 a následně na kámen označený 0.
Čtvrtý kámen, 99, se rozdělí na dva kameny označené 9.
Pátý kámen, 999, je nahrazen kamenem označeným 2021976.
Po jednom mrknutí by se tedy vašich pět kamenů stalo uspořádáním sedmi kamenů s vyrytými čísly 1 2024 1 0 9 9 2021976.

Zde je delší příklad:

Počáteční uspořádání:
125 17

Po 1 mrknutí:
253000 1 7

Po 2 mrknutích:
253 0 2024 14168

Po 3 mrknutích:
512072 1 20 24 28676032

Po 4 mrknutích:
512 72 2024 2 0 2 4 2867 6032

Po 5 mrknutích:
1036288 7 2 20 24 4048 1 4048 8096 28 67 60 32

Po 6 mrknutích:
2097446912 14168 4048 2 0 2 4 40 48 2024 40 48 80 96 2 8 6 7 6 0 3 2
V tomto příkladu byste po šesti mrknutích měli 22 kamenů. Po 25 mrknutích byste měli 55312 kamenů!

Zamyslete se nad uspořádáním kamenů před sebou. Kolik kamenů budete mít po 25 mrknutích?