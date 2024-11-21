public class ConcentrationCalculator {
    public static void main(String args[]) {
        double live_concentration = Double.parseDouble(args[0]);
        double total_wells = Double.parseDouble(args[1]);
        double amount_of_media_per_well = Double.parseDouble(args[2]); // for example .25 mL per well
        double total_mL = total_wells * amount_of_media_per_well; // (add 3 to round up!!)

        double ideal_conc_per_well = 27; // (in k/ml)

        double vol_of_cells = (ideal_conc_per_well * total_mL) / live_concentration;// (in mL)

        double amount_of_media_for_mix = total_mL - vol_of_cells;
        double amount_of_cell_solution_for_mix = vol_of_cells; // (in mL)

        System.out.println("Amount of media for the mix:" + amount_of_media_for_mix +"mL");
        System.out.println("Amount of cell solution for the mix" + amount_of_cell_solution_for_mix + "liters");
    }

}
