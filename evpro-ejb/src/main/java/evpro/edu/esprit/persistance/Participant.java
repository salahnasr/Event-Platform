package evpro.edu.esprit.persistance;

import evpro.edu.esprit.persistance.User;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Participant
 *
 */
@Entity

public class Participant extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Participant() {
		super();
	}
   
}
