package com.vaadin.addon.charts.model;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2014 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

/**
 * The name of a symbol to use for the border in {@link ChartType#FLAGS} series.
 */
public enum FlagShape implements ChartEnum {

    CALLOUT("callout"), FLAG("flag"), CIRCLEPIN("circlepin"), SQUAREPIN(
            "squarepin");

    FlagShape(String type) {
        this.type = type;
    }

    private String type;

    @Override
    public String toString() {
        return type;
    }
}
