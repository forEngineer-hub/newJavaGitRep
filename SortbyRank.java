package ltd.newbee.mall.newbeemall;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;

import ltd.newbee.mall.newbeemall.entity.Carousel;

public class SortbyRank implements Comparator<Carousel>{

	@Override
	public int compare(Carousel o1, Carousel o2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd h:m");
		Boolean flg = false;
		try {
			flg = sdf.parse(o1.getCarouselUrl()).before(sdf.parse(o2.getCarouselUrl()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return flg ? 1 : -1;
	}

}
