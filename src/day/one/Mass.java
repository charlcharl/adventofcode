package day.one;

class Mass {

    public int enterMass() {
        int[] list = {
                114106, 87170, 133060, 70662, 134140, 125874, 50081, 133117, 100409, 95098, 70251, 134043, 87501, 85034,
                110678, 80615, 64647, 88555, 106387, 143755, 101246, 142348, 92684, 62051, 94894, 65873, 78473, 64042,
                147982, 145898, 85591, 121413, 132163, 94351, 80080, 73554, 106598, 135174, 147951, 132517, 50925,
                115752, 114022, 73448, 50451, 56205, 81474, 90028, 124879, 137452, 91036, 87221, 126590, 130592, 91503,
                148689, 86526, 105924, 52411, 146708, 149280, 52100, 80024, 115412, 91204, 132726, 59837, 129863, 140980,
                109574, 103013, 84105, 138883, 144861, 126708, 140290, 54417, 138154, 125187, 91537, 90338, 61150, 61702,
                95888, 100484, 82115, 122141, 63986, 138234, 54150, 57651, 124570, 88460, 112144, 112334, 119114, 58220,
                143221, 86568, 148706
        };

        int fuelForModule = 0;
        int totalFuel = 0;

        for (Integer fuelAmount : list) {
            System.out.println("fuel amount: " + fuelAmount);
            fuelForModule = fuelCalc(fuelAmount);
            System.out.println("fuel for module: " + fuelForModule);
            totalFuel += fuelForModule;

            while (fuelForModule > 0) {
                int fuelForFuel = fuelCalc(fuelForModule);
                System.out.println("fuel for fuel " + fuelForFuel);

                totalFuel += fuelForFuel;
                System.out.println("total fuel " + totalFuel);

                fuelForModule = fuelForFuel;
                System.out.println("fuel needing fuel " + fuelForModule);
            }
        }
        System.out.println(totalFuel + fuelForModule);
        return totalFuel;
    }

     private int fuelCalc(Integer mass) {
        mass = (mass/3) - 2;
        if (mass > 0) {
            return mass;
        }
        return 0;
    }
}
