
# Rapport

Det första som gjordes var att lägga till en ny aktivitet, som döptes till ProfileActivity.
Sedan så la jag till en button widget till den första aktiviteten som skulle starta den andra aktiviteten.
Detta gjordes med koden:
Först så används findViewById för att bestämma vilken knapp som ska gälla.
sedan så sätts en setOnClickListener för att kunna bestämma vad som ska hända när knappen blir tryckt.
Och sedan innanför så skrevs koden Intent intent = new Intent(MainActivity.this, ProfileActivity.class); för att visa vilken sida som ska startas när knappen trycks.
Och sist så skrevs koden startActivity(intent) för att köra aktiviteten.

```
    Button b = findViewById(R.id.signin_button);
    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intent);
        }
    });

```

Efter detta så skulle det läggas till data i en intent bundle som ska skickas från MainActivity till ProfileActivity när knappen trycks.
Detta gjordes först genom att sätta in två intent.putExtra("NAME", "VALUE"); i MainActivity där datan som ska skickas bestäms.
Sedan lades kod in i ProfileActivity för att kunna ta emot och visa datan som skickats.
Först används findViewById för att bestämma vilka av TextView widgetsen som ska visa datan.
Sedan skapas Bundle extras = getIntent().getExtras(); för att ta emot datan.
I if satsen så hämtas datan med Strin name = extras.getString("name"); för att hämta namnet som skickats.
Och sedan int number = extras.getInt("number"); för att hämta numret som skickats.
För att sedan visa upp datan i TextView widgetsen så används koden nameText.setText("Hi! "+name); för att säga hej och sedan visa namnet som skickats.
Och sedan ageText.setText("Your age is: "+number); för att visa upp åldern som skickats.

```
MainActivity:
    Button b = findViewById(R.id.signin_button);
    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "Wilmer");
            intent.putExtra("number", 10);
            startActivity(intent);
        }
    });

ProfileActivity:
    nameText = findViewById(R.id.UserName);
    ageText = findViewById(R.id.Age);

    Bundle extras = getIntent().getExtras();
    if (extras != null) {
        String name = extras.getString("name");
        int number = extras.getInt("number");
        nameText.setText("Hi! "+name);
        ageText.setText("Your age is: "+number);
    }
}
```
