/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * Conditions of use of the codes for the SettlementDetails field must be
 * pre-agreed between account owner and account servicer.
 */
public class ConstraintSettlementDetailsElementsUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50
	 * SettlementDetails50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsElementsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule#forSettlementDetails68
	 * ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails68}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails50> forSettlementDetails50 = new MMConstraint<SettlementDetails50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsElementsUsageRule";
			definition = "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails68);
			owner_lazy = () -> SettlementDetails50.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails50 obj) throws Exception {
			checkSettlementDetails50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158
	 * SettlementDetails158}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsElementsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails158> forSettlementDetails158 = new MMConstraint<SettlementDetails158>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsElementsUsageRule";
			definition = "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails158.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails158 obj) throws Exception {
			checkSettlementDetails158(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsElementsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule#forSettlementDetails94
	 * ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails94}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule#forSettlementDetails50
	 * ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails50}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails68> forSettlementDetails68 = new MMConstraint<SettlementDetails68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsElementsUsageRule";
			definition = "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails94);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails50;
			owner_lazy = () -> SettlementDetails68.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails68 obj) throws Exception {
			checkSettlementDetails68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83
	 * SettlementDetails83}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsElementsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails83> forSettlementDetails83 = new MMConstraint<SettlementDetails83>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsElementsUsageRule";
			definition = "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails83.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails83 obj) throws Exception {
			checkSettlementDetails83(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138
	 * SettlementDetails138}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsElementsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails138> forSettlementDetails138 = new MMConstraint<SettlementDetails138>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsElementsUsageRule";
			definition = "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails138.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails138 obj) throws Exception {
			checkSettlementDetails138(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113
	 * SettlementDetails113}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsElementsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails113> forSettlementDetails113 = new MMConstraint<SettlementDetails113>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsElementsUsageRule";
			definition = "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails113.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails113 obj) throws Exception {
			checkSettlementDetails113(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsElementsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule#forSettlementDetails122
	 * ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails122}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails146> forSettlementDetails146 = new MMConstraint<SettlementDetails146>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsElementsUsageRule";
			definition = "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails122;
			owner_lazy = () -> SettlementDetails146.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails146 obj) throws Exception {
			checkSettlementDetails146(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122
	 * SettlementDetails122}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsElementsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule#forSettlementDetails146
	 * ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails146}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule#forSettlementDetails94
	 * ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails94}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails122> forSettlementDetails122 = new MMConstraint<SettlementDetails122>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsElementsUsageRule";
			definition = "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails146);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails94;
			owner_lazy = () -> SettlementDetails122.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails122 obj) throws Exception {
			checkSettlementDetails122(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsElementsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule#forSettlementDetails122
	 * ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails122}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule#forSettlementDetails68
	 * ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails68}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails94> forSettlementDetails94 = new MMConstraint<SettlementDetails94>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsElementsUsageRule";
			definition = "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails122);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails68;
			owner_lazy = () -> SettlementDetails94.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails94 obj) throws Exception {
			checkSettlementDetails94(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51
	 * SettlementDetails51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsElementsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails51> forSettlementDetails51 = new MMConstraint<SettlementDetails51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsElementsUsageRule";
			definition = "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails51.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails51 obj) throws Exception {
			checkSettlementDetails51(obj);
		}
	};

	/**
	 * Conditions of use of the codes for the SettlementDetails field must be
	 * pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails50(SettlementDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Conditions of use of the codes for the SettlementDetails field must be
	 * pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails158(SettlementDetails158 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Conditions of use of the codes for the SettlementDetails field must be
	 * pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails68(SettlementDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Conditions of use of the codes for the SettlementDetails field must be
	 * pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails83(SettlementDetails83 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Conditions of use of the codes for the SettlementDetails field must be
	 * pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails138(SettlementDetails138 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Conditions of use of the codes for the SettlementDetails field must be
	 * pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails113(SettlementDetails113 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Conditions of use of the codes for the SettlementDetails field must be
	 * pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails146(SettlementDetails146 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Conditions of use of the codes for the SettlementDetails field must be
	 * pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails122(SettlementDetails122 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Conditions of use of the codes for the SettlementDetails field must be
	 * pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails94(SettlementDetails94 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Conditions of use of the codes for the SettlementDetails field must be
	 * pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails51(SettlementDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}