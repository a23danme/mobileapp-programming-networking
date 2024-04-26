
# Rapport

Skapade mountain class och RecyclerView i layouten. La även till mountain.xml. Dessas kod var
i majoritet taget av his.se. Skapade sedan en arraylist och la till classen RecycleViewAdapter
som togs av kursens sida.
Build gradle började krångla med fel versioner och ändrades till slut så att det funkade.
Gav internet access. Konstruerade med hjälp av koden från his så att JSON peaks länken kunde 
länkas och la till kod i PostExecute. Gjorde via override toString() att namnen på Mountains visas på appen.
```
// mountain.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="10dp">

    <TextView
        android:id="@+id/title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="18sp"/>

</LinearLayout>

// Grunden av Mountain classen samt overriden till toString
public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(String name, String location, int height) {
        setName(name);
        setLocation(location);
        setHeight(height);
    }

    @Override
    public String toString() {
        return name;
    }

// JSON URL:en
private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";

// PostExecute koden
    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Mountain>>() {}.getType();
        ArrayList<Mountain> listOfMountains = gson.fromJson(json, type);
        items.addAll(listOfMountains);
        adapter.notifyDataSetChanged();
    }
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
