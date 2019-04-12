import com.netcracker.shevko.CatalogApplication;
import com.netcracker.shevko.category.Category;
import com.netcracker.shevko.offer.Offer;
import com.netcracker.shevko.offer.OfferDao;
import com.netcracker.shevko.offer.OfferDaoImpl;
import com.netcracker.shevko.price.Price;
import com.netcracker.shevko.tag.Tag;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TestApplication {

    @Test
    public void createAndReadOneOfferTest() {

        Offer offer = new Offer();

        offer.setPrice(new Price(100));

        List<Offer> offerList = new ArrayList<>();
        offerList.add(offer);
        offer.setCategory(new Category("Книга",offerList));

        Set<Offer> offerSet = new HashSet<>();
        offerSet.add(offer);

        offer.getTags().add(new Tag("Бест",offerSet));

        OfferDao offerDao = new OfferDaoImpl();

        offerDao.create(offer);

        Offer readOffer = offerDao.findById(offer.getId());

        assertNotNull(readOffer);
        assertEquals(offer.toString(), readOffer.toString());
    }
}
