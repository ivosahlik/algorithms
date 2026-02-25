--- Den 2: Zprávy Rudonosého reaktoru ---
Naštěstí první místo, které chtějí historici prohledat, není daleko od kanceláře hlavního historika.

Zatímco se zdá, že v jaderném reaktoru Rudonosého reaktoru není ani stopy po hlavním historikovi, inženýři k vám
přiběhnou, jakmile vás uvidí. Zřejmě stále mluví o době, kdy byl Rudolf zachráněn
molekulární syntézou z jediného elektronu.

Rychle dodají, že - protože už jste tady - by opravdu ocenili vaši pomoc s analýzou neobvyklých dat
z reaktoru Rudonosého reaktoru. Otočíte se, abyste se podívali, zda na vás historici čekají, ale zdá se, že se již
rozdělili do skupin, které v současné době prohledávají každý kout zařízení. Nabídnete pomoc s neobvyklými daty.

Neobvyklá data (váš vstup do hádanky) se skládají z mnoha hlášení, jedno hlášení na řádek. Každé hlášení je seznam čísel
nazývaných úrovně, které jsou odděleny mezerami. Například:

7 6 4 2 1
1 2 7 8 9
9 7 6 2 1
1 3 2 4 5
8 6 4 4 1
1 3 6 7 9
Tento příklad dat obsahuje šest hlášení, z nichž každé obsahuje pět úrovní.

Inženýři se snaží zjistit, která hlášení jsou bezpečná. Bezpečnostní systémy reaktoru Red-Nosed tolerují pouze
úrovně, které se buď postupně zvyšují, nebo postupně snižují. Zpráva se tedy počítá jako bezpečná pouze tehdy, pokud
platí obě následující podmínky:

Úrovně buď všechny rostou, nebo všechny klesají.
Jakékoli dvě sousední úrovně se liší alespoň o jednu a maximálně o tři.
Ve výše uvedeném příkladu lze hlášení určit jako bezpečné nebo nebezpečné podle těchto pravidel:

7 6 4 2 1: Bezpečné, protože všechny úrovně klesají o 1 nebo 2.
1 2 7 8 9: Nebezpečné, protože 2 7 je nárůst o 5.
9 7 6 2 1: Nebezpečné, protože 6 2 je pokles o 4.
1 3 2 4 5: Nebezpečné, protože 1 3 roste, ale 3 2 klesá.
8 6 4 4 1: Nebezpečné, protože 4 4 není ani nárůst, ani pokles.
1 3 6 7 9: Bezpečné, protože všechny úrovně rostou o 1, 2 nebo 3.

V tomto příkladu jsou tedy 2 hlášení bezpečná.

Analyzujte neobvyklá data od inženýrů. Kolik hlášení je bezpečných?