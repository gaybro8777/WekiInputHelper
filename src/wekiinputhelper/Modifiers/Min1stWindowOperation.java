/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekiinputhelper.Modifiers;

import wekiinputhelper.Modifiers.WindowedOperation.Operation;

/**
 *
 * @author rebecca
 */
public class Min1stWindowOperation implements Operation {
    
    @Override
    public double doOperation(double[] vals) {
        double[] fods = computeDifferences(vals);
        
        double min = Double.MAX_VALUE;
        for (int i = 0; i < fods.length; i++) {
            if (fods[i] < min) {
                min = fods[i];
            }
        }
        return min;
    }
    
    private double[] computeDifferences(double[] vals) {
        double[] diffs = new double[vals.length-1];
        for (int i = 1; i < vals.length; i++) {
            diffs[i-1] = vals[i] - vals[i-1];
        }
        return diffs;
    }

    @Override
    public String shortName() {
        return "Min1stDiff";
    }

}
