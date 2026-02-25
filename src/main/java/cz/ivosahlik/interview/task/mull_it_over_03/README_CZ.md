--- Den 3: Promýšlení ---
„Naše počítače mají problémy, takže nemám tušení, jestli máme nějaké Hlavní historiky skladem! Klidně se ale podívejte
do skladu,“ říká mírně znepokojený prodavač v půjčovně sáňkářských drah North Pole. Historici se vydávají ven, aby se
podívali.

Prodavač se k vám otočí. „Je nějaká šance, že byste viděl, proč mají naše počítače zase problémy?“

Počítač se zřejmě pokouší spustit program, ale jeho paměť (váš vstup do hádanky) je poškozená. Všechny instrukce jsou
zpřeházené!

Zdá se, že cílem programu je jen vynásobit nějaká čísla. Dělá to pomocí instrukcí jako mul(X,Y), kde X a Y jsou čísla o
1 až 3 číslicích. Například mul(44,46) vynásobí 44 číslem 46 a dostane výsledek 2024. Podobně mul(123,4) by vynásobilo
123 číslem 4.

Protože však byla paměť programu poškozena, existuje také mnoho neplatných znaků, které by měly být ignorovány, i když
vypadají jako součást instrukce mul. Sekvence jako mul(4*, mul(6,9!, ?(12,34) nebo mul (2, 4) nic nedělají.

Uvažte například následující část poškozené paměti:

xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))
Pouze čtyři zvýrazněné části jsou skutečné instrukce mul. Sečtením výsledků každé instrukce získáte 161 (2 * 4 + 5 * 5 + 11 * 8 + 8 * 5).

Prohledejte poškozenou paměť a vyhledejte nepoškozené instrukce mul. Co získáte, když sečtete všechny výsledky násobení?