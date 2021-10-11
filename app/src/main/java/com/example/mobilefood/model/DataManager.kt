package com.example.mobilefood.model

/**
 * Data manager class to hold the json data and images stored in Firebase Cloud Storage
 */
object DataManager {
    val listOfFoods = arrayListOf(
        FoodListItem(
            id = 0,
            productName = "Fresh Avocados",
            image = "🥑",
            from = "Spain",
            nutrients = "Vitamin B, Vitamin K",
            quantity = "4 🥑",
            price = "6.50",
            organic = true,
            description = "A ripe avocado yields to gentle pressure when held " +
                    "in the palm of the hand and squeezed. The fruit is not sweet, " +
                    "but distinctly and subtly flavored, with smooth texture. The avocado is popular in vegetarian cuisine as a substitute for meats in sandwiches and salads because of its high fat content. " +
                    "Generally, avocado is served raw, " +
                    "though some cultivars, including the common 'Hass', can be cooked for a short time without becoming bitter. " +
                    "It is used as the base for the Mexican dip known as guacamole, as well as a spread on corn tortillas or toast, served with spices.",
            imageUrl = "https://firebasestorage.googleapis.com/v0/b/eytask-5f36d.appspot.com/o/Second%20tassk%2Favocados_ey.jpeg?alt=media&token=69b89531-84f1-48ca-9d1a-dc51de582ff2"
        ),
        FoodListItem(
            id = 1,
            productName = "Goat and Sheep Cheese",
            image = "🧀",
            from = "Portugal",
            nutrients = "Vitamin A, Calcium",
            quantity = "250g",
            price = "5.00",
            organic = false,
            description = "Creamy and distinct in flavor, goat cheese is a dairy product enjoyed around the world. " +
                    "Goat cheese comes in a wide variety of flavors and textures, from soft and spreadable " +
                    "fresh cheese to salty, crumbly aged cheese. Although it’s made using the same coagulation " +
                    "and separation process as cheese made from cow’s milk, goat cheese differs " +
                    "in nutrient content.",
            imageUrl = "https://firebasestorage.googleapis.com/v0/b/eytask-5f36d.appspot.com/o/Second%20tassk%2Fcheese_ey.jpeg?alt=media&token=9897f311-3554-4e00-a238-d3cc6fc5bf89"
        ),
        FoodListItem(
            id = 2,
            productName = "Apollo Broccoli",
            image = "🥦",
            from = "Portugal",
            nutrients = "Vitamin C, Vitamin K",
            quantity = "3 🥦",
            price = "5.50",
            organic = true,
            description = "Broccoli is known to be a hearty and tasty vegetable which is rich in " +
                    "dozens of nutrients. It is said to pack the most nutritional punch of any vegetable." +
                    " When we think about green vegetables to include in our diet, broccoli is one of the " +
                    "foremost veggies to come to our mind. Broccoli is a cruciferous vegetable " +
                    "and part of the cabbage family, which includes vegetables such as Brussel " +
                    "sprouts and kale. Although the tastes are different, broccoli and " +
                    "these other vegetables are from the same family.",
            imageUrl = "https://firebasestorage.googleapis.com/v0/b/eytask-5f36d.appspot.com/o/Second%20tassk%2Fbrocolli_ey.jpeg?alt=media&token=a5d1787e-2dc3-404a-baae-2a683acf1ee2"
        ),
        FoodListItem(
            id = 3,
            productName = "Baby Carrots",
            image = "🥕",
            from = "France",
            nutrients = "Vitamin A, Vitamin K",
            quantity = "20 🥕",
            price = "3.00",
            organic = true,
            description = "The carrot is a root vegetable that is often claimed to be the perfect " +
                    "health food. It is crunchy, tasty and highly nutritious. Carrots are a " +
                    "particularly good source of beta-carotene, fiber, vitamin K, " +
                    "potassium and antioxidants. Carrots have a number of health benefits. " +
                    "They are a weight loss friendly food and have been linked to lower cholesterol " +
                    "levels and improved eye health.",
            imageUrl = "https://firebasestorage.googleapis.com/v0/b/eytask-5f36d.appspot.com/o/Second%20tassk%2Fcarrotsb_ey.jpeg?alt=media&token=9b455987-570b-42f1-ae83-bbe3759ac299"
        ),
        FoodListItem(
            id = 4,
            productName = "Sweet Corncobs",
            image = "🌽",
            from = "Germany",
            nutrients = "Vitamin C, Magnesium",
            quantity = "2 🌽",
            price = "2.00",
            organic = false,
            description = "Also known as maize, corn is one of the most popular cereal grains in " +
                    "the world. Popcorn and sweet corn are commonly eaten varieties, but refined " +
                    "corn products are also widely consumed, frequently as ingredients in foods. " +
                    "These include tortillas, tortilla chips, polenta, cornmeal, corn flour, corn " +
                    "syrup, and corn oil. Whole-grain corn is as healthy as any cereal grain, rich " +
                    "in fiber and many vitamins, minerals, and antioxidants.",
            imageUrl = "https://firebasestorage.googleapis.com/v0/b/eytask-5f36d.appspot.com/o/Second%20tassk%2Fcorncubs_ey.png?alt=media&token=10c3ed18-a6a4-4331-8d3c-ad68f1c5d3ec"
        )
    )
}