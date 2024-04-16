package ridaz.sl.composebootcamp.data.resource

import androidx.compose.ui.graphics.Color
import ridaz.sl.composebootcamp.R
import ridaz.sl.composebootcamp.data.entity.Explore

object DataResource {
    fun colors(): ArrayList<Color> = arrayListOf(
        Color(33, 33, 33),
        Color(255, 171, 145),
        Color(255, 255, 217, 255),
        Color(250, 250, 250),
        Color(255, 87, 34, 255),
        Color(103, 58, 183, 255),
        Color(81, 164, 255, 255),
        Color(0, 77, 64),
        )

    fun exploreBlogs(): ArrayList<Explore> {
        return arrayListOf(
            Explore(
                title = "33 Best Houseplants Home Pictures for Inspiration",
                description = "If you’re about to beautify your interior with plants, take a look at these 33 Best Houseplants Home Pictures for Inspiration." +
                        "Love indoor plants? Well, you are going to appreciate them more after viewing these 33 House Plants Home Pictures for Inspiration in this article." ,
                image = R.drawable.explore_img_01,
                url = "https://balconygardenweb.com/best-house-plants-home-pictures-for-inspiration/"
            ),
            Explore(
                title = "Modern Indoor Gardening: Decorating with Houseplants",
                description = "Houseplants make the best roommates. That’s not an invitation to debate, it’s an indisputable fact " +
                        "(sorry Scott, the saxophone-playing dorm-mate from college). They’re quiet, hold a warm and welcoming presence, " +
                        "aren’t terribly fussy, and generally clean up after themselves (and the air around them — bonus!)." ,
                image = R.drawable.explore_img_02,
                url = "https://www.article.com/blog/indoor-gardening-decorating-with-houseplants/"
            ),
            Explore(
                title = "Why Indoor Plants Make You Feel Better",
                description = "Houseplants are good for your health — and not just for their visual beauty. Why? They essentially do the " +
                        "opposite of what we do when we breathe: release oxygen and absorb carbon dioxide. This not only freshens up the air, " +
                        "but also eliminates harmful toxins. Extensive research by NASA has revealed that houseplants can remove up to 87 per " +
                        "cent of air toxin in 24 hours. Studies have also proven that indoor plants improve concentration and productivity " +
                        "(by up to 15 percent!), reduce stress levels and boost your mood — making them perfect for not just your home but " +
                        "your work space, too." ,
                image = R.drawable.explore_img_03,
                url = "https://www.nbcnews.com/better/health/indoor-plants-can-instantly-boost-your-health-happiness-ncna781806"
            ),
            Explore(
                title = "How to Display Houseplants: 98 of Our Favorite Plant-Display Ideas",
                description = "I’m a firm believer in the philosophy that one’s home can never have too many plants. They breathe life into any room they’re " +
                        "placed in, and they come in a dizzying array of sizes, shapes, colors, and more. If you are struggling to find new ways to add more " +
                        "plants to your own at-home jungle, you may find some ideas for fitting more flora in below. If you’re just looking to change things " +
                        "up and give your home a new leaf on life, you’ll certainly find the plant displays below inspiring. And if you simply do not want to " +
                        "or cannot literally fit any more plants into your home, you’ll still enjoy perusing through some of the creative, beautiful, weird, " +
                        "and wild ways in which folks have incorporated plant life into their home." ,
                image = R.drawable.explore_img_04,
                url = "https://www.apartmenttherapy.com/how-to-display-houseplants-36607205"
            ),
            Explore(
                title = "7 beautiful interior plants and their virtues for your home",
                description = "Beyond their aesthetic dimension and the simple satisfaction of admiring their natural greenery at home, plants often " +
                        "play a role that is more complex than it seems. Requiring care and attention, they have a wealth of qualities that give so many " +
                        "good reasons to consider them." ,
                image = R.drawable.explore_img_05,
                url = "https://www.vogue.fr/lifestyle-en/article/7-beautiful-interior-plants-and-their-virtues-for-your-home-indoors"
            ),
        )
    }


}