import buildings.Comercial;
import buildings.Industrial;
import buildings.Residential;
import services.FastService;
import services.LuxuriousService;
import services.NormalService;
import weather.DrySeason;
import weather.NormalSeason;
import weather.RainSeason;

public class Calculate {
    public void calculate(int buildType,int weather, int serviceType, int floors, float sqMeters) {
        float time;
        float price;
        switch(buildType){
            case 2:
                //Residential
                Residential resi = new Residential(floors, sqMeters);
                time = resi.calcTime();
                price = resi.calculatePrice();
                break;
            case 3:
                //Industrial
                Industrial indu = new Industrial(floors, sqMeters);
                time = indu.calcTime();
                price = indu.calculatePrice();
                break;
            default:
                //Comercial
                Comercial comer = new Comercial(floors,sqMeters);
                time = comer.calcTime();
                price = comer.calculatePrice();
        }
        switch(weather){
            case 2:
                //Dry Season
                DrySeason dryS = new DrySeason();
                time = dryS.calcTime(time);
                price = dryS.calcPrice(price);
                break;
            case 3:
                //Rainy Season
                RainSeason wetS = new RainSeason();
                time = wetS.calcTime(time);
                price = wetS.calcPrice(price);
                break;
            default:
                //Normal Season
                NormalSeason normS = new NormalSeason();
                time = normS.calcTime(time);
                price = normS.calcPrice(price);
        }
        switch(serviceType){
            case 2:
                //Fast Service
                FastService fastS = new FastService();
                time = fastS.calcTime(time);
                price = fastS.calcPrice(price);
                break;
            case 3:
                //Luxurious Service
                LuxuriousService luxS = new LuxuriousService();
                time = luxS.calcTime(time);
                price = luxS.calcPrice(price);
                break;
            default:
                //Normal Service
                NormalService normS = new NormalService();
                time = normS.calcTime(time);
                price = normS.calcPrice(price);
        }
        System.out.println("----------------------------------------------");
        System.out.println("The price of building is: $" + price);
        System.out.println("The time it will take is: " + time +" days");
        System.out.println("----------------------------------------------");
    }
}
