package aus;

import core.Assignment;
import core.BinaryConstraint;
import core.Variable;

public class PrecedenceConstraint extends BinaryConstraint {

	public PrecedenceConstraint(Variable v1, Variable v2) {
		super(v1, v2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSatisfiedWith(Assignment assignment) {
		// TODO Auto-generated method stub
		return false;
	}

}
