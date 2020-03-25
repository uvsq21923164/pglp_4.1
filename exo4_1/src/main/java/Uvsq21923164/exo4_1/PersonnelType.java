package Uvsq21923164.exo4_1;

public abstract class PersonnelType {

	abstract public boolean isGroupe();
	
	public String typeString() {
		return (isGroupe() ? "Groupe" : "Personnel");
	}
}
