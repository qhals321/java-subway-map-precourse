package subway.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import subway.error.StationException;

import static org.junit.jupiter.api.Assertions.*;

class StationTest {

    @Test
    public void createStationWithWrongName() throws Exception{
        //given
        String name = "역";
        //when
        Assertions.assertThrows(StationException.class, () -> new Station(name));
        //then
    }

    @Test
    public void createStationWithValidName() throws Exception{
        //given
        String name = "강남역";
        //when
        Station station = new Station(name);
        //then
        Assertions.assertEquals(name, station.getName());
    }

    @Test
    public void unremovableStation() throws Exception{
        //given
        String name = "강남역";
        Station station = new Station(name);
        //when
        station.upLineCount();
        //then
        Assertions.assertFalse(station.isRemovable());
    }

    @Test
    public void removableStation() throws Exception{
        //given
        String name = "강남역";
        Station station = new Station(name);
        //when
        station.upLineCount();
        station.downLineCount();
        //then
        Assertions.assertTrue(station.isRemovable());
    }

}