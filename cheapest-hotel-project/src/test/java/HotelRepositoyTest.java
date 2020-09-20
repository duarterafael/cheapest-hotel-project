import java.util.List;

import org.junit.Test;

import model.Hotel;
import repository.HotelRepository;

public class HotelRepositoyTest {
   @Test
   public void testGetHotels() {
       List<Hotel> hotels = HotelRepository.GetInstance().getHotels();
       HotelTest.assertHotelFields("Parque das flores", 3, 110, 80, 90, 80, hotels.get(0));
       HotelTest.assertHotelFields("Jardim Botânico", 4, 160, 110, 60, 50, hotels.get(1));
       HotelTest.assertHotelFields("Mar Atlântico", 5, 220, 100, 150, 40, hotels.get(2));
   }
}
