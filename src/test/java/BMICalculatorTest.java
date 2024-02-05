import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    BMICalculator myBMI;
    BMICalculator yourBMI;

    String name = "Kevin";
    String nachname = "Horejs";
    int höhe = 175;
    double gewicht = 90.0;
    char gender = 'm';

    String your_name = "Melanie";
    String your_nachname = "Horejs";
    int your_höhe = 170;
    double your_gewicht = 70.0;
    char your_gender = 'w';

    @BeforeEach
    void createMyBMI(){
        myBMI = new BMICalculator(
                name,
                nachname,
                höhe,
                gewicht,
                gender);
        yourBMI = new BMICalculator(
                your_name,
                your_nachname,
                your_höhe,
                your_gewicht,
                your_gender);
    }
    @Test
    void testKonstruktor(){
        Assertions.assertEquals(name,myBMI.getFirstname());
        Assertions.assertEquals(nachname,myBMI.getLastname());
        Assertions.assertEquals(höhe,myBMI.getBodyHeight());
        Assertions.assertEquals(gewicht,myBMI.getBodyWeight());
        Assertions.assertEquals(gender,myBMI.getGender());

        Assertions.assertEquals(your_name,yourBMI.getFirstname());
        Assertions.assertEquals(your_nachname,yourBMI.getLastname());
        Assertions.assertEquals(your_höhe,yourBMI.getBodyHeight());
        Assertions.assertEquals(your_gewicht,yourBMI.getBodyWeight());
        Assertions.assertEquals(your_gender,yourBMI.getGender());
    }


}