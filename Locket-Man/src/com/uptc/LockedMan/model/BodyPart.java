package com.uptc.LockedMan.model;

public enum BodyPart {
	
	ARM("Copas"), GOLDS("Oros"), SWORDS("Espadas"), COARSES("Bastos");

    private String part;

    private BodyPart(String part) {
    }

    public String getFigure() {
        return part;
    }
	
}
