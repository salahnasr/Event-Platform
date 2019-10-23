package evpro.edu.esprit.persistance;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity

public class Event implements Serializable {

	String salah;
	private static final long serialVersionUID = 1L;

	public Event() {
		super();
	}
   
}
