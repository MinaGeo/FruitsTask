package com.example.fruitstask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerapp.FruitAdapter

class MainActivity : AppCompatActivity(){
    private lateinit var recyclerView: RecyclerView
    private lateinit var fruitList : List<Fruit>
    private lateinit var fruitsAdapter: FruitAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView= findViewById(R.id.main_recycler_view)

        val fruitsAdapter = FruitAdapter(getListOfFruits())

        recyclerView.adapter= fruitsAdapter


fruitsAdapter.onItemClick = {
    val intent = Intent(this,FruitDetailedActivity::class.java)

    intent.putExtra("Food",it)

    startActivity(intent)
}

}
    }

    private fun getListOfFruits(): List<Fruit>
    {
        val fruits = mutableListOf<Fruit>()
        fruits.add(Fruit("Apple",R.drawable.apple,"Apples are mainly composed of carbs and water. They're rich in simple sugars, such as fructose, sucrose, and glucose. Despite their high carb and sugar contents, their glycemic index (GI) is low, ranging 29–44 (5). The GI is a measure of how food affects the rise in blood sugar levels after eating."))
        fruits.add(Fruit("Banana",R.drawable.banana,"Bananas are a good source of several vitamins and minerals, especially potassium, vitamin B6, and vitamin C ( 1 ). Potassium. Bananas are a good source of potassium. A diet high in potassium can lower blood pressure in people with elevated levels and benefits heart health ( 6 )."))
        fruits.add(Fruit("Cherry",R.drawable.cherry,"Cherries are low in calories and chock full of fiber, vitamins, minerals, nutrients, and other good-for-you ingredients. You'll get vitamins C, A, and K. Each long-stemmed fruit delivers potassium, magnesium, and calcium too. They also bring antioxidants, like beta-carotene, and the essential nutrient choline."))
        fruits.add(Fruit("Dragon Fruit",R.drawable.dragonfruit,"Dragon fruit is high in vitamin C and other antioxidants, which are good for your immune system. It can boost your iron levels. Iron is important for moving oxygen through your body and giving you energy, and dragon fruit has iron. And the vitamin C in dragon fruit helps your body take in and use the iron."))
        fruits.add(Fruit("Kiwi",R.drawable.kiwi,"By helping to maintain a healthy blood pressure and providing a boost of Vitamin C, the kiwifruit can reduce the risk of stroke and heart disease. Beyond this, kiwi also contains a high level of dietary fiber. Fiber can reduce risk factors for heart disease by lowering LDL or bad cholesterol."))
        fruits.add(Fruit("Orange",R.drawable.orange,"In addition to vitamin C, oranges have other nutrients that keep your body healthy. The fiber in oranges can keep blood sugar levels in check and reduce high cholesterol to prevent cardiovascular disease. Oranges contain approximately 55 milligrams of calcium, or 6% of your daily requirement."))
        fruits.add(Fruit("Peach",R.drawable.peach,"Consumption of fruits like peaches that are rich in vitamin A, are known to offer protection from lung and oral cancers. They contain many vital minerals such as potassium, fluoride and iron. Potassium is an important component of cell and body fluids that help regulate heart rate and blood pressure."))
        fruits.add(Fruit("Pineapple",R.drawable.pineapple,"Pineapples are especially rich in vitamin C and manganese, as well as numerous other vitamins and minerals."))
        fruits.add(Fruit("Strawberry",R.drawable.strawberry,"The tiny strawberry is packed with vitamin C, fiber, antioxidants, and more. The heart-shaped silhouette of the strawberry is the first clue that this fruit is good for you. These potent little packages protect your heart, increase HDL (good) cholesterol, lower your blood pressure, and guard against cancer."))
        fruits.add(Fruit("Pomegranate",R.drawable.pomegrante,"Pomegranates are rich in antioxidants and flavonoids, both of which are known to prevent free radicals from damaging your cells. In some studies, pomegranates show potential to be effective in preventing prostate, breast, lung, and colon cancers."))
        fruits.add(Fruit("Watermelon",R.drawable.watermelon,"Watermelon is rich in an amino acid called citrulline that may help move blood through your body and can lower your blood pressure. Your heart also enjoys the perks of all the lycopene watermelon contains. Studies show that it may lower your risk of heart attacks."))
        fruits.add(Fruit("Mango",R.drawable.mango,"They are a great source of magnesium and potassium, both of which are connected to lower blood pressure and a regular pulse. Furthermore, mangos are the source of a compound known as mangiferin, which early studies suggest may be able to reduce inflammation of the heart. Mangos can help stabilize your digestive system."))
        fruits.add(Fruit("Papaya",R.drawable.papaya,"SPapayas contain high levels of antioxidants vitamin A, vitamin C, and vitamin E. Diets high in antioxidants may reduce the risk of heart disease. The antioxidants prevent the oxidation of cholesterol. When cholesterol oxidizes, it's more likely to create blockages that lead to heart disease."))
        fruits.add(Fruit("Blueberry",R.drawable.blueberries,"Blueberries contain vitamins, minerals, and antioxidants that provide notable health benefits. For example, blueberries are rich in vitamin K, which plays an important role in promoting heart health. The vitamin is also important to bone health and blood clotting."))
        fruits.add(Fruit("Coconut",R.drawable.coconut,"Coconuts are especially high in manganese, which is essential for bone health and the metabolism of carbohydrates, proteins, and cholesterol ( 8 ). They're also rich in copper and iron, which help form red blood cells, as well as selenium, an important antioxidant that protects your cells ( 9 , 10 , 11 )."))
        fruits.add(Fruit("Melon",R.drawable.melon,"Melons are low in sodium, and very low in saturated fat and cholesterol. They are a good source of dietary fiber, vitamin K, potassium, and copper, and a very good source of vitamin C and vitamin B6. Listed below are a few of the most common summer melons, along with nutrition facts for each!"))

        return fruits
    }
