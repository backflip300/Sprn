

import java.util.ArrayList;

public class RandomNumber {
	int counter = 0;
	ArrayList<Integer> randomList = new ArrayList<Integer>();

	public RandomNumber() {
		randomList.add(1804289383);
		randomList.add(846930886);
		randomList.add(1681692777);
		randomList.add(1714636915);
		randomList.add(1957747793);
		randomList.add(424238335);
		randomList.add(719885386);
		randomList.add(1649760492);
		randomList.add(596516649);
		randomList.add(1189641421);
		randomList.add(1025202362);
		randomList.add(1350490027);
		randomList.add(783368690);
		randomList.add(1102520059);
		randomList.add(2044897763);
		randomList.add(1967513926);
		randomList.add(1365180540);
		randomList.add(1540383426);
		randomList.add(304089172);
		randomList.add(1303455736);
		randomList.add(35005211);
		randomList.add(521595368);
		randomList.add(294702567);
		randomList.add(1726956429);
		randomList.add(336465782);
		randomList.add(861021530);
		randomList.add(278722862);
		randomList.add(233665123);
		randomList.add(2145174067);
		randomList.add(468703135);
		randomList.add(1101513929);
		randomList.add(1801979802);
		randomList.add(1315634022);
		randomList.add(635723058);
		randomList.add(1369133069);
		randomList.add(1125898167);
		randomList.add(1059961393);
		randomList.add(2089018456);
		randomList.add(628175011);
		randomList.add(1656478042);
		randomList.add(1131176229);
		randomList.add(1653377373);
		randomList.add(859484421);
		randomList.add(1914544919);
		randomList.add(608413784);
		randomList.add(756898537);
		randomList.add(1734575198);
		randomList.add(1973594324);
		randomList.add(149798315);
		randomList.add(2038664370);
		randomList.add(1129566413);
		randomList.add(184803526);
		randomList.add(412776091);
		randomList.add(1424268980);
		randomList.add(1911759956);
		randomList.add(749241873);
		randomList.add(137806862);
		randomList.add(42999170);
		randomList.add(982906996);
		randomList.add(135497281);
		randomList.add(511702305);
		randomList.add(2084420925);
		randomList.add(1937477084);
		randomList.add(1827336327);
		randomList.add(572660336);
		randomList.add(1159126505);
		randomList.add(805750846);
		randomList.add(1632621729);
		randomList.add(1100661313);
		randomList.add(1433925857);
		randomList.add(1141616124);
		randomList.add(84353895);
		randomList.add(939819582);
		randomList.add(2001100545);
		randomList.add(1998898814);
		randomList.add(1548233367);
		randomList.add(610515434);
		randomList.add(1585990364);
		randomList.add(1374344043);
		randomList.add(760313750);
		randomList.add(1477171087);
		randomList.add(356426808);
		randomList.add(945117276);
		randomList.add(1889947178);
		randomList.add(1780695788);
		randomList.add(709393584);
		randomList.add(491705403);
		randomList.add(1918502651);
		randomList.add(752392754);
		randomList.add(1474612399);
		randomList.add(2053999932);
		randomList.add(1264095060);
		randomList.add(1411549676);
		randomList.add(1843993368);
		randomList.add(943947739);
		randomList.add(1984210012);
		randomList.add(855636226);
		randomList.add(1749698586);
		randomList.add(1469348094);
		randomList.add(1956297539);
	}
	
	public int getRandom(){
		
		int toGet = randomList.get(counter);
		counter++;
		counter = (counter == randomList.size()) ? 0 : counter ++;
		return toGet;
	}
}
